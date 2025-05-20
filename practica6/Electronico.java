class Electronico extends Producto {
    public int garantia;

    public Electronico(String nombre, double precio, String codigo, int garantia) {
        super(nombre, precio, codigo);
        this.garantia = garantia;
    }

    @Override
    public void aplicarDescuento() {
        this.precio *= 0.90; 
    }

    @Override
    public void identificarProducto() {
        System.out.println("Electronico: " + nombre + ", Precio: " + precio + ", Codigo: " + codigo + ", Garantia: " + garantia + " anios");
    }
}

