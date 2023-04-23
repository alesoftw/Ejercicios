//1. Escribe un programa que solicite al usuario un número entero y determine
//si es un número primo o no.

import javax.swing.JOptionPane;

public class NumeroPrimo {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero: "));
        boolean esPrimo = true;
        
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        
        if (esPrimo) {
            JOptionPane.showMessageDialog(null, "El número " + num + " es primo.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + num + " no es primo.");
        }
    }
}
