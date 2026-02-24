#crie um programa que leia um nome completo de uma pessoa e mostra: o nome com todas as letras minutsculas,
#o nome com todas maiusculas, quantas letras ao todo, sem considerar epaços, e quantas letras tem o primeiro nome

nome = input('Digite um nome completo: ').strip()

print(nome.upper())
print(nome.lower())
print(f'O nome tem {len(nome.replace( " ","" )) } caracteres ao todo')
print(f'Seu primeiro nome "{nome.split()[0].lower().capitalize()}" tem {len(nome.split()[0])} caracteres')



