package lab3_davidzavala_ronalzuniga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ropa extends Productos {

    static Scanner read = new Scanner(System.in);
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

    public Ropa Ropaadd() {
        System.out.println("Nombre: ");
        String nombre = read.next();
        System.out.println("Descripcion: ");
        String desc = read.next();
        System.out.println("Precio: ");
        double precio = read.nextDouble();
        System.out.println("Tipo: \n"
                + "1. Hombre\n"
                + "2. Mujer\n"
                + "3. Niño");
        int t = read.nextInt();
        String type = "";
        switch (t) {
            case 1: {
                type = "Hombre";
                break;
            }

            case 2: {
                type = "Mujer";
                break;
            }
            case 3: {
                type = "Niño";
                break;
            }

            default:
                System.out.println("Opcion invalida");
                break;
        }
        System.out.println("Talla: \n"
                + "1. S\n"
                + "2. M\n"
                + "3. L\n"
                + "4. XL");
        int tl = read.nextInt();
        String size = "";
        switch (tl) {
            case 1: {
                size = "S";
                break;
            }
            case 2: {
                size = "M";
                break;
            }
            case 3: {
                size = "L";
                break;
            }
            case 4: {
                size = "XL";
                break;
            }
        }
        return new Ropa(type, size, nombre, desc, precio);
    }

    public void Ropamod(Ropa r) {
        System.out.println("Nombre: ");
        String nombre = read.next();
        System.out.println("Descripcion: ");
        String desc = read.next();
        System.out.println("Precio: ");
        double precio = read.nextDouble();
        System.out.println("Tipo: \n"
                + "1. Hombre\n"
                + "2. Mujer\n"
                + "3. Niño");
        int t = read.nextInt();
        String type = "";
        switch (t) {
            case 1: {
                type = "Hombre";
                break;
            }

            case 2: {
                type = "Mujer";
                break;
            }
            case 3: {
                type = "Niño";
                break;
            }

            default:
                System.out.println("Opcion invalida");
                break;
        }
        System.out.println("Talla: \n"
                + "1. S\n"
                + "2. M\n"
                + "3. L\n"
                + "4. XL");
        int tl = read.nextInt();
        String size = "";
        switch (tl) {
            case 1: {
                size = "S";
                break;
            }
            case 2: {
                size = "M";
                break;
            }
            case 3: {
                size = "L";
                break;
            }
            case 4: {
                size = "XL";
                break;
            }
        }

        r.setDescripcion(desc);
        r.setNombre(nombre);
        r.setPrecio(precio);
        r.setTipo(type);
        r.setTalla(size);
    }

    public void Ropadel(ArrayList<Ropa> r) {
        for (int i = 0; i < r.size(); i++) {
            System.out.println("[" + i + "] {{" + r.get(i) + "}");
        }
        System.out.println("Prenda a eliminar: ");
        int p = read.nextInt();
        if (p < 0 || p > r.size()) {
            System.out.println("Posicion fuera de rango");
        } else {
            r.remove(r.get(p));
        }

    }

}
