from domain.Jokenpo import Jokenpo
from domain.Papel import Papel
from domain.Tesoura import Tesoura
from domain.Pedra import Pedra
from domain.Lagarto import Lagarto
from domain.Spock import Spock
import random
from enum import Enum

algoritimo = None

class Jogada(Enum):
    PAPEL = 1
    TESOURA = 2
    PEDRA = 3
    LAGARTO = 4
    SPOCK = 5

def TipoJogada():
    print("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, 4-LAGARTO, 5-SPOCK ]\n")
    try:
        user_input = int(input())
        '''
            seleciona um tipo de jogada de acordo com o valor informado pelo usuário 
            ao selecioanar uma opção do menu de jogadas o usuário instancia uma classe dentro de algoritimo
        '''
        match user_input:
            case Jogada.PAPEL.value:
                return Papel()
            case Jogada.TESOURA.value:
                return Tesoura()
            case Jogada.PEDRA.value:
                return Pedra()
            case Jogada.LAGARTO.value:
                return Lagarto()
            case Jogada.SPOCK.value:
                return Spock()
            case _:
                print("Opção inválida, tente novamente")
                return TipoJogada()
    except (ValueError, KeyError):
        print("Opção inválida, tente novamente")
        return TipoJogada()

algoritimo = TipoJogada()
computer_input = Jogada(random.choice(list(Jogada))).name

print(f"Você escolheu {algoritimo.__class__.__name__}")
print(f"O computador escolheu {computer_input}")

jogo = Jokenpo(algoritimo)
jogo.jogar(computer_input)



