import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<Libro>();

        menuTienda(libros);
    }

    public final static void clearConsole() {
        try {
            for (int i = 0; i < 50; ++i) System.out.println();
        } catch (Exception e) {
            System.out.println("Error -> " + e);
        }
    }

    static void menuTienda(List<Libro> libros) {

        Tienda tienda = new Tienda();

        int opcion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== MENU ===");
        System.out.println("1) Agregar un Libro.");
        System.out.println("2) Ir a la Biblioteca.");
        System.out.println("3) Ver mi carrito.");
        System.out.print("Opcion -> ");
        opcion = scanner.nextInt();


        switch (opcion) {

            case 1:

                /* Agregar Libro */

                System.out.println("-Nombre del Libro: ");
                String nombreLibro = scanner.next();

                System.out.println("-Autor del Libro: ");
                String autorLibro = scanner.next();

                System.out.println("-Genero del Libro: ");
                String generoLibro = scanner.next();

                System.out.println("-Precio: ");
                int precioLibro = scanner.nextInt();

                System.out.println("-codigo: ");
                int codigoLibro = scanner.nextInt();

                System.out.println("Stock: ");
                int cantidadLibro = scanner.nextInt();

                Libro lb = new Libro(nombreLibro, autorLibro, generoLibro, precioLibro, cantidadLibro, codigoLibro);


                //Agrega el articulo a los articulos globales.
                libros.add(lb);

                System.out.println("Articulo agregado correctamente.");

                menuTienda(libros);


                break;


            case 2:

                /* Mostrar biblioteca */

                clearConsole();

                if (libros.size() != 0) {
                    for (int i = 0; i < libros.size(); i++) {

                        System.out.println("\nID -> " + i);
                        System.out.println("Libro -> " + libros.get(i).getTituloLibro());
                        System.out.println("Autor -> " + libros.get(i).getAutorLibro() + "\n");
                        System.out.println("Genero -> " + libros.get(i).getGeneroLibro() + "\n");
                        System.out.println("Precio -> $" + libros.get(i).getPrecioLibro());
                        System.out.println("Stock -> " + libros.get(i).getCantidadLibro());

                    }

                } else {
                    System.out.println("No hay libros en la biblioteca! :(");
                }

                /* Agregar libro al carrito */
                int tiendaOpcion;
                int idLibroComprar;

                do {
                    System.out.println("\n=== MENU ===");
                    System.out.println("1) Comprar");
                    System.out.println("2) Volver");
                    System.out.print("Opcion -> ");
                    tiendaOpcion = scanner.nextInt();

                } while (tiendaOpcion != 1 && tiendaOpcion != 2);

                if (tiendaOpcion == 1) {

                    System.out.println("Ingresa el ID del articulo: ");
                    idLibroComprar = scanner.nextInt();

                    try {
                        tienda.addLibro(libros.get(idLibroComprar));
                    } catch (Exception e) {
                        System.out.println("No existe ningun articulo con ese ID.");
                    }
                }

                menuTienda(libros);
                break;

            case 3:

                /* Mostrar Carrito */
                tienda.mostrarCarrito();

                menuTienda(libros);


                break;

        }
    }
}
