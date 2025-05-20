class Alimento extends Producto {
    public String fechaExpiracion;

    public Alimento(String nombre, double precio, String codigo, String fechaExpiracion) {
        super(nombre, precio, codigo);
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public void aplicarDescuento() {
        this.precio *= 0.92; 
    }

    @Override
    public void identificarProducto() {
        System.out.println("Alimento: " + nombre + ", Precio: " + precio + ", Codigo: " + codigo + ", Fecha de Expiracion: " + fechaExpiracion);
    }
}

