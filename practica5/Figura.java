abstract class Figura {
    private String nombre;
    private double area;
    private double volumen;
    private int id;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract void calcularArea();
    public abstract void calcularVolumen();

    public void mostrarInfo() {
        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + area);
        System.out.println("Volumen: " + volumen);
        System.out.println("ID: " + regresaId());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int regresaId() {
        return id;
    }

    public void tipo(Figura figura) {
        System.out.println("El ID de la figura es: " + figura.regresaId());
    }

    public double obtenerValorPositivo(String mensaje) {
        double valor;
        while (true) {
            try {
                System.out.println(mensaje);
                valor = Double.parseDouble(System.console().readLine());
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Por favor, ingresa un valor mayor a 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número válido.");
            }
        }
    }
}
