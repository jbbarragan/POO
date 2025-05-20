class Textil extends Producto {
    public String material;

    public Textil(String nombre, double precio, String codigo, String material) {
        super(nombre, precio, codigo);
        this.material = material;
    }

    @Override
    public void aplicarDescuento() {
        this.precio *= 0.85; 
    }

    @Override
    public void identificarProducto() {
        System.out.println("Textil: " + nombre + ", Precio: " + precio + ", Codigo: " + codigo + ", Material: " + material);
    }
}

