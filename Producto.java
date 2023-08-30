public class Producto {
    private String nombre;
    private Double precio;
    private int cantidadInventario;
    private int cantidadVendida;

    public Producto(String nombre, double precio, int cantidadInventario){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadInventario = cantidadInventario;
        this.cantidadVendida = 0; 
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void reducirCantidad(int cantidadComprada) {
        if (cantidadComprada <= cantidadInventario) {
            cantidadInventario -= cantidadComprada;
            cantidadVendida += cantidadComprada; // Incrementa la cantidad vendida
            System.out.println("Compra exitosa. Cantidad restante en inventario: " + cantidadInventario);
        } else {
            System.out.println("No hay suficiente cantidad en inventario.");
        }
    }
}
