package domain.zoo;

public class Leao extends Mamifero implements Patrulhavel{
    public Leao(String nome, char sexo, int idade) {
        super(nome, sexo, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("roar!\n");
    }

    @Override
    public void patrulhar() {
        System.out.println("O Leão patrulha!");
    }
}
