package PROGRAMACION;


import java.util.Arrays;
import java.util.Scanner;  //import de la clase Scanner

public class nota {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  //Se crea un objeto Scanner
        Double n;
        System.out.print("Introduzca la nota del examen: ");
        n = sc.nextDouble(); //leer un dato

        if (n < 3){
            System.out.println("Muy deficiente");
        } else if (n >= 3 && n < 5){
            System.out.println("Insuficiente");
        } else if (n >= 5 && n < 6){
            System.out.println("Suficiente");
        } else if (n >= 6 && n < 7){
            System.out.println("Bien");
        } else if (n >=7 && n < 9){
            System.out.println("Notable");
        } else if (n >= 9 && n < 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Matrícula de honor");
        }
    }

    public static class DosTablas {
        public static void main(String[] args) {
           int [] a = new int [5];
           int [] b = new int[5];
           int [] c = new int [10];
           Scanner sc = new Scanner (System.in);
            for (int i = 0; i < a.length; i++) {
                System.out.println("Introduce el numero" + i + "del array a:");
                a[i]=sc.nextInt();
                b[i]=sc.nextInt();

            }
            for (int i = 0; i < b.length; i++) {
                System.out.println("Introduce el numero" + i + "del array b:");
            }
            int posicionC=0;
            for (int i = 0; i < a.length; i++) {
                c[posicionC]=a[i];
                posicionC++;
                c[posicionC]=b[i];
                posicionC++;
            }
            System.out.println(Arrays.toString(c));
        }
    }
}