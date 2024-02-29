from flask import Flask, request


#  instaciar a aplicacao a um objeto
app = Flask(__name__)

@app.route('/')

def index():
    return "<h1 align='center'>funcionante</h1>"

@app.route("/calcula", methods=["GET"])
# http://127.0.0.1:5000/calcula?qtd=20&preco=10
def calcula():
    qtd = int(request.args.get("qtd"))
    preco = int(request.args.get('preco'))
    return f"<h1 align='center'>R${qtd*preco}</h1>"

# iniciar o app
# usar somente em area de desenvolvimento, nao de producao
app.run(debug=True)