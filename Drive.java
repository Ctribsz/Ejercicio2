import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Drive {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        //Crear objetos de tipo Producto
        Producto producto1 = new Producto("Papas", 10.99, 10);
        Producto producto2 = new Producto("Pepinos", 20.49, 20);
        Producto producto3 = new Producto("Cebollas", 5.75, 60);
        Producto producto4 = new Producto("Tomates", 10.99, 10);
        Producto producto5 = new Producto("Lechugas", 20.49, 20);
        Producto producto6 = new Producto("Brocoli", 5.75, 60);
        Producto producto7 = new Producto("Zanahorias", 10.99, 10);
        Producto producto8 = new Producto("Esparragos", 20.49, 20);
        Producto producto9 = new Producto("Pimientos", 5.75, 20);
        Producto producto10 = new Producto("Guisantes", 5.75, 60);

        //Agregar los objetos a la lista
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);
        productos.add(producto8);
        productos.add(producto9);
        productos.add(producto10);

        Scanner sc = new Scanner(System.in);

        while (true) {
                System.out.println("1. Mostrar productos disponibles");
                System.out.println("2. Comprar productos");
                System.out.println("3. Generar reporte de ventas");
                System.out.println("4. Salir");
                System.out.println("Seleccione una opción: ");

                try {
                    int opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            helpMethods.impInv(productos);
                            break;

                        case 2:
                            helpMethods.impInv(productos);
                            System.out.print("Seleccione el número del producto a comprar: ");
                            int numeroProducto = sc.nextInt();

                            if (numeroProducto >= 1 && numeroProducto <= productos.size()) {
                                Producto productoSeleccionado = productos.get(numeroProducto - 1);

                                System.out.print("Ingrese la cantidad a comprar: ");
                                int cantidadComprada = sc.nextInt();

                                productoSeleccionado.reducirCantidad(cantidadComprada);
                            } else {
                                System.out.println("Número de producto inválido.");
                            }
                            break;

                        case 3:
                            System.out.println("Mostrando cantidad vendida:");
                            for (Producto producto : productos) {
                                System.out.println("Producto: " + producto.getNombre());
                                System.out.println("Cantidad vendida: " + producto.getCantidadVendida());
                                System.out.println("------------------");
                            }
                            break;
                        
                        case 4:
                        System.out.println("Gracias por elegirno, hasta luego");
                        sc.close();
                        System.exit(0);
                        break;

                        default:
                            System.out.println("Opción inválida. Por favor, elija una opción válida.");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese una opción válida.");
                    sc.nextLine(); // Limpiar el buffer de entrada
                }
        }
    }
}
