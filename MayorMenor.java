//7. Escribe un programa que permita al usuario ingresar una lista de números enteros y encuentre el número más grande y el número más pequeño de la lista.

import javax.swing.JOptionPane;

public class MayorMenor {
    public static void main(String[] args) {
        // Pedimos al usuario que ingrese una lista de números separados por comas
        String lista = JOptionPane.showInputDialog(null, "Ingrese una lista de números enteros separados por comas:");
        
        // Convertimos la lista de números en un array de enteros
        String[] numerosStr = lista.split(",");
        int[] numeros = new int[numerosStr.length];
        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i].trim());
        }
        
        // Buscamos el número más grande y el número más pequeño en la lista
        int maximo = numeros[0];
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        
        // Mostramos el resultado en una ventana de diálogo
        JOptionPane.showMessageDialog(null, "El número más grande de la lista es: " + maximo + "\nEl número más pequeño de la lista es: " + minimo);
    }
}
