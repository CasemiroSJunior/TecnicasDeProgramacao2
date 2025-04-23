public class Alemao implements Ola {
    private String idioma = "Alemão";

    @Override
    public String ola() {
        return "Hallo, wie geht es dir?";
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
        return "Hallo, mein Name ist " + nome + ".";
    }
    
}
