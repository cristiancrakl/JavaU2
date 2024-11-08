class Persona {
    String nombre;
    int edad;
    int vida;
    boolean estavivo = true;
    int sexo;
    int ataque;

    public Persona(String nombre, int edad, int vida, int ataque, boolean estavivo, int sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.vida = vida;
        this.estavivo = estavivo;
        this.sexo = sexo;
        this.ataque = ataque;

    }

    public void estavivoComprobar() {

        if (sexo == 1) {
            if (vida <= 0) {
                estavivo = false;
                System.out.println(nombre + ": Esta muerto");
            } else {
                estavivo = true;
                System.out.println(nombre + ": Esta vivo");

            }
        } else if (sexo == 2) {
            if (vida <= 0) {
                estavivo = false;
                System.out.println(nombre + ": Esta muerta");
            } else {
                estavivo = true;
                System.out.println(nombre + ": Esta viva");

            }

        } else if (sexo == 3) {
            if (vida <= 0) {
                estavivo = false;
                System.out.println(nombre + ": Esta muerte");
            } else {
                estavivo = true;
                System.out.println(nombre + ": Esta vive");

            }
        }

    }

    public void sexoComprobar() {

        if (sexo == 1) {
            System.out.println(nombre + ": Es hombre");

        } else if (sexo == 2) {
            System.out.println(nombre + ": Es mujer");
        } else {
            System.out.println(nombre + ": No es hombre ni mujer");
        }

    }

    public void atacar(Persona oponente) {

        if (!estavivo) {
            System.out.println(nombre + " no puede atacar porque está muerto.");
            return;
        } else if (!oponente.estavivo) {
            System.out.println(nombre + " no puede atacar porque "+ oponente.nombre +" está muerto.");
            return;
        } else {

            System.out.println(nombre + " ataca a " + oponente.nombre);
            oponente.vida -= ataque;
            oponente.getStats();
            System.out.println(oponente.nombre + " ahora tiene " + oponente.vida + " de vida.");

        }

    }

    public void getStats() {

        System.out.println("");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        sexoComprobar();
        System.out.println("Su vida es de: " + vida);
        estavivoComprobar();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("");

    }

}
