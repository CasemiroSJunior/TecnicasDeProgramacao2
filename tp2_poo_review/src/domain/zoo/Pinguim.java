package domain.zoo;

public class Pinguim extends Ave implements BotarOvos{

    public Pinguim(String nome, char sexo, int idade) {
        super(nome, sexo, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("squawk squawk!\n");
    }

    @Override
    public void botar() {
        System.out.println("O pinguim botou um ovo!");
    }
}
