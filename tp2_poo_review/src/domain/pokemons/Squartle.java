package domain.pokemons;

public class Squartle extends Pokemon{

    public Squartle(int hp, int cp){
        super(hp, cp);
    }

    @Override
    public void attack(){
        System.out.println("Squirtle Attack!");
    }
}
