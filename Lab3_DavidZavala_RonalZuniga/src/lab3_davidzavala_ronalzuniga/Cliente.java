package lab3_davidzavala_ronalzuniga;

import java.util.ArrayList;

public class Cliente extends Persona{
    private double dinero;
    private ArrayList<Productos> productos = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(double dinero, String nombre, int id, String user, String password, String mail) {
        super(nombre, id, user, password, mail);
        this.dinero = dinero;
    }

    public Cliente(double dinero) {
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dinero=" + dinero + ", productos=" + productos + '}';
    }
    
}
