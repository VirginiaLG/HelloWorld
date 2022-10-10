package PROGRAMACION;

import java.util.Scanner;

public class MesDia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  //Se crea un objeto Scanner que se utiliza para leer datos que el usuario introduce por teclado
        Integer n; // Iniciar variable sin valor
        System.out.print("Introduzca el mes a calcular: "); //Mensaje
        n = sc.nextInt(); //leer un dato numérico Int


        switch(n){ //una instrucción de múltiples vías que evalúa distintas opciones o “casos” y selecciona una opción entre varias.
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31"); // Mensaje de resultado
                break; // si esta entre los casos deja de buscar
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:

                System.out.println("28");
                break;

        }


    }

}