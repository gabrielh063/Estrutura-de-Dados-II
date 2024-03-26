from flask import Flask, request
from ibge import busca, soma_frequencia, valor_min, valor_max, ordem_crescente, bubble_sort

app = Flask(__name__)

@app.route('/busca_nome', methods=["GET"])
def busca_nome():
    try:
        var_nome = request.args.get("nome")
        response = busca(var_nome)
        # percorrer o retorno do busca e somar todas as ocorrencias do nome
        soma = soma_frequencia(response)
        objeto_retorno = {
            "nome_procurado": var_nome,
            "total_ocorrencias": soma
        }
        return objeto_retorno
    except Exception as e:
        return f"Falha na rota /busca_nome: {e}"

@app.route("/frequencia_min")
def minimo():
    try:
        nome = request.args.get("nome")
        periodo, minimo = valor_min(nome)
        return {
            "nome": nome,
            "frequencia_minima": minimo,
            "periodo": periodo
        }
    except Exception as e:
        return f"falha na rota /frequencia_min: {e}"

@app.route("/frequencia_max")
def maximo():
    try:
        nome = request.args.get("nome")
        periodo, minimo = valor_max(nome)
        return {
            "nome": nome,
            "frequencia_maxima": minimo,
            "periodo": periodo
        }
    except Exception as e:
        return f"falha na rota {e}"
    
@app.route("/ordem_crescente")
def crescente():
    try:
        nome = request.args.get("nome")
        lista = ordem_crescente(nome)
        return lista
    except Exception as e:
        return f'falha na rota /ordem_crescente:  {e}'

@app.route("/crescente_diferente")
def bubble():
    try:
        nome = request.args.get("nome")
        lista = bubble_sort(nome)
        return lista
    except Exception as e:
        return f"falha na rota /bubble_sort: {e}"
app.run(debug=True)
