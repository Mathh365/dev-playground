# ARMAZENA UMA SEQUENCIA DE NOMES DIGITAOS PELO USUARIO E RETORNA UMA LISTA COM TODOS ELES EM MINUSCULO, E SEM ESPAÇOS SOBRESALENTES NO INICIO E FIM DE CADA NOME

def coletorDeNomess():
    nomes = []
    while True:
        nome = input('Digite um nome, ou "Fim" para encerrar')
        if nome.lower() == "fim":
            break
        else:
            nomes.append(nome.strip().lower())
    return nomes