#faça um programa que receba um ano qualquier, e mostre se ele é bissexto

ano = input('Dgitie um ano: ')
num = [ano[-2], ano[-1]]
num = int(''.join(num))

if (num % 4) == 0:
    print(f'{ano} é ano bissexto')
else:
    print(f'{ano} não é ano bissexto')
