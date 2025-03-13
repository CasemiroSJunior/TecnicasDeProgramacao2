package domain.pokemons;

public abstract class Pokemon {
    private int hp;

    private int cp;

    public Pokemon(int hp, int cp){
        this.setHp(hp);
        this.setCp(cp);
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        if (cp < 0){
            System.out.printf("Valor de cp inválido. cp: %d\n", cp);
            return;
        }
        this.cp = cp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0){
            System.out.printf("Valor de hp inválido. HP: %d\n", hp);
            return;
        }
        this.hp = hp;
    }

    public void iChooseYou(){
        System.out.printf("%s, I choose you!\n", this.getClass().getSimpleName());
    }

    public void comeBack(){
        System.out.printf("%s, Come back!\n", this.getClass().getSimpleName());
    }

    public abstract void attack();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "HP=" + hp +
                ", cp=" + cp +
                "}";
    }
}
