package domain.zoo;

public class Aguia extends Ave implements Voavel, BotarOvos{
    public Aguia(String nome, char sexo, int idade) {
        super(nome, sexo, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("croac croac!\n");
    }

    @Override
    public void botar() {
        System.out.println("A aguia botou um ovo!");
    }

    @Override
    public void voar() {
        System.out.println("A aguia voa!");
    }
}
