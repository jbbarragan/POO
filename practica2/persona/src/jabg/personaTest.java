public class personaTest {
    public static void main(String[] args) {
        persona a = new persona();
        persona b = new persona();
        persona c = new persona();

        a.name = "julian";
        b.name = "jorge";
        c.name = "juan";
        
        a.age = 5;
        b.age = 15;
        c.age = 25;

        a.birth="noviembre 2";
        
        a.es(a.name);
        b.hola(b.name);
        c.hola2(c.age);


    }
}
