package lab3_davidzavala_ronalzuniga;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_DavidZavala_RonalZuniga {

    static Scanner read = new Scanner(System.in);

    //Clases instanceadas
    static Cliente C = new Cliente();
    static Empleado Em = new Empleado();
    static Tienda Ti = new Tienda();
    static Kiosco Ki = new Kiosco(Ti);
    static Restaurante Re = new Restaurante();
    static Ropa Ro = new Ropa();
    static Juguetes Ju = new Juguetes();
    static Comidas Co = new Comidas();
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
                        boolean spy = true;
                        while (spy == true) {
                            System.out.println("A. Locales");
                            System.out.println("B. Personas");
                            System.out.println("C. Productos");
                            System.out.println("X. Atrás");
                            System.out.print("Opcion: ");
                            char oop = read.next().toUpperCase().charAt(0);
                            switch (oop) {
                                case 'A': {
                                    boolean band = false;
                                    while (band == false) {//Locales
                                        System.out.println("a. Agregar");
                                        System.out.println("b. Eliminar");
                                        System.out.println("c. Modificar");
                                        System.out.println("x. Atras");
                                        char opc = read.next().toLowerCase().charAt(0);
                                        switch (opc) {
                                            case 'a': {//Agregar
                                                System.out.println("1. Tiendas \n2. Kiosco \n3.Restaurante");
                                                System.out.println("Opcion: ");
                                                int loc = read.nextInt();
                                                switch (loc) {
                                                    case 1: {
                                                        Ti.TiendaAdd(EmpleadosAL);
                                                        break;
                                                    }
                                                    case 2: {
                                                        Ki.KioscoAdd(EmpleadosAL);
                                                        break;
                                                    }
                                                    case 3: {
                                                        Re.RestAdd(EmpleadosAL);
                                                        break;
                                                    }
                                                    default: {
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            case 'b': {//Eliminar
                                                System.out.println("1. Tiendas \n2. Kiosco \n3.Restaurante");
                                                System.out.println("Opcion: ");
                                                int loc = read.nextInt();
                                                switch (loc) {
                                                    case 1: {
                                                        Ti.TiendeDel(LocalesAL);
                                                        break;
                                                    }
                                                    case 2: {
                                                        Ki.KioscoDel(LocalesAL);
                                                        break;
                                                    }
                                                    case 3: {
                                                        Re.Restdel(LocalesAL);
                                                        break;
                                                    }
                                                    default: {
                                                        break;
                                                    }
                                                }
                                                break;
                                            }

                                            case 'c': {//Modificar
                                                System.out.println("1. Tiendas \n2. Kiosco \n3.Restaurante");
                                                System.out.println("Opcion: ");
                                                int loc = read.nextInt();
                                                switch (loc) {
                                                    case 1: {
                                                        int j = 1;
                                                        int i;
                                                        for (i = 0; i < LocalesAL.size(); i++) {
                                                            if (LocalesAL.get(i) instanceof Tienda) {
                                                                System.out.println("[" + j + "] {{" + LocalesAL.get(i) + "}");
                                                                j++;
                                                            }
                                                        }
                                                        System.out.println("Elija la tienda que desea Modificar:");
                                                        int tie = read.nextInt();
                                                        if (tie < 1 || tie > j) {
                                                            System.out.println("Tienda inexistente");
                                                        } else {
                                                            Ti.TiendaMod((Tienda) LocalesAL.get(i), EmpleadosAL);
                                                        }
                                                        break;
                                                    }
                                                    case 2: {
                                                        int j = 1;
                                                        int i;
                                                        for (i = 0; i < LocalesAL.size(); i++) {
                                                            if (LocalesAL.get(i) instanceof Kiosco) {
                                                                System.out.println("[" + j + "] {{" + LocalesAL.get(i) + "}");
                                                                j++;
                                                            }
                                                        }
                                                        System.out.println("Elija la tienda que desea Modificar:");
                                                        int tie = read.nextInt();
                                                        if (tie < 1 || tie > j) {
                                                            System.out.println("Tienda inexistente");
                                                        } else {
                                                            Ki.KioscoMod((Kiosco) LocalesAL.get(i), EmpleadosAL);
                                                        }
                                                        break;
                                                    }
                                                    case 3: {
                                                        int j = 1;
                                                        int i;
                                                        for (i = 0; i < LocalesAL.size(); i++) {
                                                            if (LocalesAL.get(i) instanceof Kiosco) {
                                                                System.out.println("[" + j + "] {{" + LocalesAL.get(i) + "}");
                                                                j++;
                                                            }
                                                        }
                                                        System.out.println("Elija la tienda que desea Modificar:");
                                                        int tie = read.nextInt();
                                                        if (tie < 1 || tie > j) {
                                                            System.out.println("Tienda inexistente");
                                                        } else {
                                                            Re.Restmod((Restaurante) LocalesAL.get(i), EmpleadosAL);
                                                        }
                                                        break;
                                                    }
                                                    default: {
                                                        System.out.println("Opción inválida");
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            case 'x': {
                                                band = true;
                                                break;
                                            }
                                            default: {
                                                System.out.println("Opcion invalida");
                                                break;
                                            }
                                        }
                                    }
                                }
                                case 'B': {
                                    boolean band = false;
                                    while (band == false) {//Personas
                                        System.out.println("a. Agregar");
                                        System.out.println("b. Eliminar");
                                        System.out.println("c. Modificar");
                                        System.out.println("x. Atras");
                                        char opc = read.next().toLowerCase().charAt(0);
                                        switch (opc) {
                                            case 'a': {//Agregar
                                                EmpleadosAL.add(Em.Empleadosadd());
                                                break;
                                            }
                                            case 'b': {//Eliminar
                                                int i;
                                                for (i = 0; i < EmpleadosAL.size(); i++) {
                                                    System.out.println("[" + i + "] {{" + EmpleadosAL.get(i) + "}");

                                                }
                                                System.out.println("Elija empleado que desea Modificar:");
                                                int tie = read.nextInt();
                                                if (tie < 0 || tie > i) {
                                                    System.out.println("Empleado inexistente");
                                                } else {
                                                    Em.Empleadosmod(EmpleadosAL.get(i));
                                                }
                                                break;
                                            }
                                            case 'c': {//Modificar
                                                Em.Empleadosdel(EmpleadosAL);
                                                break;
                                            }
                                            case 'x': {
                                                band = true;
                                                break;
                                            }
                                            default: {
                                                System.out.println("Opcion invalida");
                                                break;
                                            }
                                        }
                                    }
                                }
                                case 'C': {
                                    boolean band = false;
                                    while (band == false) {//Productos
                                        System.out.println("a. Agregar");
                                        System.out.println("b. Eliminar");
                                        System.out.println("c. Modificar");
                                        System.out.println("x. Atras");
                                        char opc = read.next().toLowerCase().charAt(0);
                                        switch (opc) {
                                            case 'a': {//Agregar
                                                System.out.println("1.Ropa 2.Juguetes 3.Comida");
                                                System.out.println("Opcion: ");
                                                int loc = read.nextInt();
                                                switch (loc) {
                                                    case 1: {
                                                        ProductoAL.add(Ro.Ropaadd());
                                                        break;
                                                    }
                                                    case 2: {
                                                        ProductoAL.add(Ju.Juguetesadd());
                                                        break;
                                                    }
                                                    case 3: {
                                                        ProductoAL.add(Co.Comidasadd());
                                                        break;
                                                    }
                                                    default: {
                                                        System.out.println("Opcion invalida");
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            case 'c': {//Modificar
                                                System.out.println("1.Ropa 2.Juguetes 3.Comida");
                                                System.out.println("Opcion: ");
                                                int loc = read.nextInt();
                                                switch (loc) {
                                                    case 1: {
                                                        int j = 1;
                                                        int i;
                                                        for (i = 0; i < ProductoAL.size(); i++) {
                                                            if (ProductoAL.get(i) instanceof Ropa) {
                                                                System.out.println("[" + j + "]{" + ProductoAL.get(i) + "}");
                                                            }
                                                        }
                                                        System.out.println("Elija el producto a eliminar: ");
                                                        int rop = read.nextInt();
                                                        if (rop < 1 || rop > j) {
                                                            System.out.println("Prenda inexistente.");
                                                        } else {
                                                            Ro.Ropamod((Ropa) ProductoAL.get(i));
                                                        }
                                                        break;
                                                    }
                                                    case 2: {
                                                        int j = 1;
                                                        int i;
                                                        for (i = 0; i < ProductoAL.size(); i++) {
                                                            if (ProductoAL.get(i) instanceof Juguetes) {
                                                                System.out.println("[" + j + "]{" + ProductoAL.get(i) + "}");
                                                            }
                                                        }
                                                        System.out.println("Elija el producto a eliminar: ");
                                                        int rop = read.nextInt();
                                                        if (rop < 1 || rop > j) {
                                                            System.out.println("Juguete inexistente.");
                                                        } else {
                                                            Ju.Juguetesmod((Juguetes) ProductoAL.get(i));
                                                        }
                                                        break;
                                                    }
                                                    case 3: {
                                                        int j = 1;
                                                        int i;
                                                        for (i = 0; i < ProductoAL.size(); i++) {
                                                            if (ProductoAL.get(i) instanceof Comidas) {
                                                                System.out.println("[" + j + "]{" + ProductoAL.get(i) + "}");
                                                            }
                                                        }
                                                        System.out.println("Elija el platillo a eliminar: ");
                                                        int rop = read.nextInt();
                                                        if (rop < 1 || rop > j) {
                                                            System.out.println("Platillo inexistente.");
                                                        } else {
                                                            Co.Comidasmod((Comidas) ProductoAL.get(i));
                                                        }
                                                        break;
                                                    }
                                                    default: {
                                                        System.out.println("Opcion invalida");
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            case 'b': {//Eliminar
                                                System.out.println("1.Ropa 2.Juguetes 3.Comida");
                                                System.out.println("Opcion: ");
                                                int loc = read.nextInt();
                                                switch (loc) {
                                                    case 1: {
                                                        Ro.Ropadel(ProductoAL);
                                                        break;
                                                    }
                                                    case 2: {
                                                        Ju.Juguetesdel(ProductoAL);
                                                        break;
                                                    }
                                                    case 3: {
                                                        Co.Comidasdel(ProductoAL);
                                                        break;
                                                    }
                                                    default: {
                                                        System.out.println("Opcion invalida");
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            case 'x': {
                                                band = true;
                                                break;
                                            }
                                            default: {
                                                System.out.println("Opcion invalida");
                                                break;
                                            }
                                        }
                                    }
                                }
                                case 'X': {
                                    spy = false;
                                }
                                default:
                            }
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

    static void Print(ArrayList array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("[" + i + "] {{" + array.get(i) + "}");
        }
    }

}
