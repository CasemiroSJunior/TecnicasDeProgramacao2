import random

options = []

class   :
    def __init__(self, name, winTo, LosesTo ):
        self.name = name
        self.winTo = winTo

def calculateResult(selectedOption):
    computerPick = generateRandomOption()
    print("Você escolheu: " + str(options[selectedOption-1].name) )
    print("Computador escolheu: " + str(options[computerPick-1].name) )
    if(selectedOption == computerPick):
        return "Empate"
    elif (options[selectedOption-1].winTo.__contains__(computerPick)):
        return "Você venceu"
    else:
        return "Você perdeu"
    

def generateRandomOption():
    return random.randint(0,len(options))



