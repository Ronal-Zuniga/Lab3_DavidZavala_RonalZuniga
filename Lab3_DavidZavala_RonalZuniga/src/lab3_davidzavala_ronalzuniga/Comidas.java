package lab3_davidzavala_ronalzuniga;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Comidas extends Productos {

    static Scanner read = new Scanner(System.in);
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

    public Comidas Comidasadd() {
        System.out.println("Nombre: ");
        String nombre = read.next();
        System.out.println("Descripcion: ");
        String desc = read.next();
        System.out.println("Precio: ");
        double precio = read.nextDouble();
        System.out.println("Tipo: \n"
                + "1. Comida\n"
                + "2. Bebida");
        int t = read.nextInt();
        String type = "";
        switch (t) {
            case 1: {
                type = "Comida";
                break;
            }

            case 2: {
                type = "Bebida";
                break;
            }
            default:
                System.out.println("Opcion invalida");
                break;
        }
        System.out.println("Fecha de caducidad: ");
        System.out.println("Año: ");
        int a = read.nextInt();
        System.out.println("Mes: ");
        int m = read.nextInt();
        System.out.println("Dia: ");
        int d = read.nextInt();
        Date f = new Date(a, m, d);
        return new Comidas(type, f, nombre, desc, precio);
    }

    public void Comidasmod(Comidas c) {
        System.out.println("Nombre: ");
        String nombre = read.next();
        System.out.println("Descripcion: ");
        String desc = read.next();
        System.out.println("Precio: ");
        double precio = read.nextDouble();
        System.out.println("Tipo: \n"
                + "1. Comida\n"
                + "2. Bebida");
        int t = read.nextInt();
        String type = "";
        switch (t) {
            case 1: {
                type = "Comida";
                break;
            }

            case 2: {
                type = "Bebida";
                break;
            }
            default:
                System.out.println("Opcion invalida");
                break;
        }
        System.out.println("Fecha de caducidad: ");
        System.out.println("Año: ");
        int a = read.nextInt();
        System.out.println("Mes: ");
        int m = read.nextInt();
        System.out.println("Dia: ");
        int d = read.nextInt();
        Date f = new Date(a, m, d);
        c.setCaducidad(f);
        c.setDescripcion(desc);
        c.setNombre(nombre);
        c.setPrecio(precio);
        c.setTipo(tipo);
    }

    public void Comidasdel(ArrayList<Comidas> c){
        for (int i = 0; i < c.size(); i++) {
            System.out.println("[" + i + "] {{" + c.get(i) + "}");
        }
        System.out.println("Comida a eliminar: ");
        int p = read.nextInt();
        if (p < 0 || p > c.size()) {
            System.out.println("Posicion fuera de rango");
        } else {
            c.remove(c.get(p));
        }
    }
    
}
