package lab3_davidzavala_ronalzuniga;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante extends Local {

    static Scanner read = new Scanner(System.in);
    private ArrayList<Comidas> comida = new ArrayList();
    private Comidas comidas;

    public Restaurante() {
        super();
    }

    public Restaurante(String nombre, Empleado gerente) {
        super(nombre, gerente);
    }

    public Restaurante(Comidas comidas) {
        this.comidas = comidas;
    }

    public ArrayList<Comidas> getComida() {
        return comida;
    }

    public void setComida(ArrayList<Comidas> comida) {
        this.comida = comida;
    }

    public Comidas getComidas() {
        return comidas;
    }

    public void setComidas(Comidas comidas) {
        this.comidas = comidas;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "comida=" + comida + ", comidas=" + comidas + '}';
    }

    public Restaurante RestAdd(ArrayList<Empleado> emp) {
        System.out.println("Nombre");
        String Nombre = read.next();
        Print(emp);
        System.out.print("Gerente a cargo del local: ");
        int ger = read.nextInt();
        return new Restaurante(Nombre, emp.get(ger));
    }

    public void Restmod(Restaurante r, ArrayList<Empleado> emp) {
        System.out.println("Nombre");
        String Nombre = read.next();
        Print(emp);
        System.out.print("Gerente a cargo del local: ");
        int ger = read.nextInt();
        r.setNombre(Nombre);
        r.setGerente(emp.get(ger));
    }
    
    public void Restdel(ArrayList<Restaurante> r){
        Print(r);
        System.out.println("Elija el restaurante a ser eliminado: ");
        int op = read.nextInt();
        if (op < 0 || op > r.size()) {
            
        }else{
            r.remove(r.get(op));
        }
    }
    
    public void RestAddEmp(Restaurante r, ArrayList<Empleado> emp) {
        boolean tf = true;
        while (tf == true) {
            Print(emp);
            System.out.println("Elija  un Empleado");
            int op = read.nextInt();
            r.getEmpleados().add(emp.get(op));
            System.out.println("Desea agregar otro empleado?[S/N]");
            char sn = read.next().toLowerCase().charAt(0);
            if (sn == 'n') {
                tf = false;
            }
        }
    }

    public void RestAddPro(Restaurante r, ArrayList<Comidas> c) {
        boolean tf = true;
        while (tf == true) {
            Print(c);
            System.out.println("Elija un Producto");
            int op = read.nextInt();
            r.getProductos().add(c.get(op));
            System.out.println("Desea agregar otro Producto?[S/N]");
            char sn = read.next().toLowerCase().charAt(0);
            if (sn == 'n') {
                tf = false;
            }
        }
    }

    static void Print(ArrayList array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("[" + i + "] {{" + array.get(i) + "}");
        }
    }

}
