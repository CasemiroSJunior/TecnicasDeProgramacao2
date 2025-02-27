package domain;

public class Zapdos extends Pokemon implements EletricType, FlyingType {

    public Zapdos(int hp, int cp) {
        super(hp, cp);
    }

    @Override
    public void thunderbolt() {
        System.out.println("Zapdos uses Thunderbolt!\n");
    }

    @Override
    public void thunder() {
        System.out.println("Zapdos uses Thunder!\n");
    }

    @Override
    public void wingAttack() {
        System.out.println("Zapdos uses Wing Attack!\n");
    }

    @Override
    public void attack() {
        wingAttack();
        thunderbolt();
    }


}
