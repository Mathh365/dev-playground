#o mesmo professor do desafio anterior quer sortear a ordem de apresentação de trabalho dos alunos. faça um programa que leia o nome dos quatro alunos e mostre a ordem sorteada

from random import shuffle

nomes = ['carlos', 'josé', 'robson', 'frank', 'marco', 'pedrinho']

shuffle(nomes)

for i, nome in enumerate(nomes):
    print (f'{i} - {nome}')