# escreva um program que pergunte quantidade de km percorrido por um carro alugado, e a quantidade de dias pelos quais
# ele foi alugado. Calcule o preço a pagar, sabendo que o carro custaa R$ 60,00 por dia e R$ 0.15 por km rodado

km = int(input('Quantos KM?'))
dias = int(input('Quantos dias ficou alugado?'))

print (f'Voce pagará R${(km * 0.15) + (dias * 60)}')