# faça um programa que leia um numero inteiro qualquer e mostre na tela a sua tabuada

n1 = int(input('Digite um numero para saber sua tabuada completa'))
contador = 0

while contador < 10:
    contador = contador + 1
    print(f'{n1} x{contador:2}={n1 * contador}')
