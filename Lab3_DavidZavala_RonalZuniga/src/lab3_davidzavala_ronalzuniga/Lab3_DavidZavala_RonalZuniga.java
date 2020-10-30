package lab3_davidzavala_ronalzuniga;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_DavidZavala_RonalZuniga {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        boolean Flag = true;
        boolean Login = false;
        boolean Sudo = false;
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
                    String Usuario = read.next();
                    System.out.println("Contraseña:");
                    String Contraseña = read.next();
                    if (Usuario.equals("SUDO") && Contraseña.equals("")) {
                        Sudo = true;
                    } else if (Usuario.equals("SUDO") && Contraseña.equals("")) { // modificar para las personas normales
                        Login = true;
                    } else {
                        System.out.println("Perfil inexistente intentelo de nuevo");
                        System.out.println("Usuario:");
                        Usuario = read.next();
                        System.out.println("Contraseña:");
                        Contraseña = read.next();
                    }
                    break;
                }
                case 2: {
                    
                    break;
                }
                case 3: {
                    
                    break;
                }
                case 4: {
                    
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
                        switch (oop){
                            case 'A':
                            case 'C':
                            case 'D':
                            case 'X':
                            default :
                        }
                    }else{
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
