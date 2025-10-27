#faça um prigrama que leia o comprimento do cateto oposto e do cateto adjacente de um triangulo retangulo, calcule e mostre o comprimento da hipotenusa

from math import sqrt as raiz, pow as pot


c = float(input('Qual é a medida do cateto? '))
c2 = float(input('E do cateto oposto? '))
hipotenusa = raiz(pow(c, 2) + pow(c2, 2))

print (f'A hipotenusa mede {hipotenusa:.2f}')