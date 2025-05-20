public class profesor extends empleado {
    // Atributos específicos de Profesor
    public String materia;
    public String horario;

    // Constructor
    public profesor(String nombre, int edad, String puesto, double salario, String departamento, String direccion, String materia, String horario) {
        super(nombre, edad, puesto, salario, departamento, direccion);
        this.materia = materia;
        this.horario = horario;
    }

    // Método para obtener todos los datos, incluyendo materia y horario
    public String getDatosProfesor() {
        return getDatos() + ", Materia: " + materia + ", Horario: " + horario;
    }
}
