from abc import ABC, abstractmethod

class Strategy(ABC):
    '''Classe abstrata que define o método abstrato _executar'''
    @abstractmethod
    def _executar(self):
        pass
        