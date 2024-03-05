from flask import Flask, request
from ibge import busca 

app = Flask(__name__)

@app.route('/busca_nome', methods=["GET"])
def busca_nome():
    try:
        var_nome = request.args.get("nome")
        response = busca(var_nome)
        # percorrer o retorno do busca e somar todas as ocorrencias do nome
        return response
    except Exception as e:
        return f"Falha na rota /busca_nome: {e}"


app.run(debug=True)