# faça um programa que leia uma frase, e fale:
# quantas vezes aparece a letra "A"
# em que posição ela aparece a primeira vez
# em que posição ela aparece a ultima vez

frase = input('Digite uma frase ').lower().strip()

if "a" in frase:
    print(f'A frase tem {frase.count('a')}x a letra "A" ')
    print(f'A primeira ocorrencia da letra "A" é na posição {frase.find("a") + 1}')
    print(f'A ultima ocorrencia da letra "A" é na posição {frase.rfind("a") + 1}')
    if frase.find('a') == frase.rfind('a'):
        print(f'Afinal, a frase tem apenas {frase.count("a")}x a letra A')
else:
    print(f'Não existe a letra "a" nesta frase')
