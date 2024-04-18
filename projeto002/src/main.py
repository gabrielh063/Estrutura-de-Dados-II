from flask import Flask, request
from defs import cidades 

app = Flask(__name__)

@app.route("/insertion")
def insertion():
    try:
        cidade = cidades()
        return cidade
    except Exception as e:
        return f"Erro na rota: {e}"


app.run(debug=True)