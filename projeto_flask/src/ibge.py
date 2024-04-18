import requests

def busca(nome):
    url = f"https://servicodados.ibge.gov.br/api/v2/censos/nomes/{nome}"
    resposta = requests.get(url)
    return resposta.json()

def get_res(obj):
    if len(obj)>0:
        conteudo = obj[0]
        return conteudo.get("res", [])
    else:
        return []

def soma_frequencia(var_json):
    conteudo = var_json[0]
    resposta = conteudo.get("res", [])
    soma = []
    for elemento in resposta:
        frequencia = elemento.get("frequencia", 0)
        soma.append(frequencia)        
    return sum(soma) 

def valor_min(nome):
    dados = busca(nome)
    lista = get_res(dados)
    if len(lista)>0:
        minimo = lista[0]["frequencia"]
        periodo = lista[0]["periodo"]
    for index in range(1, len(lista)):
        if lista[index]["frequencia"] < minimo:
            minimo = lista[index]["frequencia"]
            periodo = lista[index]["periodo"]
    return periodo, minimo

def valor_max(nome):
    dados = busca(nome)
    lista = get_res(dados)
    if len(lista)>0:
        maximo = lista[0]["frequencia"]
        periodo = lista[0]["periodo"]
    for index in range(1, len(lista)):
        if lista[index]["frequencia"] > maximo:
            maximo = lista[index]["frequencia"]
            periodo = lista[index]["periodo"]
    return periodo, maximo

def ordem_crescente(nome):
    # selection sort function
    dados = busca(nome)
    lista = get_res(dados)
    for i in range(0, len(lista) -1):
        menor = i
        for j in range(i+1, len(lista)):
            if lista[menor]["frequencia"] > lista[j]["frequencia"]:
                menor = j
            lista[i], lista[menor] = lista[menor], lista[i]
    return lista

def bubble_sort(nome):
    dados = busca(nome)
    lista = get_res(dados)
    j = len(lista)-1
    while j>0:
        for i in range(0,j):
            if lista[i]["frequencia"]>lista[i+1]["frequencia"]:
                lista[i],lista[i+1] = lista[i+1], lista[i]
        j = j-1
    return j


