//9. Escribe un programa que solicite al usuario una cadena de caracteres y muestre cuántas veces aparece la letra "a" en la cadena.

import javax.swing.JOptionPane;

public class ContarLetraFor {
    public static void main(String[] args) {
        // Pedimos al usuario que ingrese una cadena de caracteres
        String cadena = JOptionPane.showInputDialog(null, "Ingrese una cadena de caracteres:");
        
        // Contamos cuántas veces aparece la letra "a" en la cadena
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
                contador++;
            }
        }
        
        // Mostramos el resultado en una ventana de diálogo
        JOptionPane.showMessageDialog(null, "La letra \"a\" aparece " + contador + " veces en la cadena.");
    }
}
