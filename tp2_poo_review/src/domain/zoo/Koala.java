package domain.zoo;

public class Koala extends Mamifero {
    public Koala(String nome, char sexo, int idade) {
        super(nome, sexo, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Koala ainda está dormindo");
    }
}
