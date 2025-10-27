#escreva um programa que pergunte o salario de um funcionario, e calcule o valor do aumento, para salarios superiores a 1250 calcule um aumento de 10%.Para os inferiores ou iguais, o aumento é de 15%


try:
    salario = int(input('Qual é o salario do funcionario?\nR$:'))
    if salario > 1250:
        print(f'O salario de R${salario},00 com um aumento de 10%, fica: R${salario + (salario * 0.1)}')
    else:
        print(f'O salario ed R${salario},00 com um aumento de 15%, fica: R${salario + (salario * 0.15)}')
except:
    print('Resposta invalida, tente novamente')
