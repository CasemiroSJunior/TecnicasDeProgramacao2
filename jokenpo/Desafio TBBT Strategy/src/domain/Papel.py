from domain.Algoritimo import Algoritimo

class Papel(Algoritimo): 
    '''Classe papel que herda de Algoritimo e implementa o método abstrato _executar''' 
        
    def _executar(self, tipo):
        resultados = {
            'PEDRA': 'Ganhou - Papel cobre Pedra',
            'PAPEL': 'Empatou - Papel empata com Papel',
            'TESOURA': 'Perdeu - Tesoura corta Papel',
            'LAGARTO': 'Perdeu - Lagarto come Papel',
            'SPOCK': 'Ganhou - Papel refuta Spock'
        }
        print(resultados.get(tipo, 'Opção inválida'))