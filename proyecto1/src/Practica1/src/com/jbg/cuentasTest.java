public class cuentasTest {
    public static void main(String[] args) {
        cuentas a = new cuentas();
        cuentas b = new cuentas();

        a.id = 123;
        a.balance = -1.3;
        a.credito();

        b.id = 321;
        b.balance = 100;
        b.debito();

        a.balancec(a.balance);
        b.balancec(b.balance);



    }
}
