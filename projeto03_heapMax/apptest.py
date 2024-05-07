from tarefa import Task

obj = Task("Lavar roupa")
outro = Task("Fazer comida")
outro.set_descricao("Descricao deferente")

print("="*20)
print(obj.info())
print("="*20)
print(outro.info())