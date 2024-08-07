def intercala(inicio,meio,fim, lista):
    w_lista = []
    i = inicio
    j = meio
    while i < meio and j < fim:
        if lista[i] < lista[j]:
            w_lista.append(lista[i])
            i += 1
        else:
            w_lista.append(lista[j])
            j += 1
    while j < fim:
        w_lista.append(lista[j])
        j += 1
    while i < meio:
        w_lista.append(lista[i])
        i += 1
    x = 0
    for k in range(inicio, fim):
        lista[k] = w_lista[x]
        x += 1

def merge_sort(inicio,fim, lista):
    if inicio < fim-1:
        meio = (inicio+fim)//2
        merge_sort(inicio, meio, lista)
        merge_sort(meio, fim, lista)
        intercala(inicio, meio, fim, lista)

if __name__ == "__main__":
    import random
    valores = []
    for i in range(10**12):
        valores.append(random.randint(1,10**12))
    tamanho = len(valores)
    merge_sort(0,tamanho, valores)
    print("ordenado")