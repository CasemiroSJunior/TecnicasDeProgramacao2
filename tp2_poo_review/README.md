# Orientação à Objetos em Java

O paradigma de programação orientada a objetos tem por principal objetivo aproximar a programação como um todo, mais próxiima da realizadade do nosso cotidiano.

As relações entre os objetos do mundo real são adaptadas para um `mini-mundo` a ser construído em um programa de computador.

Esta concepção faz com que a modelagem de domínio se torne mais intuitiva além de possibilitar a criação de software mais fácil de manter e evoluir.

## Conceitos Básicos

Abaixo iremos demonstrar os principais conceitos da P.O.O (Programação Orientada a Objetos).

### Classe e Objeto

Em Java, tudo é encapsulado em classes e objetos. Uma classe é um modelo para objetos, e um objeto é uma instância de uma classe.

```mermaid
classDiagram
    class Pikachu
```

### Abstração

**Modelagem Conceitual**: Abstração é a capacidade de modelar objetos do mundo real no código, focando apenas nos detalhes essenciais e ignorando o não essencial.

```mermaid
classDiagram
    class Pikachu {
        + nick
        + cp
        + hp
        + thunderbolt()
    }
```

### Encapsulamento:

**Atributos e Métodos**: As classes em Java possuem atributos (variáveis) e métodos (funções). O encapsulamento permite esconder a implementação interna e expor apenas a interface necessária.

```mermaid
classDiagram
    class Pikachu {
        - nick
        - cp
        - hp
        + thunderbolt()
    }
```

### Herança

**Extensão de Classes**: Java suporta herança, permitindo que uma classe herde atributos e métodos de outra. A classe pai é chamada de superclasse, e a classe filha é chamada de subclasse.

```mermaid
classDiagram
    class Pokemon {
        - nick
        - cp
        - hp
        + iChooseYou()
        + comeBack()
        + attack()
    }
    class Pikachu { }
    class Charmander { }
    class Squartle { }

    Pokemon <|-- Pikachu
    Pokemon <|-- Charmander
    Pokemon <|-- Squartle
```

### Polimorfismo

**Múltiplas Formas**: Polimorfismo permite que objetos de diferentes classes sejam tratados como objetos da mesma classe por meio de herança e interfaces. Existem dois tipos: estático (sobrecarga de método) e dinâmico (sobrescrita de método).

```mermaid
classDiagram
    class Pokemon {
        - nick
        - cp
        - hp
        + iChooseYou()
        + comeBack()
        + attack()
    }
    class Pikachu { }
    class Charmander { }
    class Blaziken { }
    class Squartle { }
    class WatherType {
        <<interface>> 
        +splash()
    }
    class FireType { 
        <<interface>> 
        + amber()    
    }
    class EletricType { 
        <<interface>> 
        +thunderbolt()
    }

    
    Pokemon <|-- Blaziken
    Pokemon <|-- Pikachu
    Pokemon <|-- Charmander
    Pokemon <|-- Squartle
    Squartle ..|> WatherType
    Blaziken ..|> FireType
    Charmander ..|> FireType
    Pikachu ..|> EletricType
    
```
> Os Pokemons Blaziken e Charmander possuem múltiplas formas compartilhando o comportamento dos Pokemons do tipo fogo, além dos atributos e comportamentos comuns à todos os Pokemons


### Interfaces:

**Contratos de Implementação**: Interfaces em Java definem contratos que as classes devem seguir. Uma classe pode implementar várias interfaces, proporcionando flexibilidade no design.

```mermaid
classDiagram

    class Pokemon {
        - nick
        - cp
        - hp
        + iChooseYou()
        + comeBack()
        + attack()
    }
    
    class Zapdos { }
    
    class FlyngType { 
        <<interface>> 
        + wingattack()    
    }
    class EletricType { 
        <<interface>> 
        +thunderbolt()
    }

    Pokemon <|-- Zapdos
    Zapdos ..|> FlyngType
    Zapdos ..|> EletricType
```

> O Pokemon Zapdos assinou 2 contratos, dos Pokemons voadores e dos Pokemons elétricos, estes contratos possibilitam flexibilidade na modelagem de dominio e também contornam o impossibilidade de herança multipla em Java.  
    