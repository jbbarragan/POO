import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el valor del salto: ");
            double salto = scanner.nextDouble();
            if (salto <= 0) throw new IllegalArgumentException("El salto debe ser positivo.");

            System.out.print("Ingrese la masa del objeto (kg): ");
            double masa = scanner.nextDouble();
            if (masa <= 0) throw new IllegalArgumentException("La masa debe ser positiva.");

            System.out.print("Ingrese la velocidad inicial (m/s): ");
            double velocidadInicial = scanner.nextDouble();

            System.out.print("Ingrese la velocidad final (m/s): ");
            double velocidadFinal = scanner.nextDouble();
            if (velocidadFinal < velocidadInicial) throw new IllegalArgumentException("La velocidad final debe ser mayor que la inicial.");

            System.out.print("Ingrese la altura inicial (m): ");
            double alturaInicial = scanner.nextDouble();

            System.out.print("Ingrese la altura final (m): ");
            double alturaFinal = scanner.nextDouble();
            if (alturaFinal < alturaInicial) throw new IllegalArgumentException("La altura final debe ser mayor que la inicial.");

            System.out.print("Ingrese el límite inferior para la ecuación lineal: ");
            double limiteInferior = scanner.nextDouble();
            if (limiteInferior < 3) throw new IllegalArgumentException("El límite inferior debe ser mayor a 3.");

            System.out.print("Ingrese el límite superior para la ecuación lineal: ");
            double limiteSuperior = scanner.nextDouble();
            if (limiteSuperior < limiteInferior) throw new IllegalArgumentException("El límite superior debe ser mayor que el inferior.");

            System.out.print("Ingrese el tamaño del salto/incremento para la ecuación lineal: ");
            double incrementoEcuacion = scanner.nextDouble();
            if (incrementoEcuacion <= 0) throw new IllegalArgumentException("El incremento debe ser positivo.");

            CalculadoraEnergia calculadora = new CalculadoraEnergia(masa);

            double energiaCinetica = calculadora.calcularEnergiaCinetica(velocidadInicial, velocidadFinal, salto);
            double energiaPotencial = calculadora.calcularEnergiaPotencial(alturaInicial, alturaFinal, salto);
            double energiaTotal = calculadora.calcularEnergiaTotal(velocidadInicial, velocidadFinal, alturaInicial, alturaFinal, salto);
            double sumaEcuacion = calculadora.calcularSumaEcuacionLineal(limiteInferior, limiteSuperior, incrementoEcuacion);

            System.out.printf("Energia cinetica total: %.2f J%n", energiaCinetica);
            System.out.printf("Energia potencial total: %.2f J%n", energiaPotencial);
            System.out.printf("Energia total: %.2f J%n", energiaTotal);
            System.out.printf("Suma de la ecuacion lineal f(x)=sqrt(x)-3: %.2f%n", sumaEcuacion);

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingreso inválido. Por favor, ingrese números válidos.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
