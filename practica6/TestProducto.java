import java.util.ArrayList;
import java.util.Scanner;

public class TestProducto {
    public static void mostrarTipoProducto(Producto p) {
        System.out.println("existe el producto" + p.getNombre());
    }

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Crear 5 productos predefinidos
        productos.add(new Electronico("Laptop", 1500, "E001", 2));
        productos.add(new Textil("Camiseta", 20, "T001", "Algodón"));  
        productos.add(new Alimento("Leche", 2.5, "A001", "01-03-2025"));
        productos.add(new Electronico("Telefono", 800, "E002", 1));
        productos.add(new Textil("Pantalón", 40, "T002", "Denim"));

        // Aplicar descuentos
        for (Producto p : productos) {
            p.aplicarDescuento();
        }

        System.out.println("¿Desea agregar un nuevo producto? (S/N)");
        String respuesta = scanner.nextLine();

        while (respuesta.equalsIgnoreCase("S")) {
            System.out.println("Seleccione el tipo de producto (1: Electrónico, 2: Textil, 3: Alimento): ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Ingrese nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Ingrese código: ");
            String codigo = scanner.nextLine();

            switch (tipo) {
                case 1 -> {
                    System.out.print("Ingrese garantía (en años): ");
                    int garantia = scanner.nextInt();
                    scanner.nextLine();
                    productos.add(new Electronico(nombre, precio, codigo, garantia));
                }
                case 2 -> {
                    System.out.print("Ingrese material: ");
                    String material = scanner.nextLine();
                    productos.add(new Textil(nombre, precio, codigo, material));
                }
                case 3 -> {
                    System.out.print("Ingrese fecha de expiración (DD-MM-YYYY): ");
                    String fechaExp = scanner.nextLine();
                    productos.add(new Alimento(nombre, precio, codigo, fechaExp));
                }
                default -> System.out.println("Opción no válida.");
            }

            System.out.println("¿Desea agregar otro producto? (S/N)");
            respuesta = scanner.nextLine();
        }

        System.out.println("\nLista de productos registrados:");
        for (Producto p : productos) {
            mostrarTipoProducto(p);
            p.identificarProducto();
        }

        scanner.close();
    }
}

