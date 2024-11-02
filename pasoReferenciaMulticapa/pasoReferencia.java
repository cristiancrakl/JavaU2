
public class pasoReferencia {
    public static void main(String[] args) {

        Persona cristian = new Persona("cristian");
        Persona cristian2=new Persona("cristian el viejo");
        cambiarNombre(cristian);

        System.out.println("Después de cambiarNombre: " + cristian.nombre); // Imprime cristian
        System.out.println("Objeto inicializado 2: "+cristian2.nombre);//imprime crstian 2
    }

    public static void cambiarNombre(Persona persona) {
        Persona cristian = new Persona("juancho");
        System.out.println("Dentro de cambiarNombre: " + cristian.nombre); // Imprime juancho
    }
}
