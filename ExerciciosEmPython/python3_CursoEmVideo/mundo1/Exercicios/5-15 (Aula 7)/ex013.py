salario = float(input('Qual é o salário? R$'))
aumento = salario * 0.15
novo_salario = salario + aumento

print(f'Seu novo salário com 15% de aumento é: R${novo_salario:.2f}')

if salario < 3000:
    print('Mas tu tá lascado mesmo hein, brasileiro médio é osso 😩💸')
