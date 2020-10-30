package lab3_davidzavala_ronalzuniga;

import java.util.ArrayList;
import java.util.Scanner;



public class Juguetes extends Productos{
    static Scanner read = new Scanner(System.in);
    private String desc;
    
    public Juguetes() {
        super();
    }

    public Juguetes(String desc, String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
        this.desc = desc;
    }

    public Juguetes(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Juguetes{" + "desc=" + desc + '}';
    }  
    
    public Juguetes Juguetesadd(){
        System.out.println("Nombre: ");
        String nombre = read.next();
        System.out.println("Descripcion: ");
        String desc = read.next();
        System.out.println("Precio: ");
        double precio = read.nextDouble();
        System.out.println("Descripcion del juguete: ");
        String desc2 = read.next();
        return new Juguetes(desc2, nombre, desc, precio);
    }
    
    public void Juguetesmod(Juguetes j){
        System.out.println("Nombre: ");
        String nombre = read.next();
        System.out.println("Descripcion: ");
        String desc = read.next();
        System.out.println("Precio: ");
        double precio = read.nextDouble();
        System.out.println("Descripcion del juguete: ");
        String desc2 = read.next();
        j.setDesc(desc2);
        j.setDescripcion(desc);
        j.setNombre(nombre);
        j.setPrecio(precio);
    }
    
    public void Juguetesdel(ArrayList<Juguetes> j){
        for (int i = 0; i < j.size(); i++) {
            System.out.println("[" + i + "] {{" + j.get(i) + "}");
        }
        System.out.println("Juguete a eliminar: ");
        int p = read.nextInt();
        if (p < 0 || p > j.size()) {
            System.out.println("Posicion fuera de rango");
        } else {
            j.remove(j.get(p));
        }
    }
    
}
