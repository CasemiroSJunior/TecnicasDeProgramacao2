public enum Idiomas {
    PORTUGUES(1, new Portugues()),
    INGLES(2, new Ingles()),
    ESPANHOL(3, new Espanhol()),
    FRANCES(4, new Frances()),
    ALEMAO(5, new Alemao());

    private final int id;
    private final Ola idioma;

    Idiomas(int id, Ola idioma) {
        this.id = id;
        this.idioma = idioma;
    }

    public int getId() {
        return id;
    }
    
    public Ola getIdioma() {
        return idioma;
    }

    public static Idiomas bucarIdiomas(int id) {
        for (Idiomas idioma : Idiomas.values()) {
            if (idioma.getId() == id) {
                return idioma;
            }
        }
        throw new IllegalArgumentException("Código de idioma inválido: " + id);
    }

}
