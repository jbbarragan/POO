import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Dinamicos {
    private ArrayList<ArrayList<String>> datos;

    public Dinamicos(String filePath) {
        datos = new ArrayList<>();
        if (!archivoEstaFormateado(filePath)) {
            limpiarArchivo(filePath);
        }
        leerCSV(filePath);
    }

    private boolean archivoEstaFormateado(String filePath) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String linea = br.readLine();
            return linea != null && linea.contains("\t");
        } catch (IOException e) {
            System.err.println("Error al verificar el formato del archivo: " + e.getMessage());
            return false;
        }
    }

    private void limpiarArchivo(String filePath) {
        File inputFile = new File(filePath);
        File tempFile = new File(filePath + ".tmp");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), StandardCharsets.UTF_8));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tempFile), StandardCharsets.UTF_8))) {
            
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (!linea.isEmpty()) {
                    // Reemplazar "texto,texto" sin espacio intermedio por "texto\ttexto"
                    linea = linea.replaceAll("(?<=\\w),(?=\\w)", "\t");
                    bw.write(linea.replaceAll("\\r?\\n", " "));
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            System.err.println("Error al limpiar el archivo: " + e.getMessage());
            return;
        }

        // Reemplazar el archivo original con el limpio
        if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
            System.err.println("Error al reemplazar el archivo original");
        }
    }

    private void leerCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String linea;
            boolean primeraLinea = true;

            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) continue;

                List<String> valores = Arrays.asList(linea.split("\t"));

                if (primeraLinea) {
                    for (String valore : valores) {
                        datos.add(new ArrayList<>());
                    }
                    primeraLinea = false;
                }

                while (valores.size() < datos.size()) {
                    valores.add("");
                }

                for (int i = 0; i < valores.size(); i++) {
                    datos.get(i).add(valores.get(i));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + filePath);
        }
    }

    public void mostrarDatos() {
        for (int i = 0; i < datos.size(); i++) {
            System.out.println("Columna " + i + ": " + datos.get(i));
        }
    }

    public ArrayList<ArrayList<String>> getDatos() {
        return datos;
    }
}
