//8. Crea un programa que solicite al usuario un número entero y muestre la suma de todos los números impares desde 1 hasta ese número.

import javax.swing.JOptionPane;

public class SumaImparesFor {
    public static void main(String[] args) {
        // Pedimos al usuario que ingrese un número entero
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero:"));
        
        // Calculamos la suma de los números impares desde 1 hasta el número ingresado
        int suma = 0;
        for (int i = 1; i <= numero; i += 2) {
            suma += i;
        }
        
        // Mostramos el resultado en una ventana de diálogo
        JOptionPane.showMessageDialog(null, "La suma de los números impares desde 1 hasta " + numero + " es: " + suma);
    }
}
