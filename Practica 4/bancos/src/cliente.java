public class cliente {

public double retiro;
public double minimo;

/*esta es la funcion del constructor
 * autor: joshua barragán
 * date otoño 25
*/
    public CuentaAhorro(String banco, int cuenta, double saldo, double retiro, double minimo) {
        super(banco, cuenta, saldo);
        this.retiro = retiro;
        this.minimo = minimo;
    }

/*esta es la funcion que obtirnr la data por metodo get
 * autor: joshua barragán
 * date otoño 25
*/
    public String getDatoscuenta() {
        return getDatos() + ", la cuenta solo puede retirar al dia; " + retiro + ", debe mantener un minimo en la cuenta de " + minimo;
    }
}
