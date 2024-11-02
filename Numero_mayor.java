import java.util.Scanner;

public class Numero_mayor {

    public static void mayorNumero(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese tres numeros para saber cual es el mayor");
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int c  =scanner.nextInt();
        
        int Numero_mayor=Math.max(a, Math.max(b, c));
        

         System.out.println("el numero mayor es: "+Numero_mayor);
    }

    public static void main(String[] args) {

        mayorNumero();

    }

}
