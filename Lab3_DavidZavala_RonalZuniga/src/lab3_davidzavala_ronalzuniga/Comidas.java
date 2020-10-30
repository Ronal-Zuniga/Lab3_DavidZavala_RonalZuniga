package lab3_davidzavala_ronalzuniga;

import java.util.Date;

public class Comidas extends Productos{
   private String tipo;
   private Date caducidad;

    public Comidas() {
        super();
    }

    public Comidas(String tipo, Date caducidad, String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
        setTipo(tipo);
        this.caducidad = caducidad;
    }

    public Comidas(String tipo, Date caducidad) {
        setTipo(tipo);
        this.caducidad = caducidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("Comida") || tipo.equals("Bebida")) {
            this.tipo = tipo;
        }        
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return "Comidas{" + "tipo=" + tipo + ", caducidad=" + caducidad + '}';
    }
     
   
   
}
