#faça um programa que leia um angulo qualquer e mostre na tela o valor do seno, cosseno e tangente deste angulo

import math

an = float(input(('Digite o angulo que voce deseja: ')))
seno = math.sin(math.radians((an)))
cos = math.cos(math.radians(an))
tan = math.tan(math.radians(an))
print(f'O angulo de {an}  tem o SENO de {seno:.2f} ')
print(f'O angulo de {an}  tem o SENO de {cos:.2f} ')
print(f'O angulo de {an}  tem o SENO de {tan:.2f} ')
