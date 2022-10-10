package PROGRAMACION;

import javax.swing.JOptionPane;
public class AñoMesBisiesto {
    public static void main(String[] args) {
        //inicializo la variable para el año.
        int anno = 0;
        //inicializo la variable para el mes.
        int mes = 0;
        //inicializo un booleano que me servirá para validar cuando el campo que introduzcan es correcto.
        boolean validar = false;
        //inicializo un booleano que será true si el año es bisiesto
        boolean bisiesto = false;
        //inicio un ciclo que se repetirá en caso de que no introduzcan el valor correcto.
        do{
            //pido el año por una ventana con JOptionPane.
            String texto = JOptionPane.showInputDialog("Introduce un año.");

            /*aquí le digo al programa que intente convertir el String texto a Int y lo guarde en anno,
            y que en caso de que no pueda porque no se haya introducido un numero adecuado, me recoja la
            excepción*/

            try {
                //conversion de String a Int antes indicada.
                anno = Integer.parseInt(texto);
                //aquí me voy a quitar los años negativos porque ya es pasarse. Si año es menor que 0...
                if(anno < 0){
                    //incorrecto, saca el mensaje y vuelve a probar porque validar no es true
                    JOptionPane.showMessageDialog(null, "El valor indicado no es " +
                            "correcto");
                } else {
                    //el numero es correcto y se sale aquí del ciclo porque el valor es correcto
                    validar = true;
                }
                //Si el usuario no ha introducido un numero, excepción y mensaje de error igual
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor indicado no es " +
                        "correcto");
            }
            /*esto significa lo mismo que validar == false, y el bucle se repite hasta que validar
            sea true*/
        } while (!validar);

        //primer caso en el que podría ser bisiesto
        if (anno % 4 == 0 && anno % 100 != 0){
            bisiesto = true;
            //segundo caso en el que podría ser bisiesto
        } else if (anno % 100 == 0 && anno % 400 == 0){
            bisiesto = true;
            //este caso es no bisiesto asi que no pasa nada
        } else

            //mismo ciclo del año para el mes
            do {
                String texto = JOptionPane.showInputDialog("Introduce un mes en su correspondiente numero.");
                try{
                    mes = Integer.parseInt(texto);
                    if (mes < 1 && mes > 12){
                        JOptionPane.showMessageDialog(null, "El valor indicado no es " +
                                "correcto");
                    } else {
                        validar = false;
                    }
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "El valor indicado no es " +
                            "correcto");
                }
                //está invertido porque venía de true del anterior ciclo y aprovecho la variable
            } while(validar);

        //un pedazo de if que saca el año, mes y te dice los días de ese mes.
        if(mes == 1){
            if(bisiesto == true){
                JOptionPane.showMessageDialog(null,"El año " + anno + " es bisiesto" +
                        " y enero tiene 31 días.");
            } else {
                JOptionPane.showMessageDialog(null,"El año " + anno + " no es bisiesto" +
                        " y enero tiene 31 días.");
            }
        } else if (mes == 2){
            if(bisiesto == true){
                JOptionPane.showMessageDialog(null,"El año " + anno + " es bisiesto" +
                        " y febrero tiene 29 días.");
            } else {
                JOptionPane.showMessageDialog(null,"El año " + anno + " no es bisiesto" +
                        " y febrero tiene 28 días.");
            }
        } else if (mes == 3){
            if(bisiesto == true){
                JOptionPane.showMessageDialog(null,"El año " + anno + " es bisiesto" +
                        " y marzo tiene 31 días.");
            } else {
                JOptionPane.showMessageDialog(null,"El año " + anno + " no es bisiesto" +
                        " y marzo tiene 31 días.");
            }
        } else if (mes == 4){
            if(bisiesto == true){
                JOptionPane.showMessageDialog(null,"El año " + anno + " es bisiesto" +
                        " y abril tiene 30 días.");
            } else {
                JOptionPane.showMessageDialog(null,"El año " + anno + " no es bisiesto" +
                        " y abril tiene 30 días.");
            }
        } else if (mes == 5){
            if(bisiesto == true){
                JOptionPane.showMessageDialog(null,"El año " + anno + " es bisiesto" +
                        " y mayo tiene 31 días.");
            } else {
                JOptionPane.showMessageDialog(null,"El año " + anno + " no es bisiesto" +
                        " y mayo tiene 31 días.");
            }
        } else if (mes == 6){
            if(bisiesto == true){
                JOptionPane.showMessageDialog(null,"El año " + anno + " es bisiesto" +
                        " y junio tiene 30 días.");
            } else {
                JOptionPane.showMessageDialog(null,"El año " + anno + " no es bisiesto" +
                        " y junio tiene 30 días.");
            }
        } else if (mes == 7){
            if(bisiesto == true){
                JOptionPane.showMessageDialog(null,"El año " + anno + " es bisiesto" +
                        " y julio tiene 31 días.");
            } else {
                JOptionPane.showMessageDialog(null,"El año " + anno + " no es bisiesto" +
                        " y julio tiene 31 días.");
            }
        } else if (mes == 8){
            if(bisiesto == true){
                JOptionPane.showMessageDialog(null,"El año " + anno + " es bisiesto" +
                        " y agosto tiene 31 días.");
            } else {
                JOptionPane.showMessageDialog(null,"El año " + anno + " no es bisiesto" +
                        " y agosto tiene 31 días.");
            }
        } else if (mes == 9){
            if(bisiesto == true){
                JOptionPane.showMessageDialog(null,"El año " + anno + " es bisiesto" +
                        " y septiembre tiene 30 días.");
            } else {
                JOptionPane.showMessageDialog(null,"El año " + anno + " no es bisiesto" +
                        " y septiembre tiene 30 días.");
            }
        } else if (mes == 10){
            if(bisiesto == true){
                JOptionPane.showMessageDialog(null,"El año " + anno + " es bisiesto" +
                        " y octubre tiene 31 días.");
            } else {
                JOptionPane.showMessageDialog(null,"El año " + anno + " no es bisiesto" +
                        " y octubre tiene 31 días.");
            }
        } else if (mes == 11){
            if(bisiesto == true){
                JOptionPane.showMessageDialog(null,"El año " + anno + " es bisiesto" +
                        " y noviembre tiene 30 días.");
            } else {
                JOptionPane.showMessageDialog(null,"El año " + anno + " no es bisiesto" +
                        " y noviembre tiene 30 días.");
            }
        } else {
            if(bisiesto == true){
                JOptionPane.showMessageDialog(null,"El año " + anno + " es bisiesto" +
                        " y diciembre tiene 31 días.");
            } else {
                JOptionPane.showMessageDialog(null,"El año " + anno + " no es bisiesto" +
                        " y diciembre tiene 31 días.");
            }
        }
    }
}