#faça um programa que leia o nome completo de uma pessoa, e mostre em seguida o primeiro e ultimo nome separadamente

nome = input('Digite seu nome completo ').lower().strip()
nome = nome.split()

# ultimoNome = len(nome) - 1
# print(f'E o ultimo nome é {nome[len(nome) - 1]}')

print(f'O primeiro nome é {nome[0].capitalize()}')
print(f'E o ultimo nome é {nome[-1].capitalize()}')
