package lab3_davidzavala_ronalzuniga;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Persona {

    static Scanner read = new Scanner(System.in);
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

    public Cliente Clientesadd() {
        System.out.println("Nombre: ");
        String nombre = read.next();
        System.out.println("Id: ");
        int id = read.nextInt();
        System.out.println("User: ");
        String u = read.next();
        System.out.println("Contraseña: ");
        String contraseña = read.next();
        System.out.println("Correo: ");
        String correo = read.next();
        System.out.println("Dinero: ");
        double money = read.nextDouble();
        return new Cliente(money, nombre, id, u, contraseña, correo);
    }

    public void Clientesmod(Cliente c) {
        System.out.println("Nombre: ");
        String nombre = read.next();
        System.out.println("Id: ");
        int id = read.nextInt();
        System.out.println("User: ");
        String u = read.next();
        System.out.println("Contraseña: ");
        String contraseña = read.next();
        System.out.println("Correo: ");
        String correo = read.next();
        System.out.println("Dinero: ");
        double money = read.nextDouble();
        c.setNombre(nombre);
        c.setId(id);
        c.setUser(u);
        c.setPassword(contraseña);
        c.setMail(correo);
        c.setDinero(dinero);
    }

    public void Clientesdel(ArrayList<Cliente> c) {
        for (int i = 0; i < c.size(); i++) {
            System.out.println("[" + i + "] {{" + c.get(i) + "}");
        }
        System.out.println("Prenda a eliminar: ");
        int p = read.nextInt();
        if (p < 0 || p > c.size()) {
            System.out.println("Posicion fuera de rango");
        } else {
            c.remove(c.get(p));
        }
    }

}
