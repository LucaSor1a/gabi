public class Cadena {

    // Atributos
    private String frase;
    private Integer longitud;

    // Constructor
    public Cadena(String frase) {
        this.frase = frase;
        this.setLongitud();
    }

    // Metodos
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud() {
        this.longitud = this.frase.length();
    }

}
