package domain;

public class Charmander extends Pokemon implements FireType {

    public Charmander(int hp, int cp){
        super(hp, cp);
    }

    @Override
    public void attack() {
        amber();
    }

    @Override
    public void amber() {
        System.out.println("Charmander uses amber");
    }
}
