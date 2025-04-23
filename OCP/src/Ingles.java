public class Ingles implements Ola {
    private String idioma = "Inglês";

    @Override
    public String ola() {
        return "Hello, how are you?";
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
        return "Hello, my name is " + nome + ".";
    }
    
}
