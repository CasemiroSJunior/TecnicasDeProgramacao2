package domain.zoo;

public class Morcego extends Mamifero implements Voavel{

    public Morcego(String nome, char sexo, int idade) {
        super(nome, sexo, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("ti ti ti ti ti!\n");
    }

    @Override
    public void voar() {
        System.out.println("O morcego voa");
    }
}
