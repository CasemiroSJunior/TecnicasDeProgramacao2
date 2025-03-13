from domain.Strategy import Strategy

class Pedra(Strategy):
    '''Classe pedra que herda de Algoritimo e implementa o método abstrato _executar'''

    def _executar(self, tipo):
        resultados = {
            'PEDRA': 'Empatou - Pedra empata com Pedra',
            'PAPEL': 'Perdeu - Papel cobre Pedra',
            'TESOURA': 'Ganhou - Pedra quebra Tesoura',
            'LAGARTO': 'Ganhou - Pedra esmaga Lagarto',
            'SPOCK': 'Perdeu - Spock vaporiza Pedra'
        }
        print(resultados.get(tipo, 'Opção inválida'))
        