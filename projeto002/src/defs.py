import requests
import time

def cidade():
    url = "https://servicodados.ibge.gov.br/api/v1/localidades/municipios?view=nivelado"
    response = requests.get(url)
    return(response.json())

def cidades():
    teste = cidade()
    return teste


def selection_sort(lista):
    lista = cidade()
    for i in range(1, len(lista)):
        chave = lista[i]
        j = i - 1
        while j >= 0 and lista[j] > chave:
            lista[j + 1] = lista[j]
            j -= 1
        lista[j + 1] = chave
cidade()