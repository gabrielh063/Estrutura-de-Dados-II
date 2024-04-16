import random
lista = []
n_elementos = 100
lista = [x for x in range(n_elementos)]
random.shuffle(lista)
print(lista)
lista.sort()
print(lista)