public class empleado {
    public String nombre;
    public int edad;
    public String puesto;
    public double salario;
    public String departamento;
    public String direccion;

    public empleado(String nombre, int edad, String puesto, double salario, String departamento, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
        this.salario = salario;
        this.departamento = departamento;
        this.direccion = direccion;
    }

    public String getDatos() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Puesto: " + puesto +
               ", Salario: $" + salario + ", Departamento: " + departamento + 
               ", Direccion: " + direccion;
    }

    public double calcularBono(double porcentaje) {
        return salario * (porcentaje / 100);
    }

    public boolean verificarAntiguedad(int aniosRequeridos) {
        return edad >= aniosRequeridos;
    }
}
