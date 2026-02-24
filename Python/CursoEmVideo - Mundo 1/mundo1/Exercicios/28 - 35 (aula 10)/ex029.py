#escreva um programa que leia a velocidade de um carro, se ele ultrapassar 80km/h, mostre uma mensagem dizzendo que ele foi multado, a multa vai custar R$ 7,00 por cada km acima do limite

velo = int(input('O radar detecotou o carro a quantos KM/h?\n'))

if velo > 80:
    print(f'Voce ultrapassou o limite de velocidade de 80KM/h e sera MULTADO em R${(velo - 80) * 7},00')
else:
    print(f'Esta tudo certo entao, voce passa limpo dessa vez')