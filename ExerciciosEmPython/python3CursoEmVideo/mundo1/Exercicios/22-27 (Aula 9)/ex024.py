#crie um programa que leia o nome de uma cidade, e diga se a cidade começa ou nao com a palavra santo

nome = input("Digite o nome completo de uma cidade")

if nome.split()[0].lower() == "santo":
    print('O nome da cidade começa com Santo')
else:
    print("O nome da cidade nao começa com santo")