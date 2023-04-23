//12. Escribe un programa que solicite al usuario una serie de números enteros y muestre cuántos números positivos y cuántos números negativos hay en la serie.

import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static void main(String[] args) {
        int positivos = 0;
        int negativos = 0;
        int cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números quieres ingresar?"));

        for (int i = 1; i <= cantidadNumeros; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número #" + i));
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        JOptionPane.showMessageDialog(null, "En la serie ingresada hay " + positivos + " números positivos y " + negativos + " números negativos.");
    }
}
