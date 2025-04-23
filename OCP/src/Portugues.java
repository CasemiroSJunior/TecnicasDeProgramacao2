public class Portugues implements Ola {
    private String idioma = "Português";

    @Override
    public String ola() {
        return "Olá, tudo bem com você?";
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
        return "Olá, meu nome é " + nome + ".";
    }
    
}
