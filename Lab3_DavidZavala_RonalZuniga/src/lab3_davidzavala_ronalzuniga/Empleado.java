package lab3_davidzavala_ronalzuniga;

import java.util.ArrayList;
import java.util.Scanner;

public class Empleado extends Persona{
    static Scanner read = new Scanner(System.in);
    private String horario;
    private int pr_vendidos;

    public Empleado() {
        super();
    }

    public Empleado(String horario, int pr_vendidos) {
        this.horario = horario;
        this.pr_vendidos = pr_vendidos;
    }

    
    public Empleado(String horario, int pr_vendidos, String nombre, int id, String user, String password, String mail) {
        super(nombre, id, user, password, mail);
        this.horario = horario;
        this.pr_vendidos = pr_vendidos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getPr_vendidos() {
        return pr_vendidos;
    }

    public void setPr_vendidos(int pr_vendidos) {
        this.pr_vendidos = pr_vendidos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "horario=" + horario + ", pr_vendidos=" + pr_vendidos + '}';
    }
    
    public Empleado Empleadosadd(){
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
        System.out.println("Horario(Hora inicio - Hora salida): ");
        String h = read.next();
        System.out.println("Numero de productos vendidos: ");
        int pv = read.nextInt();
        return new Empleado(h, pv, nombre, id, u, contraseña, correo);
    }
    
    public void Empleadosmod(Empleado e){
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
        System.out.println("Horario(Hora inicio - Hora salida): ");
        String h = read.next();
        System.out.println("Numero de productos vendidos: ");
        int pv = read.nextInt();
        e.setHorario(h);
        e.setPr_vendidos(pv);
        e.setNombre(nombre);
        e.setId(id);
        e.setUser(u);
        e.setPassword(contraseña);
        e.setMail(correo);
    }
    
    public void Empleadosdel(ArrayList<Empleado> e){
        for (int i = 0; i < e.size(); i++) {
            System.out.println("[" + i + "] {{" + e.get(i) + "}");
        }
        System.out.println("Prenda a eliminar: ");
        int p = read.nextInt();
        if (p < 0 || p > e.size()) {
            System.out.println("Posicion fuera de rango");
        } else {
            e.remove(e.get(p));
        }
    }
    
}
