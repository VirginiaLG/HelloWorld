package PROGRAMACION;

import javax.swing.*;
import java.util.Scanner;

public class FilasColumnas {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Introduce el numero de filas1: ");
        int filas1 = sc1.nextInt();
        System.out.print("Introduce el numero de filas2: ");
        int filas2 = sc1.nextInt();
        sc1.close();
        for (int x=1; x<=filas1; x=x+1) {
            for (int y=1; y <=filas2; y = y + 1)
                System.out.print("*");
            System.out.println();
        }
    }
}