package PROGRAMACION;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, i, n;

        System.out.print("Ingresa un numero: ");
        n = sc.nextInt();

        c = 0;

        for (i = 1; i <=n; i++) {
            if ((n % i) == 0) {
                c++;
            }
        }

        if (c <= 2) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }

    public static class PiramideInvertida {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < num - i; j++) {
                    System.out.print("* ");
                }

                System.out.println("");
            }
        }

    }
}