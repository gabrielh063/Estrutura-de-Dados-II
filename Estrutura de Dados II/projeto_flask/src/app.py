from flask import Flask

#  instaciar a aplicacao a um objeto
app = Flask(__name__)

@app.route('/')

def index():
    return "<h1 align='center'>funcionante</h1>"

# iniciar o app
# usar somente em area de desenvolvimento, nao de producao
app.run(debug=True)
