import java.util.ArrayList;

public class Tienda {

    private ArrayList<Libro> carrito;

    private float totalPagar;

    Tienda() {
        this.carrito = new ArrayList<Libro>();
        this.setTotalPagar(0);
    }

    private void calcularCosto() {

        this.setTotalPagar(0);

        for(int i = 0; i < this.carrito.size(); i++) {
            this.totalPagar += this.carrito.get(i).getPrecioLibro();
        }

    }

    public void mostrarCarrito() {

        if(this.carrito.size() != 0) {

            System.out.println("\n- Tu Carrito -\n");
            for(int i = 0; i < this.carrito.size(); i++) {
                System.out.println("libro -> " + this.carrito.get(i).getAutorLibro());
                System.out.println("Precio -> $" + this.carrito.get(i).getPrecioLibro() + "\n----------------------");
            }

            System.out.println("Total a pagar: $" + this.getTotalPagar());

        } else {
            System.out.println("Tu carrito esta vacio!");
        }


    }

    public void addLibro(Libro libro) {

        if(libro.getCantidadLibro() != 0) {

            libro.compraLibro();

            this.carrito.add(libro);

            this.calcularCosto();

            System.out.println("Libro agregado al carrito.");

        } else {
            System.out.println("No hay stock disponible.");
        }

    }
        private void setTotalPagar(float totalPagar) { this.totalPagar = totalPagar; }
        public float getTotalPagar() { return totalPagar; }
}
