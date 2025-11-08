#um professor que sortear um dos seus quatro alunos para apgar o quadro, faça um programa que ajude ele, lendo o nome deles, e escrevendo o nome do escolhido

from random import randrange, choice

nomes = []

while True:
    n = input('Digite um nome, ou digite "fim" para encerrar.')

    if n.lower() == ("fim"):
        break
    else:
        nomes.append(n)

sorteado = choice(nomes)
print (sorteado)