

/*esta es la clase padre de cuentastest
 * la parctica cuentas con clases y herencias 
 * autor: joshua barragán
 * date otoño 25
*/
public class CuentasTest {

    public static void main(String[] args) {
        Cuentas c1 = new Cuentas("banamex", 12345, 1390.6);
        Cuentas c2 = new Cuentas("santande", 4534, 1.90);

        c1.asignarCredito(c1.cuenta);
        c2.asignarCredito(c2.cuenta);

        CuentaDeposito cd1 = new CuentaDeposito("BBVA", 465, 1390.6, 12.6, 1.5);
        CuentaDeposito cd2 = new CuentaDeposito("Azteca", 967654, 1.90, 12.2, 90.1);

        CuentaAhorro ca32 = new CuentaAhorro("kAR", 74593, 987.90, 09.2, 3.1);
        CuentaAhorro ca2 = new CuentaAhorro("NU", 16788, 135.90, 90, 1.1);

        System.out.println("cuentas:");
        System.out.println(c1.getDatos());
        System.out.println(c2.getDatos());
        
        System.out.println("\n cuentas de ahorro:");
        System.out.println(ca2.getDatoscuenta());
        System.out.println(ca32.getDatoscuenta());
        
        System.out.println("\n de deposito:");
        System.out.println(cd1.getDatosd());
        System.out.println(cd2.getDatosd());

        Users user1 = new Users("Carlos Pérez", 15000.0, 1, "Bancomer", 456789, 5000.0);
        System.out.println(user1.getDatosUsuario());
        user1.verificarIntereses();

    }
}
