def BinToDecimal(binario):
    expoente = 0
    decimal = 0
    
    for i in reversed(binario):
        decimal += int(i) * (2 ** expoente)
        expoente += 1
    return decimal

def DecimalToBin(decimal):
    if decimal == 0: return [0]
    
    binarios = []

    while decimal > 0:
        binarios.append(int(decimal) % 2)
        decimal //= 2
    
    binarios.reverse()
    return binarios

def HexToDecimal(hex):
    hexQuebrado = QuebraHex(hex)
    expoente = 0
    decimal = 0
    
    for i in reversed(hexQuebrado):
        decimal += (i * (16 ** expoente))
        expoente += 1   
    return decimal  

def HexToBin(hex):
    hexaQuebrado = QuebraHex(hex)
    nibbles = []
    
    for i in hexaQuebrado:
        bits = DecimalToBin(i)
        while len(bits) < 4:
            bits.insert(0, 0)
            
        bits_str = "".join(str(b) for b in bits)

        nibbles.append(bits_str)

    return "".join(nibbles)

def QuebraHex(hex):
    hex = str(hex).lower()
    hexQuebrado = []

    for i in hex:
        if i.isdigit():
            hexQuebrado.append(int(i))
        else:
            match i:
                case "a": hexQuebrado.append(10)
                case "b": hexQuebrado.append(11)
                case "c": hexQuebrado.append(12)
                case "d": hexQuebrado.append(13)
                case "e": hexQuebrado.append(14)
                case "f": hexQuebrado.append(15)
    return hexQuebrado