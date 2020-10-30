package lab3_davidzavala_ronalzuniga;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Tienda extends Local {

    static Scanner read = new Scanner(System.in);

    public Tienda() {
        super();
    }

    public Tienda(String nombre, Empleado gerente) {
        super(nombre, gerente);
    }

    public Tienda TiendaAdd(ArrayList<Empleado> emp) {
        System.out.println("Nombre");
        String Nombre = read.next();
        Print(emp);
        System.out.print("Gerente a cargo del local: ");
        int ger = read.nextInt();
        return new Tienda(Nombre, emp.get(ger));
    }

    public void TiendaMod(Tienda store, ArrayList<Empleado> emp) {
        System.out.println("Nombre");
        String Nombre = read.next();
        Print(emp);
        System.out.print("Gerente Nuevo: ");
        int ger = read.nextInt();
        store.setNombre(Nombre);
        store.setGerente(emp.get(ger));
    }

    public void TiendaAddEmp(Tienda store, ArrayList<Empleado> emp) {
        boolean tf = true;
        while (tf == true) {
            Print(emp);
            System.out.println("Elija  un Empleado");
            int op = read.nextInt();
            store.getEmpleados().add(emp.get(op));
            System.out.println("Desea agregar otro empleado?[S/N]");
            char sn = read.next().toLowerCase().charAt(0);
            if (sn == 'n') {
                tf = false;
            }
        }
    }

    public void TiendaAddPro(Tienda store, ArrayList<Productos> pro) {
        boolean tf = true;
        while (tf == true) {
            Print(pro);
            System.out.println("Elija un Producto");
            int op = read.nextInt();
            store.getProductos().add(pro.get(op));
            System.out.println("Desea agregar otro Producto?[S/N]");
            char sn = read.next().toLowerCase().charAt(0);
            if (sn == 'n') {
                tf = false;
            }
        }
    }

    public void TiendeDel(ArrayList<Tienda> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("[" + i + "] {{" + array.get(i) + "}");
        }
        System.out.println("Elija la tienda a ser eliminada: ");
        int op = read.nextInt();
        if (op < 0 || op > array.size()) {
            
        }else{
            array.remove(array.get(op));
        }
        
    }

    static void Print(ArrayList array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("[" + i + "] {{" + array.get(i) + "}");
        }
    }

    static void Printprod(ArrayList<Productos> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) instanceof Ropa || array.get(i) instanceof Juguetes) {
                System.out.println("[" + i + "] {{" + array.get(i) + "}");
            }
        }
    }
}
