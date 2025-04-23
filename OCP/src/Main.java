import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selecione um idioma:");
        System.out.println("1 - Português");
        System.out.println("2 - Inglês");
        System.out.println("3 - Espanhol");
        System.out.println("4 - Francês");
        System.out.println("5 - Alemão");

        Scanner scanner = new Scanner(System.in);
        int idioma = scanner.nextInt();
        scanner.nextLine();

        if(idioma < 1 || idioma > 5) {
            System.out.println("Idioma inválido.");
            return;
        }

        if(idioma == 1) {
            System.out.println("Olá, tudo bem com você?");
        } else if(idioma == 2) {
            System.out.println("Hello, how are you?");
        } else if(idioma == 3) {
            System.out.println("Hola, ¿cómo estás?");
        } else if(idioma == 4) {
            System.out.println("Bonjour, comment ça va?");
        } else if(idioma == 5) {
            System.out.println("Hallo, wie geht's dir?");
        }
        /* Nesse sentido, se fosse adicionar um idioma novo
          Seria necessário adicionar um novo bloco de código
          para o idioma desejado, o que não é uma boa prática
          de programação, pois o código ficaria muito grande
          e difícil de manter.
          Além disso, se o número de idiomas aumentar,
          o código ficaria ainda mais complexo.
         
          Utilizando OCP, podemos criar uma interface
            chamada Ola, que define um método ola() e
            um método seApresentar(String nome).
            Cada classe que implementa a interface Ola
            representa um idioma diferente e implementa
            os métodos de acordo com o idioma.
            Dessa forma, podemos adicionar novos idiomas
            sem precisar modificar o código existente.
            Isso torna o código mais flexível e fácil de
            manter, pois cada classe é responsável
            por sua própria implementação.
         */

        // Exemplo de uso da interface Ola
        
        Ola idiomaSelecionado;
        if (idioma == 1) {
            idiomaSelecionado = new Portugues();
        } else if (idioma == 2) {
            idiomaSelecionado = new Ingles();
        } else if (idioma == 3) {
            idiomaSelecionado = new Espanhol();
        } else if (idioma == 4) {
            idiomaSelecionado = new Frances();
        } else {
            idiomaSelecionado = new Alemao();
        }

        System.out.println(idiomaSelecionado.ola());
       System.out.println(idiomaSelecionado.seApresentar("João"));
        System.out.println("Idioma selecionado: " + idiomaSelecionado.getIdioma());

    }



}