from flask import Flask

app = Flask(__name__)

@app.route("/usuario")
 
def index():
    return "Hello World"

app.run()