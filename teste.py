import random

def criar_boletin_pseudoaleatorio(tamanho: int) -> list:
    notas = []
    contador = 0
    while contador != tamanho:
        notas.append(random.randint(0,10))
        contador += 1
    return notas

def criar_boletin_aleatorio() -> list:
    notas = []
    tamanho = random.randint(1,10)
    contador = 0
    while contador != tamanho:
        notas.append(random.randint(0,10))
        contador += 1
    return notas

def media(notas: list) -> float:
    subtotal = 0
    for nota in notas:
        subtotal += nota
    return subtotal/len(notas)

def mostrar_notas(boletin: list):
    posição = 0
    for nota in boletin:
        posição += 1
        print("Nota " + str(posição) + " = " + str(nota))

    media_formatada = str("{:.2f}".format(media(boletin)))
    print("Media final = " + media_formatada)

def mensagem_principal() -> str:
    print("Gerar Boletin Virtual \n")
    print("Para gerar boletins aleatorios digite 1 \n")
    print("Para gerar boletins de forma manual digite 2 \n")
    return str(input("opção: "))

def mensagem_boletin_aleatorio() -> str:
    return str(input("Escolher tamnho do boletin? S/N \nResposta: "))

def mensagem_digitar_tamanho() -> int:
    return int(input("Digite o numero de notas do boletin: \nTamanho: "))

def mensagem_boletin_manual():
    print("Digite a nota que quer adicionar ao boletin, para parar de adicionar notas escreva 'Fim'")
    verificador = 0
    while verificador == 0:
        pass
        

def main():
    match mensagem_principal():
        case "1":
            match mensagem_boletin_aleatorio():
                case "S":
                    tamanho = mensagem_digitar_tamanho()
                    mostrar_notas(list(criar_boletin_pseudoaleatorio(tamanho)))
                case "N":
                    mostrar_notas(list(criar_boletin_aleatorio))
        case "2":
            mensagem_boletin_manual()

main()