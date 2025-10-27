#crie um programa que leia o nome de uma pessoa e diga se ela tem silva no nome

nome = input("Digite um nome completo").lower().strip()

if "silva" in nome:
    print('Existe "Silva" no nome ')
else:
    print('Não existe "Silva" neste nome ')