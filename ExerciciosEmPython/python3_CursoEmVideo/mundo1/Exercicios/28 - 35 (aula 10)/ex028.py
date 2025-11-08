# #escreva um programa que faça o computador pensar em um numero inteiro entre 0 e 5,peça para o usuario tenta adivinhar o numero escolhido pelo computador, e o programa diz se o usuario venceu ou perdeu
from random import choice

from scripts.meusMetodos.coletorDeNomes import coletor_de_nomes

rdn = None

numeros = [0, 1, 2, 3, 4, 5]

vidas = 5

print('-=-' * 30)
print(f'Acabei de escolher um numero entre 0 a 6. Faça um chute, se acertar, voce ganha \n{'-=-' * 30}\n Lembrando que voce tem: {vidas} chances\n\n{"↓    " * 19}')

while True:
    rdn = int(choice(numeros))
    tentativa = int(input('--> '))
    if tentativa > len(numeros):
        print(f'Numero invalido, por favor escolha um numero entre 0 a {len(numeros)}')
    else:
        if tentativa != rdn:
            vidas -= 1
            print(f'\n\n{"=" * 72}\nResposta eeeeeeeeRRADA!! O numero era {rdn}...Sorteei outro, tente novamente\n{"=" * 72}\nVoce tem mais {vidas} chances\n{"↓    " * 15}')
            if vidas == 0:
                print(f'Voce esgotou suas chances, perdeu')
                break
        else:
            print(f'{'-=-' * 20}Resposta eeeeeeXATA!! Parabens, a vitória é sua{'-=-' * 20}')
            break