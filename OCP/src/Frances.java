public class Frances implements Ola {
    private String idioma = "Francês";

    @Override
    public String ola() {
        return "Bonjour, comment ça va?";
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
        return "Bonjour, je m'appelle " + nome + ".";
    }
    
}
