import domain.Blaziken;
import domain.Charmander;
import domain.Pikachu;
import domain.Squartle;

public class Main {
    public static void main(String[] args) {
        var charmander = new Charmander(1000, 2000);
        var pikachu = new Pikachu(500, 3000);
        var squartle = new Squartle(800, 2500);
        var blaziken = new Blaziken(1200, 2500);
        System.out.println(charmander);
        charmander.iChooseYou();
        charmander.attack();

        System.out.println(pikachu);
        pikachu.iChooseYou();
        pikachu.attack();

        System.out.println(squartle);
        squartle.iChooseYou();
        squartle.attack();

        System.out.println(blaziken);
        blaziken.iChooseYou();
        blaziken.attack();


    }

}