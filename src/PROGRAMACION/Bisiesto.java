package PROGRAMACION;

import java.util.Scanner;
public class Bisiesto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //crear objeto scanner
        int m; //meses
        int a; //año
        System.out.println("Introduzca el mes (1-12)");
        m = sc.nextInt(); //asigna a la variable n el número entero introducido por teclado
        System.out.println("Introduzca el año");
        a = sc.nextInt(); //asigna a la variable n el número entero introducido por teclado

        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
            case 2:
                //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400.
                if ((a % 4 == 0 && a % 100 != 0) || (a % 100 == 0 && a % 400 == 0)) {
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
        }
    }
}