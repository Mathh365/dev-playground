# crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dolares ela pode comprar
# considere USS 1,00 = R$ 3,27

real = float(input('Quantos REAIS voce tem na carteira?'))
cotaçãoDolar = 5.5
switch = 500
dolar = real / cotaçãoDolar


print(f'Voce pode comprar {dolar:.2f} dolares com esse dinheiro')

if dolar < switch:
    print(f'Neste caso, para voce poder comprar um switch 2 logo no lançamento, lhe falta ${switch - dolar:.2f}, ou R${(switch - dolar) * cotaçãoDolar:.2f}')
else:
    print(F'Parabens, voce pode comprar um switch 2 assim que lançar, e ainda te sobra ${dolar - switch:.2f}, ou R${dolar * cotaçãoDolar:.2f}')

