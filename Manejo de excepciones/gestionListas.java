import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionListas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el índice del elemento que desea acceder: ");
        int indice = scanner.nextInt();

        try {
            String elemento = lista.get(indice);
            System.out.println("Elemento en el índice " + indice + ": " + elemento);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites de la lista.");
        }
    }
}