#dewsenvovla um programa que leia o comprimento de 3 retas, e diga se ele pode ou nao formar um triangulo

r1 = int(input('Digite o comprimento da primeira reta: '))
r2 = int(input('Digite o comprimento da segunda reta: '))
r3 = int(input('Digite o comprimento da terceira reta: '))

if (r1 + r2) > r3:
    print('Estas 3 retas, podem formar um triangulo')
else:
    print('Impossivel formar um triangulo com estas 3 retas')
