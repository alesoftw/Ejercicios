//2. Escribe un programa que calcule el factorial de un número ingresado.

import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero: "));
        int factorial = 1;
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        JOptionPane.showMessageDialog(null, "El factorial de " + num + " es " + factorial);
    }
}
