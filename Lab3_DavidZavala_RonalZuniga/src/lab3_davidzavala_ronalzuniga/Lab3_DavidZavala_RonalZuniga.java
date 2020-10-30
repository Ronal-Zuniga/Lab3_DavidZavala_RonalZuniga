package lab3_davidzavala_ronalzuniga;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_DavidZavala_RonalZuniga {

    static Scanner read = new Scanner(System.in);
    
    //Clases instanceadas
    static Cliente C = new Cliente();
    //Araylists
    static ArrayList<Local> LocalesAL = new ArrayList();
    static ArrayList<Empleado> EmpleadosAL = new ArrayList();
    static ArrayList<Cliente> ClientesAL = new ArrayList();
    static ArrayList<Productos> ProductoAL = new ArrayList();

    public static void main(String[] args) {
        boolean Flag = true;
        boolean Login = false;
        boolean Sudo = false;
        Cliente cliente = null;
        String Usuario = null;
        String Contraseña = null;
        while (Flag == true) {
            System.out.println("Equipo Dinavodka");
            System.out.println("1. Log in");
            System.out.println("2. Crear Usuario");
            System.out.println("3. Comprar");
            System.out.println("4. Log out");
            System.out.println("5. Administración");
            System.out.println("0. Salir");
            int op = read.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Usuario:");
                    Usuario = read.next();
                    System.out.println("Contraseña:");
                    Contraseña = read.next();
                    if (Usuario.equals("SUDO") && Contraseña.equals("")) {
                        Sudo = true;
                        System.out.println("Administrador autenticado");
                    } else if (Usuario.equals("SUDO") && Contraseña.equals("")) { // modificar para las personas normales
                        for (int i = 0; i < ClientesAL.size(); i++) {
                            if (ClientesAL.get(i).getUser().equals(Usuario) && ClientesAL.get(i).getPassword().equals(Contraseña)) {
                                cliente = ClientesAL.get(i);
                            }
                        }
                        Login = true;
                        System.out.println("Usuario autenticado");
                    } else {
                        System.out.println("Perfil inexistente Ultimo intento");
                        System.out.println("Usuario:");
                        Usuario = read.next();
                        System.out.println("Contraseña:");
                        Contraseña = read.next();
                    }
                    break;
                }
                case 2: {
                    ClientesAL.add(C.Clientesadd(ClientesAL));
                    break;
                }
                case 3: {
                    if (Login == true) {
                        Print(LocalesAL);
                        System.out.print("Elija un local: ");
                        int oop = read.nextInt();
                        if (oop < 0 || oop > LocalesAL.size()) {
                            System.out.println("Opción inválida");
                        } else {
                            Print(LocalesAL.get(oop).getProductos());
                            System.out.print("Producto a comprar: ");
                            int Aop = read.nextInt();
                            if (Aop < 0 || Aop > LocalesAL.size()) {
                                System.out.println("Opción inválida");
                            } else {
                                if (cliente.getDinero() >= LocalesAL.get(oop).getProductos().get(Aop).getPrecio()) {
                                    cliente.setDinero(cliente.getDinero() - LocalesAL.get(oop).getProductos().get(Aop).getPrecio());
                                    cliente.getProductos().add(LocalesAL.get(oop).getProductos().get(Aop));
                                } else {
                                    System.out.println("Dinero insuficiente.");
                                }
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    if (Login == true) {
                        for (int i = 0; i < ClientesAL.size(); i++) {
                            if (ClientesAL.get(i).getUser().equals(Usuario) && ClientesAL.get(i).getPassword().equals(Contraseña)) {
                                ClientesAL.get(i).setDinero(cliente.getDinero());
                                ClientesAL.get(i).setProductos(cliente.getProductos());
                            }
                        }
                    } else {
                        System.out.println("Compelte login antes");
                    }
                    break;
                }
                case 5: {
                    if (Sudo == true) {
                        System.out.println("A. Locales");
                        System.out.println("B. Personas");
                        System.out.println("C. Productos");
                        System.out.println("X. Atrás");
                        System.out.print("Opcion: ");
                        char oop = read.next().toUpperCase().charAt(0);
                        switch (oop) {
                            case 'A':{System.out.println("Agregar");System.out.println("Agregar");System.out.println("Agregar");System.out.println("x. Atras");}
                            case 'X':
                            default:
                        }
                    } else {
                        System.out.println("Credenciales necesarias");
                    }
                    break;
                }
                case 0: {
                    Flag = false;
                    break;
                }
                default: {
                    System.out.println("Opción inválida \nIntentelo nuevamente");
                }
            }
        }
    }

    static void Print(ArrayList<Productos> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) instanceof Ropa || array.get(i) instanceof Juguetes ) {
            System.out.println("[" + i + "] {{" + array.get(i) + "}");
            }
        }
    }

}
