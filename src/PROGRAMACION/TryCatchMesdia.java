package PROGRAMACION;

import javax.swing.JOptionPane;
public class TryCatchMesdia {
    public static void main(String[] args) {

        int mes = 0;
        boolean validar = false;
        do
            try {
                String texto = JOptionPane.showInputDialog("Dime un mes del año en numero");
                mes = Integer.parseInt(texto);
                if (mes >= 1 && mes <= 12){
                    validar = true;
                } else {
                    validar = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Introduce un valor correcto");
            }
        while (validar == false);

        switch (mes){
            case 1:
                JOptionPane.showMessageDialog(null, "Enero 31 dias");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Febrero 28 dias");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Marzo 31 dias");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Abril 30 dias");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Mayo 31 dias");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Junio 30 dias");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Julio 31 dias");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Agosto 31 dias");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Septiembre 30 dias");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Octubre 31 dias");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "Noviembre 30 dias");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Diciembre 31 dias");
                break;

        }

    }
}