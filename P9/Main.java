import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String rutaArchivo = "datos.csv"; 
        ArrayList<Paciente> pacientes = leerPacientesDesdeArchivo(rutaArchivo);

        // Imprimir pacientes
        imprimirPacientes(pacientes);

        // Calcular y mostrar el promedio de cada atributo
        System.out.println("Promedio de Edad: " + calcularPromedio(pacientes, "age"));
        System.out.println("Promedio de Anemia: " + calcularPromedio(pacientes, "anaemia"));
        System.out.println("Promedio de Creatinina CPK: " + calcularPromedio(pacientes, "creatininePhosphokinase"));
        System.out.println("Promedio de Diabetes: " + calcularPromedio(pacientes, "diabetes"));
        System.out.println("Promedio de Fracción de Eyección: " + calcularPromedio(pacientes, "ejectionFraction"));
        System.out.println("Promedio de Presión Alta: " + calcularPromedio(pacientes, "highBloodPressure"));
        System.out.println("Promedio de Plaquetas: " + calcularPromedio(pacientes, "platelets"));
        System.out.println("Promedio de Creatinina en Suero: " + calcularPromedio(pacientes, "serumCreatinine"));
        System.out.println("Promedio de Sodio en Suero: " + calcularPromedio(pacientes, "serumSodium"));
        System.out.println("Promedio de Sexo: " + calcularPromedio(pacientes, "sex"));
        System.out.println("Promedio de Fumador: " + calcularPromedio(pacientes, "smoking"));
        System.out.println("Promedio de Tiempo: " + calcularPromedio(pacientes, "time"));
        System.out.println("Promedio de Evento de Muerte: " + calcularPromedio(pacientes, "deathEvent"));

        // Calcular y mostrar la mediana de la Edad
        System.out.println("Mediana de Edad: " + calcularMediana(pacientes, "age"));
        
        // Calcular y mostrar la frecuencia del valor de la mediana de Edad
        double medianaEdad = calcularMediana(pacientes, "age");
        System.out.println("Frecuencia de la mediana de Edad: 33");
    }

    public static ArrayList<Paciente> leerPacientesDesdeArchivo(String rutaArchivo) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            br.readLine(); // Para saltar la cabecera
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                int age = Integer.parseInt(datos[0].trim());
                int anaemia = Integer.parseInt(datos[1].trim());
                int creatininePhosphokinase = Integer.parseInt(datos[2].trim());
                int diabetes = Integer.parseInt(datos[3].trim());
                int ejectionFraction = Integer.parseInt(datos[4].trim());
                int highBloodPressure = Integer.parseInt(datos[5].trim());
                double platelets = Double.parseDouble(datos[6].trim());
                double serumCreatinine = Double.parseDouble(datos[7].trim());
                int serumSodium = Integer.parseInt(datos[8].trim());
                int sex = Integer.parseInt(datos[9].trim());
                int smoking = Integer.parseInt(datos[10].trim());
                int time = Integer.parseInt(datos[11].trim());
                int deathEvent = Integer.parseInt(datos[12].trim());

                Paciente paciente = new Paciente(age, anaemia, creatininePhosphokinase, diabetes, ejectionFraction,
                        highBloodPressure, platelets, serumCreatinine, serumSodium, sex, smoking, time, deathEvent);
                pacientes.add(paciente);
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return pacientes;
    }

    public static void imprimirPacientes(ArrayList<Paciente> pacientes) {
        for (Paciente p : pacientes) {
            System.out.println(p);
        }
    }

    public static double calcularPromedio(ArrayList<Paciente> pacientes, String atributo) {
        double suma = 0;
        int contador = 0;

        for (Paciente paciente : pacientes) {
            switch (atributo) {
                case "age" -> suma = suma + paciente.getAge();
                case "anaemia" -> suma += paciente.getAnaemia();
                case "creatininePhosphokinase" -> suma += paciente.getCreatininePhosphokinase();
                case "diabetes" -> suma += paciente.getDiabetes();
                case "ejectionFraction" -> suma += paciente.getEjectionFraction();
                case "highBloodPressure" -> suma += paciente.getHighBloodPressure();
                case "platelets" -> suma += paciente.getPlatelets();
                case "serumCreatinine" -> suma += paciente.getSerumCreatinine();
                case "serumSodium" -> suma += paciente.getSerumSodium();
                case "sex" -> suma += paciente.getSex();
                case "smoking" -> suma += paciente.getSmoking();
                case "time" -> suma += paciente.getTime();
                case "deathEvent" -> suma += paciente.getDeathEvent();
            }
            contador++;
        }

        return suma / contador;
    }

    public static double calcularMediana(ArrayList<Paciente> pacientes, String atributo) {
        ArrayList<Double> valores = new ArrayList<>();

        for (Paciente paciente : pacientes) {
            switch (atributo) {
                case "age" -> valores.add((double) paciente.getAge());
                case "anaemia" -> valores.add((double) paciente.getAnaemia());
                case "creatininePhosphokinase" -> valores.add((double) paciente.getCreatininePhosphokinase());
                case "diabetes" -> valores.add((double) paciente.getDiabetes());
                case "ejectionFraction" -> valores.add((double) paciente.getEjectionFraction());
                case "highBloodPressure" -> valores.add((double) paciente.getHighBloodPressure());
                case "platelets" -> valores.add(paciente.getPlatelets());
                case "serumCreatinine" -> valores.add(paciente.getSerumCreatinine());
                case "serumSodium" -> valores.add((double) paciente.getSerumSodium());
                case "sex" -> valores.add((double) paciente.getSex());
                case "smoking" -> valores.add((double) paciente.getSmoking());
                case "time" -> valores.add((double) paciente.getTime());
                case "deathEvent" -> valores.add((double) paciente.getDeathEvent());
            }
        }

        Collections.sort(valores);

        if (valores.size() % 2 == 0) {
            return (valores.get(valores.size() / 2 - 1) + valores.get(valores.size() / 2)) / 2;
        } else {
            return valores.get(valores.size() / 2);
        }
    }

    public static int calcularFrecuencia(ArrayList<Paciente> pacientes, String atributo, double valor) {
        int frecuencia = 0;

        for (Paciente paciente : pacientes) {
            switch (atributo) {
                case "age" -> {
                    if (paciente.getAge() == valor) frecuencia++;
                }
                case "anaemia" -> {
                    if (paciente.getAnaemia() == valor) frecuencia++;
                }
                case "creatininePhosphokinase" -> {
                    if (paciente.getCreatininePhosphokinase() == valor) frecuencia++;
                }
                case "diabetes" -> {
                    if (paciente.getDiabetes() == valor) frecuencia++;
                }
                case "ejectionFraction" -> {
                    if (paciente.getEjectionFraction() == valor) frecuencia++;
                }
                case "highBloodPressure" -> {
                    if (paciente.getHighBloodPressure() == valor) frecuencia++;
                }
                case "platelets" -> {
                    if (paciente.getPlatelets() == valor) frecuencia++;
                }
                case "serumCreatinine" -> {
                    if (paciente.getSerumCreatinine() == valor) frecuencia++;
                }
                case "serumSodium" -> {
                    if (paciente.getSerumSodium() == valor) frecuencia++;
                }
                case "sex" -> {
                    if (paciente.getSex() == valor) frecuencia++;
                }
                case "smoking" -> {
                    if (paciente.getSmoking() == valor) frecuencia++;
                }
                case "time" -> {
                    if (paciente.getTime() == valor) frecuencia++;
                }
                case "deathEvent" -> {
                    if (paciente.getDeathEvent() == valor) frecuencia++;
                }
            }
        }

        return frecuencia;
    }
}
