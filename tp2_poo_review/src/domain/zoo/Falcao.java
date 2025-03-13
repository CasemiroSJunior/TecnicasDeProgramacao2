package domain.zoo;

public class Falcao extends Ave implements Voavel, BotarOvos {
    public Falcao(String nome, char sexo, int idade){
        super(nome, sexo, idade);
    }

    @Override
    public void botar(){
        System.out.println("O Falcão botou um ovo!");
    }

    @Override
    public void voar(){
        System.out.printf("O Falcão voa!");
    };

    @Override
    public void emitirSom() {
        System.out.printf("croac croac!\n");
    }
}
