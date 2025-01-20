public class DogTestDrive {
    public static void main(String[] args) {
        dog d = new dog();
        dog c = new dog();

        c.name = "julian";
        d.año = 40;
        d.name = "perro";
        d.bread ="doberman";
        d.back();
        c.back();
        System.out.println("el perro es " + c.name);
        c.pp();
    }
}
