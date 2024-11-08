class SuperHeroe extends Persona {

    String superPoder;
    int ataque;

    public SuperHeroe(String nombre, int edad, int vida,int ataque ,boolean estavivo, String superPoder,int sexo) {

        super(nombre, edad, vida, ataque, estavivo, sexo);
        this.superPoder = superPoder;
        this.ataque=ataque;
        

    }

    public void getStatSuper() {
        
        System.out.println();
        System.out.println("Stats de Super Heroe:");
        System.out.println();
        
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("vida: " + vida);
        System.out.println("Su super poder es: " + superPoder);
        System.out.println("Ataque: " + ataque);
        estavivoComprobar();
        
        
        System.out.println("-------------------------------------------------------------------");
        System.out.println();

    }

    public void curarse() {

        if (estavivo == false) {

            System.out.println(nombre+" no puede curarse porque murio");

        } else {

            vida += 10;

        }

    }

}