//5. Crea un programa que genere una tabla de multiplicar para los números del 1 al 10.

import javax.swing.JOptionPane;

public class TablaMultiplicar {
    public static void main(String[] args) {
        String tabla = "";
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                tabla += i*j + "\t";
            }
            tabla += "\n";
        }
        
        JOptionPane.showMessageDialog(null, "Tabla de multiplicar del 1 al 10:\n\n" + tabla);
    }
}
