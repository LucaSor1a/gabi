public class CadenaServicio {

    /*
    private Cadena cadena;
    public void reemplazar(String letra){
        String frase = cadena.getFrase();
        String nueva_frase = frase.replace('a', letra.toCharArray()[0]);
        System.out.println(nueva_frase);
        this.cadena.setFrase(nueva_frase);
    }
    */

    // Atributos

    // Constructor

    // Metodos
    public void reemplazar(Cadena cadena, char caracter) {
        String frase = cadena.getFrase();
        String nueva_frase = frase.replace('a', caracter);
        cadena.setFrase(nueva_frase);
    }

    public void reemplazarCorto(Cadena cadena, char caracter){
        cadena.setFrase(cadena.getFrase().replace('a', caracter));
    }

}
