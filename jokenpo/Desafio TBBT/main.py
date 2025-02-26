import jokenpo

selectedOption = 0


option1=(jokenpo.JokenpoOption("PAPEL", [1,3]))
option2=(jokenpo.JokenpoOption("TESOURA", [2,4]))
option3=(jokenpo.JokenpoOption("PEDRA", [3,4]))
option4=(jokenpo.JokenpoOption("LAGARTO", [1,3]))
option5=(jokenpo.JokenpoOption("SPOCK", [2,5]))

jokenpo.options.append(option1)
jokenpo.options.append(option2)
jokenpo.options.append(option3)
jokenpo.options.append(option4)
jokenpo.options.append(option5)

while (selectedOption < 1 or selectedOption > len(jokenpo.options)):
    print("Selecione qual opção você deseja:")
    for i in range(0, len(jokenpo.options)):
        print(str(i+1) + " - " + jokenpo.options[i].name)
    try:
        selectedOption = int(input())
    except:
        print("Selecione uma opção válida") 

print(jokenpo.calculateResult(selectedOption))