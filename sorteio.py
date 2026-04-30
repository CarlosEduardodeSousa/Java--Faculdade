import random


def inserir_palpite(quantidade):

    palpite = []

    while len(palpite) < quantidade:
        numeros = int(input(f"Digite o {len(palpite) + 1}° número:"))

        if numeros < 1 or numeros > 60:
            print("Número invalido")
        elif numeros in palpite:
            print("Esse número já foi adicionado")
        else:
            palpite.append(numeros)

    return palpite



def verificar_acertos(palpite, numeros_sorteados):
    acertos = []

    for numeros in palpite:
        if numeros in numeros_sorteados:
            acertos.append(numeros)
    
    return acertos

def verificar_premiacao(acertos):
    if len(acertos) == 6:
        print("Você ganhou na Mega-Sena!")
    elif len(acertos) == 5:
        print("Você acertou a Quina!")
    elif len(acertos) == 4:
        print("Você acertou a Quadra!")
    else:
        print("Não foi dessa vez!")


print("=========== Menu ==========")
print("    [1]- Jogar 6 números   ")
print("    [2]- Jogar 15 números  ")
print("    [3]- Sair              ")
print("===========================")

opcao = int(input("Escolha uma opção: "))

match opcao:
    case 1:
        numeros_sorteados = (random.sample(range(1,61), 15))
        quantidade = 6
        palpite = inserir_palpite(quantidade)
    case 2:
        numeros_sorteados = (random.sample(range(1,61), 15))
        quantidade = 15
        palpite = inserir_palpite(quantidade)
    case 3:
        print("Encerrando Programa....")
        exit()
    case _:
        print("Opção invalida!")
        exit()

acertos = verificar_acertos(palpite, numeros_sorteados) 

print("=================RESULTADOS=================")
print("Numeros Sorteados: ", numeros_sorteados)
print("Seu palpite: " , palpite)
print("Numero de acertos: " , acertos)
print("Total de acertos: ", len(acertos))
verificar_premiacao(acertos)
print("============================================")

