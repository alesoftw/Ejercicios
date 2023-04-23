//6. Crea un programa que genere una lista de números aleatorios y luego los ordene de menor a mayor.

import java.util.Random;
import javax.swing.JOptionPane;

public class OrdenarNumeros {
    public static void main(String[] args) {
        // Definimos el tamaño de la lista y el rango de valores de los números aleatorios
        int tamaño = 10;
        int minimo = 1;
        int maximo = 100;
        
        // Creamos la lista de números aleatorios
        int[] numeros = new int[tamaño];
        Random rand = new Random();
        for (int i = 0; i < tamaño; i++) {
            numeros[i] = rand.nextInt(maximo - minimo + 1) + minimo;
        }
        
        // Ordenamos la lista de menor a mayor utilizando el algoritmo de selección
        for (int i = 0; i < tamaño - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < tamaño; j++) {
                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int temp = numeros[i];
            numeros[i] = numeros[indiceMenor];
            numeros[indiceMenor] = temp;
        }
        
        // Mostramos la lista ordenada en una ventana de diálogo
        String listaOrdenada = "";
        for (int i = 0; i < tamaño; i++) {
            listaOrdenada += numeros[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, "Lista de números ordenados de menor a mayor:\n\n" + listaOrdenada);
    }
}
