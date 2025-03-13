package domain.zoo;

public class Ornintorrinco extends Mamifero implements BotarOvos{

    public Ornintorrinco(String nome, char sexo, int idade) {
        super(nome, sexo, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("roar\n");
    }

    @Override
    public void botar() {
        System.out.println("O ornintorrinco bota um ovo");
    }
}
