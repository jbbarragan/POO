class Producto {
    public String nombre;
    public double precio;
    public String codigo;

    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    public void aplicarDescuento() {
        this.precio *= 0.95; 
    }

    public String getNombre() {
        return nombre;
    }

    public void identificarProducto() {
        System.out.println("Producto: " + nombre + ", Precio: " + precio + ", Codigo: " + codigo);
    }
}

