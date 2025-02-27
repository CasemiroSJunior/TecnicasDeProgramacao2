package domain;

public class Blaziken extends Pokemon implements FireType {
    public Blaziken (int hp, int cp){
        super(hp, cp);
    }

    @Override
    public void attack(){
        amber();
    }

    @Override
    public void amber(){
        System.out.println("Blaziken uses amber");
    }
}
