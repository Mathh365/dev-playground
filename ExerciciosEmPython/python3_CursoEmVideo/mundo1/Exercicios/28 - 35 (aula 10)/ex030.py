#crie um programa que leia um numero inteiro qualquer, e mostre na tela se ele é par ou impar

num = int(input('Digite um numero inteiro qualquer\n'))

if (num % 2) == 0:
    print(f'{num} é par')
else:
    print(f'{num} é impar')
