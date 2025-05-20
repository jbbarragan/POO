class Cubo extends Figura {
    private double lado;

    public Cubo() {
        super("Cubo");
    }

    @Override
    public void calcularArea() {
        setArea(6 * Math.pow(lado, 2));
    }

    @Override
    public void calcularVolumen() {
        setVolumen(Math.pow(lado, 3));
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            System.out.println("El lado debe ser mayor a 0.");
        }
    }
}
