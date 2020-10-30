
package lab3_davidzavala_ronalzuniga;

public class Ropa extends Productos{
    private String tipo;
    private String talla;

    public Ropa() {
        super();
    }

    public Ropa(String tipo, String talla, String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
        setTipo(tipo);
        this.talla = talla;
    }

    public Ropa(String tipo, String talla) {
        setTipo(tipo);
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("Hombre") || tipo.equals("Mujer")) {
            this.tipo = tipo;
        }
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Ropa{" + "tipo=" + tipo + ", talla=" + talla + '}';
    }
    
    
}
