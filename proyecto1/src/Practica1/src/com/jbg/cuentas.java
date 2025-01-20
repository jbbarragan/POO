public class cuentas {
    int id;
    double balance;

    void credito(){
       System.out.println("ru ttarjeta es de crédito");
    }
   
    void debito(){
      System.out.println("tu tarjeta es de debito");
   }
   
   void balancec(double balance){

    System.out.println("el balance de tu cuenta es " + balance);

   }
}
