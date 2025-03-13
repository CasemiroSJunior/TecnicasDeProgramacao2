from domain.Strategy import Strategy

class Spock(Strategy):
    '''Classe Spock que herda de Algoritimo e implementa o método abstrato _executar'''

    def _executar(self, tipo):
        resultados = {
            'PEDRA': 'Ganhou - Spock vaporiza Pedra',
            'PAPEL': 'Perdeu - Papel refuta Spock',
            'TESOURA': 'Ganhou - Spock esmaga Tesoura',
            'LAGARTO': 'Perdeu - Lagarto envenena Spock',
            'SPOCK': 'Empatou - Spock empata com Spock'
        }
        return print(resultados.get(tipo, 'Opção inválida'))