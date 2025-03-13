from domain.Strategy import Strategy

class Tesoura(Strategy):
    '''Classe Tesoura que herda de Algoritimo e implementa o método abstrato _executar'''

    def _executar(self, tipo):
        resultados = {
            'PEDRA': 'Perdeu - Pedra quebra Tesoura',
            'PAPEL': 'Ganhou - Tesoura corta Papel',
            'TESOURA': 'Empatou - Tesoura empata com Tesoura',
            'LAGARTO': 'Ganhou - Tesoura decapita Lagarto',
            'SPOCK': 'Perdeu - Spock esmaga Tesoura'
        }
        print(resultados.get(tipo, 'Opção inválida'))