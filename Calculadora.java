//3. Crea un programa que simule una calculadora básica. Debe permitir al usuario ingresar dos números y elegir entre sumar, restar, multiplicar o dividir.



import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        
        String operacion = JOptionPane.showInputDialog("Elija una operación: +, -, *, /");
        
        double resultado;
        
        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / (double) num2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida");
                return;
        }
        
        JOptionPane.showMessageDialog(null, "El resultado de la operación " + num1 + " " + operacion + " " + num2 + " es " + resultado);
    }
}
