import java.util.ArrayList;

public class helpMethods {
    public static void impInv(ArrayList<Producto> productos){
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("------------------");
        }
    }
}
