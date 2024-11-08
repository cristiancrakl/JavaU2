import java.util.Scanner;

class Cuenta {
    Scanner scanner = new Scanner(System.in);

    String accountName;
    double Money;

    public Cuenta(String accountName, double Money) {
        this.accountName = accountName;
        this.Money = Money;
    }

    public void ingresarMoney() {

        System.out.print("ingrese la cantidad a ser ingresada:");
        int ingresarMoney = scanner.nextInt();

        if (ingresarMoney >= 0) {

            Money += ingresarMoney;
            System.out.println("su nuevo saldo es: " + Money+" euros");

        } else {

            System.out.println("No se puede ingresar una cantidad negativa");

        }

    }

    public void retirarMoney() {


        System.out.print("ingrese la cantidad a ser retirada:");
        int retirarMoney = scanner.nextInt();
        if (retirarMoney >= 0) {
            if (retirarMoney >= Money) {
                Money -= retirarMoney;

                System.out.println("su nuevo saldo despues de retirar es: " + Money+" euros");
                
            } else {
                System.out.println("No hay suficiente dinero en la cuenta");
            }
        }

    }

    public void getaccountStatus() {

        System.out.println("el Titular de la cuenta es: " + accountName);
        System.out.println("el monto de la cuenta es: " + Money + "Euros");

    }

}
