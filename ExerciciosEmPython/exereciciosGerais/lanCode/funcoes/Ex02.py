#faça uma funcao que recebe uma lista, e retorne o maior numero dessa lista


def maiorDaLista(lista):
    # maior = lista[0]
    # for i in lista:
    #     if i > maior:
    #         maior = i
    # print(maior)
    return max(lista)
            
listaDeNumeros = [1, 3, 4, 30, 7, 8, 2, 3, 10]
print(maiorDaLista(listaDeNumeros))