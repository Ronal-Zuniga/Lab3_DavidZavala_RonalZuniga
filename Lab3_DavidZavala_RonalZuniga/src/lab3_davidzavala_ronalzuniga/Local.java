package lab3_davidzavala_ronalzuniga;

import java.util.ArrayList;

public class Local {

    private String nombre;
    private ArrayList<Empleado> empleados = new ArrayList();
    private ArrayList<Productos> productos = new ArrayList();
    private Empleado gerente;

    public Local() {
    }

    public Local(String nombre, Empleado gerente) {
        this.nombre = nombre;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public Empleado getGerente() {
        return gerente;
    }

    public void setGerente(Empleado gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Local{" + "nombre=" + nombre + ", empleados=" + empleados + ", productos=" + productos + ", gerente=" + gerente + '}';
    }
    
}
