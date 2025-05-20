/*esta es la clase padre de cuentasDeposito, herencia de la clase cuentas 
 * la parctica cuentas con clases y herencias 
 * autor: joshua barragán
 * date otoño 25
*/
public class CuentaDeposito extends Cuentas{
    public double rendimiento;
    public double interes;

/*esta es la duncion del constructor
 * autor: joshua barragán
 * date otoño 25
*/
    public CuentaDeposito(String banco, int cuenta, double saldo, double rendimiento, double interes) {
        super(banco, cuenta, saldo);
        this.rendimiento = rendimiento;
        this.interes = interes;
    }

/*esta es la funcion que obtiene los datos para las cuentas deposito con metodo get
 * autor: joshua barragán
 * date otoño 25
*/
    public String getDatosd() {
        return getDatos() + ", tiene el interes; " + interes + ", con un rendimiento de " + rendimiento;
    }

}
