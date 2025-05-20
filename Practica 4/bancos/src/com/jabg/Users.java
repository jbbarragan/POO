/* Clase Users que hereda de la clase Cuentas
 * Autor: Joshua Barragán
 * Fecha: Otoño 25
 */
public class Users extends Cuentas {
    public String nombre;
    public double sueldo;
    public int estado; // 1 = elegible a menores intereses, 0 = no elegible

    /**
     * Constructor de la clase Users.
     *
     * @param nombre Nombre del usuario.
     * @param sueldo Sueldo del usuario.
     * @param estado Estado de elegibilidad.
     * @param banco  Nombre del banco.
     * @param cuenta Número de cuenta.
     * @param saldo  Saldo de la cuenta.
     */
    public Users(String nombre, double sueldo, int estado, String banco, int cuenta, double saldo) {
        super(banco, cuenta, saldo); // Llama al constructor de la clase padre
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.estado = estado;
    }

    /**
     * Método que evalúa si el usuario es elegible para menores intereses
     * según su estado.
     */
    public void verificarIntereses() {
        if (estado == 1) {
            System.out.println("El usuario " + nombre + " es elegible para menores intereses.");
        } else {
            System.out.println("El usuario " + nombre + " no es elegible para menores intereses.");
        }
    }

    /**
     * Método para obtener los datos completos del usuario y su cuenta.
     *
     * @return String con la información del usuario y su cuenta.
     */
    public String getDatosUsuario() {
        return "Usuario: " + nombre + ", Sueldo: " + sueldo + ", Estado: " + (estado == 1 ? "Elegible" : "No elegible") +
               "\n" + getDatos(); // Llama al método getDatos() de la clase Cuentas
    }
}
