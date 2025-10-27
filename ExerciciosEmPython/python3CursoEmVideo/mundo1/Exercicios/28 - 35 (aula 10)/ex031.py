#desenvolva um programa que pergunte a distancia de uma viagem em km, e calcule ao preço da passagem do onibus, cobrando R$ 0,50/km para viagens de ate 200km e 0,45 para viagens mais longas

viagem = int(input('Qual é a distancia da sua viagem em KM?'))

if viagem < 200:
    print(f'O preço da passagem de onibus fica R${0.5 * viagem},00 para uma viagem de {viagem}KM')
else:
    print(f'O preço da passagem neste caso, fica R${viagem * 0.45},00')
