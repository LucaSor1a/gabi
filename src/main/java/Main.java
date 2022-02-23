import nose.pepe;

public class Main {

    public static void main(String[] args) {
        CadenaServicio cadenaServicio = new CadenaServicio();
        Cadena cadena = new Cadena("Hola Gabi");
        System.out.println(cadena.getFrase() + "\n" + cadena.getLongitud());
        cadena.setFrase("Chau Gabi");
        System.out.println(cadena.getFrase());
        cadenaServicio.reemplazar(cadena, 'x');
        System.out.println(cadena.getFrase());
        cadena.setFrase("Chau Gabi");
        cadenaServicio.reemplazarCorto(cadena, 'f');
        System.out.println(cadena.getFrase());
        pepe nose = new pepe();
    }

}
