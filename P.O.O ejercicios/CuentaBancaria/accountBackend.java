import java.util.Scanner;

public class accountBackend {
    Scanner scanner = new Scanner(System.in);

    public void AccountBackend() {

        Cuenta account1 = new Cuenta("Cristian Morales", 50.5);
        Cuenta account2 = new Cuenta("Stefany Feria", 350.6);

        int opcionWhile = 1;
        while (opcionWhile != 0) {

            System.out.println("que desea hacer 1. ver el estatus de las cuentas 2. depositar 3. retirar");
            int opcionSwitch = scanner.nextInt();
            switch (opcionSwitch) {
                case 1:

                    System.out.println(account1.accountName + " tiene un saldo de " + account1.Money);
                    System.out.println(account2.accountName + " tiene un saldo de " + account2.Money);
                    break;

                case 2:

                    account1.ingresarMoney();
                    account2.ingresarMoney();

                    break;

                case 3:

                    account1.retirarMoney();
                    account2.retirarMoney();

                    break;
            }

            
            System.out.println("¿Desea continuar? 1. si 0. no");
            opcionWhile = scanner.nextInt();
        }

        scanner.close();

    }

}
