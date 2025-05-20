public class TestEmpleado {
    public static void main(String[] args) {
        empleado empleado1 = new empleado("Memo Gomez", 60, "Ingeniero", 50000, "Desarrollo", "Av. reforma 123");
        empleado empleado2 = new empleado("Ana Lopez", 40, "Gerente", 75000, "Administracion", "Calle ibero 45");
        empleado empleado3 = new empleado("Luis Martinez", 25, "Radio", 35000, "Soporte", "Boulevard santa fe 789");
        profesor profesor1 = new profesor("Carlos Ramírez", 45, "Profesor", 60000, "Educación", "Calle Universitaria 101", "Matemáticas", "Lunes a Viernes 8:00-14:00");

        empleadoInvestigador investigador = new empleadoInvestigador("Miguel Aspeitia", 30, "fisico", 60000, "Educación", "Calle hpola 101", "si", "universidad ibero", "fisica");
        empleadoInvestigador investigador2 = new empleadoInvestigador("jose jose", 30, "musico", 60000, "Educación", "Calle el triste 101", "si", "bacacho", "alcohol");

        System.out.println("empleado 1:");
        System.out.println(empleado1.getDatos());
        System.out.println("Bono empleado 1 (10%): $" + empleado1.calcularBono(10));
        System.out.println("Cumple antiguedad de 35 anios? " + empleado1.verificarAntiguedad(35));
        
        System.out.println("\nempleado 2:");
        System.out.println(empleado2.getDatos());
        System.out.println("Bono empleado 2 (15%): $" + empleado2.calcularBono(15));
        System.out.println("Cumple antiguedad de 35 anios? " + empleado2.verificarAntiguedad(35));
        
        System.out.println("\nempleado 3:");
        System.out.println(empleado3.getDatos());
        System.out.println("Bono empleado 3 (5%): $" + empleado3.calcularBono(5));
        System.out.println("cumple antiguedad de 30 anos? " + empleado3.verificarAntiguedad(30));

        System.out.println("\nDatos profesor:");
        System.out.println(profesor1.getDatosProfesor());

        System.out.println("\nDatos investigador:");
        System.out.println(investigador.getDatosInvestigador());

        System.out.println("\nDatos investigador2:");
        System.out.println(investigador2.getDatosInvestigador());
    }
}
