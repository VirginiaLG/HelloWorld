package PROGRAMACION;

import java.util.Scanner;
public class UnoTreslista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = 1;
        int z = 3;
        while (y<=100) {
            System.out.print(y + " ");
            y = y + 1;}
        System.out.println("");
        while (z<=100){
            System.out.print(z + " ");
            z = z + 3;
        }
    }
}