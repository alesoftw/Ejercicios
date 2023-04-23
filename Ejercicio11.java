//11. Escribe un programa que permita al usuario ingresar números enteros hasta que ingrese el número 0. Luego, muestra la suma de todos los números ingresados.

import javax.swing.JOptionPane;

public class Ejercicio11 {
    public static void main(String[] args) {
        int numero = 0;
        int suma = 0;
        
        while (true) {
            String input = JOptionPane.showInputDialog("Ingresa un número entero (0 para salir):");
            numero = Integer.parseInt(input);
            if (numero == 0) {
                break;
            }
            suma += numero;
        }
        
        JOptionPane.showMessageDialog(null, "La suma de los números ingresados es: " + suma);
    }
}
