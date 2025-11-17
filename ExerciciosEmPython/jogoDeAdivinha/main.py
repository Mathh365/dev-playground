from random import choice
import pyttsx3 as tts
from time import sleep
import funçoes.tocar as tocar

tts.init()
rdn = None
numeros = [0, 1, 2, 3, 4, 5]
vidas = 5

tts.speak('Vamos jogar um jogo')
# voz.runAndWait()

print("-=-" * 30)
print(f'Acabei de escolher um numero entre 0 a 5. Faça um chute, se acertar, voce ganha \n{"-=-" * 30}\n Lembrando que voce tem: {vidas} chances\n\n{"↓    " * 19}')

try:
    while True:
        rdn = int(choice(numeros))
        tentativa = int(input("--> "))
        tts.speak('piu')
        # voz.runAndWait()
        
        if tentativa not in numeros:
            print(f'Numero invalido, por favor escolha um numero entre {", ".join(str(n) for n in numeros)}')
        else:
            if tentativa != rdn:
                vidas -= 1
                print(f'\n\n{"=" * 72}\nResposta eeeeeeeeRRADA!! O numero era {rdn}...Sorteei outro, tente novamente\n{"=" * 72}\nVoce tem mais {vidas} chances\n{"↓    " * 15}')
                tts.speak(f"{vidas} chances restantes")
                # voz.runAndWait()
                if vidas == 0:
                    print('Voce esgotou suas chances, perdeu')
                    tts.speak('Voce esgotou suas chances, perdeu')
                    # voz.runAndWait()
                    break
            else:
                print(f'{"-=-" * 20}Resposta eeeeeeXATA!! Parabens, a vitória é sua{"-=-" * 20}')
                tocar.tocar('sources\musicaDoSenna.mp3')
                sleep(10)
                break
except:
    print('Invalido, por favor tente novamente\nCODIGO DO ERRO: ')
