package domain.zoo;

public abstract class Animal {

    public Animal(String nome, char sexo,int idade){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    private int idade;
    private String nome;
    private char sexo;



    public void comer(){
        System.out.printf(" %s está comendo", this.getClass().getSimpleName());
    }

    public void dormir(){
        System.out.printf(" %s está dormindo", this.getClass().getSimpleName());
    }

    public abstract void emitirSom();

    /*
    Ao conversar com o professor, foi acordado que, não vale a pena implementar como abstrato
    pois caso um animal precise de uma, ele pode substituir o método na própria classe.

    public abstract void comer(String alimento);
    */
}
