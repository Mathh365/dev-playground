# crie uma função que recebe um numero e faz uma contagem regressiva a partir dele

def contagemRegressiva(valor):
    if type(valor) == int:
        for i in range(valor, 0, -1):
            print(i)
    elif type(valor) == str:
        for i in reversed(valor):
            print(i)
            
contagemRegressiva(6)
