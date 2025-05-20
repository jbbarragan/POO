class Esfera extends Figura {
    private double radio;

    public Esfera() {
        super("Esfera");
    }

    @Override
    public void calcularArea() {
        setArea(4 * Math.PI * Math.pow(radio, 2));
    }

    @Override
    public void calcularVolumen() {
        setVolumen((4.0 / 3) * Math.PI * Math.pow(radio, 3));
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            System.out.println("El radio debe ser mayor a 0.");
        }
    }
}
