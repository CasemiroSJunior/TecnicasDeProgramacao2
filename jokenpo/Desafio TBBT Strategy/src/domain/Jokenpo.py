class Jokenpo:
    '''
        Jokenpo recebe o algorítimo que o usuário escolheu e executa o método jogar dele
    '''
    def __init__(self, algoritimo = None):
        self.algoritimo = algoritimo
    
    def setAlgoritimo(self, algoritimo):
        self.algoritimo = algoritimo
    
    
    def jogar(self, tipoJogada):
        if self.algoritimo is None:
            raise ValueError("Algoritimo não definido")
        self.algoritimo._executar(tipoJogada)