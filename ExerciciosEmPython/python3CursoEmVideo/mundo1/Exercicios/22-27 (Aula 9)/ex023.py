#faça um programa que leia um numero de 0 a 9999 e mostre na tela cada um dos digitos separados
#ex: digite um numero : 1832 // resultado:
# unidade : 4
# dezena: 3
# centena: 8
# milha: 1

num = int(input('Digite um numero de 1 a 9999 no maximo ').strip())

if num < 0 or num > 9999:
    print('Numero invalido, digite algo entre 1 e 9999')
else:
    num = str(num).zfill(4)

    print(f"""
    Unidade: {num[3]}
    Dezena : {num[2]}
    Centena: {num[1]}
    Milha  : {num[0]}
    """)
