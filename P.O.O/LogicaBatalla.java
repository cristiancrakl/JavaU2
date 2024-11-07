import java.util.Scanner;

public class LogicaBatalla {

    public void run() {
        Scanner scanner = new Scanner(System.in);

        CreadordePersonas persona = new CreadordePersonas();
        CreadordeSupers superheroe = new CreadordeSupers();

        int opcion = 1;

        while (opcion == 1) {

            System.out.println("De quien desea ver las estadisticas  1.personas 2.super heroes: ");
            int opcionVer = scanner.nextInt();

            switch (opcionVer) {
                case 1:

                    persona.sheryn.getStats();
                    persona.karen.getStats();

                    break;

                case 2:
                    superheroe.cristian.getStatSuper();
                    System.out.println("al ver las estadisticas "+ superheroe.cristian.nombre +" se curo");
                    superheroe.cristian.curarse();
                    superheroe.cristian.getStatSuper();


                    break;
                case 3:

                persona.sheryn.getStats();
                persona.karen.getStats();
                superheroe.cristian.getStatSuper();
                    break;
            }

            System.out.println("");
            System.out.println("1.ingresar 2.salir");
            opcion = scanner.nextInt();
        }
        scanner.close();

    }
}
