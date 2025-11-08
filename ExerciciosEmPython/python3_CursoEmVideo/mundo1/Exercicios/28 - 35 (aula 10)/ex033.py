#faça um programa qyue leia 3 numeros e mostre qual é o maior e qual é o menor

lista = []
maior = None
menor = None

for x in range(3):
    num = int(input('Digite um numero aleatorio:\n'))
    lista.append(num)
    print(f'NUMERO "{num}" ADICIONADO')
# print(f"""
# {max(lista)} é o maior numero digitado
# {min(lista)} é o menor numero digitado
# """)

maior = lista[1]
menor = lista[1]

for i in lista:
    if i > maior:
        maior = i
    if i < menor:
        menor = i
print(f'O maior numero digitado é {maior}')
print(f'O menor numero digitado é {menor}')