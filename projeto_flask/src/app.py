from flask import Flask, request


#  instaciar a aplicacao a um objeto
app = Flask(__name__)

@app.route('/')

def index():
    return "<h1 align='center'>funcionante</h1>"

@app.route("/calcula", methods=["GET"])

    
def calcula():
# http://127.0.0.1:5000/calcula?qtd=20&preco=10
    print (str(request))
    print(request.args) 
    print(request.args.get("qtd"))
    # qtd = int(request.args.get("qtd"))
    # preco = int(request.args.get('preco'))
    # return f"<h1 align='center'>R${qtd*preco}</h1>"
    return "OK!"
@app.route("/soma_ate", methods=["get"])
def soma_ate():
    try:
        numero = int(request.args.get("valor"))
        lista_numeros = list(range(1,numero+1))
        # saida = ''
        # for i in range(1, numero+1):
            # saida += str(i) + " + "
        return {
            # "operacao": saida[:3],
            "soma": sum(lista_numeros)
        }   
    except Exception as e:
        return f"Falha no processamento {e}"
# http://127.0.0.1:5000/calcula?qtd=20&preco=10
def calcula():
    qtd = int(request.args.get("qtd"))
    preco = int(request.args.get('preco'))
    return f"<h1 align='center'>R${qtd*preco}</h1>"


# iniciar o app
# usar somente em area de desenvolvimento, nao de producao
app.run(debug=True)