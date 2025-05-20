public class empleadoInvestigador extends empleado {
    // Atributos específicos de Profesor
    public String SNI;
    public String corp;
    public String campo;

    // Constructor
    public empleadoInvestigador(String nombre, int edad, String puesto, double salario, String departamento, String direccion, String SNI, String corp, String campo) {
        super(nombre, edad, puesto, salario, departamento, direccion);
        this.SNI = SNI;
        this.corp = corp;
        this.campo = campo;
    }

    // Método para obtener todos los datos, incluyendo materia y horario
    public String getDatosInvestigador() {
        return getDatos() + ", SNI?; " + SNI + ", en la empresa " + corp + "en el campo" + campo;
    }
}
