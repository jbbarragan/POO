class Cilindro extends Figura {
    private double radio;
    private double altura;

    public Cilindro() {
        super("Cilindro");
    }

    @Override
    public void calcularArea() {
        setArea(2 * Math.PI * radio * (radio + altura));
    }

    @Override
    public void calcularVolumen() {
        setVolumen(Math.PI * Math.pow(radio, 2) * altura);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = -1;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("La altura debe ser mayor a 0.");
        }
    }
}
