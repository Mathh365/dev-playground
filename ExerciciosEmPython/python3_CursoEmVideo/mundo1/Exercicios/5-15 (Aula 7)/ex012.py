# faça um algoritimo que leia o preço de um produto e mostra seu novo preço, com 5% de desconto

prod = float(input('Qual é o preço do produto?'))

print (f'O produto de R${prod},00, com 5% de desconto, sai por R${prod - ((5 * prod) / 100)},00')