import funcoes.Conversor as f

# Você integra a equipe de análise de falhas em sistemas embarcados de uma
# montadora de veículos elétricos. O módulo de controle eletrônico (ECU)
# envia periodicamente um registro de status de 16 bits, que contém
# informações compactadas sobre o estado do veículo.
# O status mais recente recebido foi:
# Status: B29E

# bits: 15 a 13 Código do módulo Identifica o módulo que enviou o status
# bits: 12 a 10 Tipo de erro Indica o tipo de erro
# bits: 9 a 5 Nível de bateria Valor de 0 (vazia) a 31 (cheia)
# bits: 4 a 0 Temperatura Temperatura em graus (0 a 31)


temperatura = str()
nivelDaBateria = str()
tipoDeErro = str()
codigoDoModulo = str()

binario = f.HexToBin("B29E")
for i, item in enumerate(binario[::-1]):
    if (0 <= i <= 4): temperatura += item
    if (13 <= i <= 15): codigoDoModulo += item
    if (10 <= i <= 12): tipoDeErro += item
    if (5 <= i <= 9): nivelDaBateria += item
    

print(f"""
      Codigo do modulo que enviou este status: {(f.BinToDecimal(codigoDoModulo[::-1]))}
      Tipo do erro: {f.BinToDecimal(tipoDeErro[::-1])}
      Nivel da bateria: {f.BinToDecimal(nivelDaBateria[::-1])}
      Temperatura: {f.BinToDecimal(temperatura[::-1])}
      """)


