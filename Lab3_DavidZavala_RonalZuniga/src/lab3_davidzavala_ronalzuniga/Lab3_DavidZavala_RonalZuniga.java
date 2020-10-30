package lab3_davidzavala_ronalzuniga;

import java.util.Scanner;

public class Lab3_DavidZavala_RonalZuniga {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        boolean Flag = true;
        while (Flag == true) {
            System.out.println("");
            System.out.println("");
            System.out.println("0. Salir");
            int op = read.nextInt();
            switch (op) {
                case 1: {
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

}
