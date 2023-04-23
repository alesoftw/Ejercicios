//4. Escribe un programa que solicite al usuario una cadena de caracteres y cuente cuántas vocales tiene.

import javax.swing.JOptionPane;

public class ContarVocales {
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena de caracteres: ");
        
        int contadorVocales = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (esVocal(caracter)) {
                contadorVocales++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "La cadena " + cadena + " tiene " + contadorVocales + " vocales");
    }
    
    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
