package domain.pokemons;

public class Pikachu extends Pokemon implements EletricType {

    public Pikachu(int hp, int cp) {
        super(hp, cp);
    }

    @Override
    public void attack(){
        thunderbolt();
    }

    @Override
    public void thunderbolt(){
        System.out.println("Pikachu uses Thunderbolt!\n");
    }

    @Override
    public void thunder() {
        System.out.println("Pikachu uses Thunder!\n");
    }

}
