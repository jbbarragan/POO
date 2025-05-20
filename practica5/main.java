import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double longitud1, longitud2;

        System.out.println("Elige una figura (cilindro, esfera, cubo): ");
        String name = br.readLine().toLowerCase();

        Figura figura = null;

        switch (name) {
            case "cilindro" -> {
                figura = new Cilindro();
                longitud1 = figura.obtenerValorPositivo("Dame la altura: ");
                longitud2 = figura.obtenerValorPositivo("Dame el radio: ");
                ((Cilindro) figura).setAltura(longitud1);
                ((Cilindro) figura).setRadio(longitud2);
            }

            case "esfera" -> {
                figura = new Esfera();
                longitud1 = figura.obtenerValorPositivo("Dame el radio: ");
                ((Esfera) figura).setRadio(longitud1);
            }

            case "cubo" -> {
                figura = new Cubo();
                longitud1 = figura.obtenerValorPositivo("Dame la longitud del lado: ");
                ((Cubo) figura).setLado(longitud1);
            }

            default -> {
                System.out.println("Figura no reconocida.");
                return;
            }
        }

        System.out.println();
        figura.mostrarInfo();

        figura.tipo(figura);
    }
}
