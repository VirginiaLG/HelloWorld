package PROGRAMACION;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int x[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.println("Escribe un numero");
            x[i] = sc.nextInt();
        }
        for (int i = 0; i <x.length; i++) {
            System.out.print(x[i] + ", ");

        }
    }
}

