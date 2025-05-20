/*esta es la clase padre de cuentas 
 * la parctica cuentas con clases y herencias 
 * autor: joshua barragán
 * date otoño 25
*/
public class Cuentas {
    public int cuenta;
    public String banco;
    public double saldo;

/*esta es la funcion de constructor, asigna datos a las variables de las instancias
 * autor: joshua barragán
 * date otoño 25
*/
    public Cuentas(String banco, int cuenta, double saldo ) {
        this.banco = banco;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

/*esta es la duncion que obtiene los datos de la cuenta por metodo get
 * autor: joshua barragán
 * date otoño 25
 * @return string
*/
    public String getDatos() {
        return "el banco: " + banco + ", tiene la cuenta: " + cuenta + ", con el saldo: " + saldo;
    }

/*esta es la funcion que me permite asignar un credito a una cuenta
 * autor: joshua barragán
 * date otoño 25
*/
    public void asignarCredito(int cuenta) {
        System.out.println("la cuenta: " + cuenta + "es de credito");
    }

/*esta es la funcion que me permite determinar una cuenta de debito
 * autor: joshua barragán
 * date otoño 25
*/
    public void asignarDebito(int cuenta) {
        System.out.println("la cuenta: " + cuenta + "es de débito");
    }

}
