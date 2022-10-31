import java.util.Date;

public class Libro {

    public String tituloLibro;
    public String autorLibro;
    public String generoLibro;
    public int cantidadLibro;
    public int precioLibro;

    public int codigoLibro;

    public Libro(String tituloLibro, String autorLibro, String generoLibro, int cantidadLibro, int precioLibro, int codigoLibro) {
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.generoLibro = generoLibro;
        this.cantidadLibro = cantidadLibro;
        this.precioLibro = precioLibro;
        this.codigoLibro = codigoLibro;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public String getGeneroLibro() {
        return generoLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public int getCantidadLibro() {
        return cantidadLibro;
    }

    public int getPrecioLibro() {
        return precioLibro;
    }

    public void compraLibro () {
        this.cantidadLibro --;
    }
}
