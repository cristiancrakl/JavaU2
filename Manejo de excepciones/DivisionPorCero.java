import java.util.Scanner;

public class DivisionPorCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        try {
            double resultado = dividir(num1, num2);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        }
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }
}