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
        int idiomaId = scanner.nextInt();
        scanner.nextLine();

        if (idiomaId < 1 || idiomaId > 5) {
            System.out.println("Idioma inválido.");
            return;
        }

        if (idiomaId == 1) {
            System.out.println("Olá, tudo bem com você?");
        } else if (idiomaId == 2) {
            System.out.println("Hello, how are you?");
        } else if (idiomaId == 3) {
            System.out.println("Hola, ¿cómo estás?");
        } else if (idiomaId == 4) {
            System.out.println("Bonjour, comment ça va?");
        } else if (idiomaId == 5) {
            System.out.println("Hallo, wie geht's dir?");
        }
        /*
         * Nesse sentido, se fosse necessário adicionar um idioma novo,
         * seria preciso adicionar mais blocos de código (novos if-else),
         * o que não é uma boa prática de programação, pois o código
         * ficaria muito grande e difícil de manter.
         * 
         * Além disso, se o número de idiomas aumentasse,
         * o código se tornaria ainda mais complexo.
         * 
         * Aplicando o princípio Open-Closed (OCP), podemos melhorar:
         * - Criando uma interface chamada 'Ola' que define métodos como ola() e
         * seApresentar(String nome).
         * - Cada classe que implementa 'Ola' representa um idioma diferente e
         * implementa seus próprios métodos.
         * 
         * Dessa forma, podemos adicionar novos idiomas
         * sem modificar o código existente (fechado para modificação),
         * apenas extendendo (aberto para extensão).
         * 
         * Isso torna o sistema muito mais flexível, organizado e fácil de manter.
         * 
         */

        Idiomas idioma = Idiomas.bucarIdiomas(idiomaId);
        Ola ola = idioma.getIdioma();
        System.out.println(ola.ola());
        System.out.println(ola.seApresentar("Casemiro"));

    }

}