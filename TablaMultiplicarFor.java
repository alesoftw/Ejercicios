//10. Crea un programa que solicite al usuario un número entero y muestre la tabla de multiplicar de ese número.

import javax.swing.JOptionPane;

public class TablaMultiplicarFor {
    public static void main(String[] args) {
        // Pedimos al usuario que ingrese un número entero
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero:"));
        
        // Mostramos la tabla de multiplicar del número ingresado
        String tabla = "";
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabla += numero + " x " + i + " = " + resultado + "\n";
        }
        JOptionPane.showMessageDialog(null, "Tabla de multiplicar de " + numero + ":\n\n" + tabla);
    }
}
