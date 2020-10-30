package lab3_davidzavala_ronalzuniga;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosco extends Tienda {

    static Scanner read = new Scanner(System.in);
    private Tienda tienda;

    public Kiosco(Tienda tienda) {
        this.tienda = tienda;
    }

    public Kiosco(String nombre, Empleado gerente) {
        super(nombre, gerente);
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Tienda KioscoAdd(ArrayList<Empleado> emp) {
        System.out.println("Nombre");
        String Nombre = read.next();
        Print(emp);
        System.out.print("Gerente a cargo del local: ");
        int ger = read.nextInt();
        return new Kiosco(Nombre, emp.get(ger));
    }

    public void KioscoMod(Kiosco store, ArrayList<Empleado> emp) {
        System.out.println("Nombre");
        String Nombre = read.next();
        Print(emp);
        System.out.print("Gerente Nuevo: ");
        int ger = read.nextInt();
        store.setNombre(Nombre);
        store.setGerente(emp.get(ger));
    }
    
    public void KioscoDel(ArrayList<Kiosco> array) {
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
    
    public void KioscoAddEmp(Kiosco store, ArrayList<Empleado> emp) {
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

    public void KioscoAddPro(Kiosco store, ArrayList<Productos> pro) {
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

    static void Print(ArrayList array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("[" + i + "] {{" + array.get(i) + "}");
        }
    }

}
