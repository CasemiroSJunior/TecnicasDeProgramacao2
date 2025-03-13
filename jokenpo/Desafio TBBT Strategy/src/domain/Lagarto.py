from domain.Strategy import Strategy

class Lagarto(Strategy):
    '''Classe Lagarto que herda de Algoritimo e implementa o método abstrato _executar'''
    
    def _executar(self, tipo):
        resultados = {
            'PEDRA': 'Perdeu - Pedra esmaga Lagarto',
            'PAPEL': 'Ganhou - Lagarto come Papel',
            'TESOURA': 'Perdeu - Tesoura decapita Lagarto',
            'LAGARTO': 'Empatou - Lagarto empata com Lagarto',
            'SPOCK': 'Ganhou - Lagarto envenena Spock'
        }
        return print(resultados.get(tipo, 'Opção inválida'))