from flask import Flask, request
import requests

app = Flask(__name__)

@app.route("/usuario", methods=["GET"])
 
def index():
    try:
        # http://127.0.0.1:5000/usuario?nome=gabriel&idade=19
        user = request.args.get("name","padrao")
        age = int(request.args.get("idade"))
        return f"{user}, tem {age} anos"
    except:
        return "<h1 align='center'>Erro 200</h1>"

@app.route("/ibge", methods=["GET"] )
def consulta_ibge():
    nome = request.args.get("nome")
    resposta = requests.get(f"https://servicodados.ibge.gov.br/api/v2/censos/nomes/{nome}")    
    return resposta 


app.run(debug=True)