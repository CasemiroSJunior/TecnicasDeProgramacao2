public class Espanhol implements Ola {
    private String idioma = "Espanhol";

    @Override
    public String ola() {
        return "Hola, ¿cómo estás?";
    }

    @Override
    public String getIdioma() {
        return idioma;
    }

    @Override
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String seApresentar(String nome) {
        return "Hola, me llamo " + nome + ".";
    }
    
}
