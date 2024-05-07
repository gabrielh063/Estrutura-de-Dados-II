from tarefa import Task
import heapq

listaTarefas = []

def menu():
    print('-'*10)
    print('1 - Adicionar Tarefa')
    print('2 - Realizar Tarefa (remover)')
    print('3 - Consultar Tarefas')
    print('4 - Sair')

def adicionar():
    titulo = input("Digite o titulo da tarefa: ")
    descricao = input("Digite a descrico da tarefa: ")
    obj = Task(titulo)
    obj.set_descricao(descricao)
    prioridade = obj.get_prioridade()
    heapq.heappush(listaTarefas, (1/prioridade, obj))

def realizar():
    tarefa = heapq.heappop(listaTarefas) # tarefa de "maior" prioridade
    print(tarefa[1].info())

def consultar():
    for item in listaTarefas:
        print(item[1].info())
        print('-'*20)

if __name__ == "__main__":
    opcao = 1
    while opcao != 4:
        menu()
        opcao = int(input("Digite a opcao: "))
        match opcao:
            case 1:
                adicionar()
            case 2:
                realizar()
            case 3:
                consultar()
            case 4:
                print("Saindo..")
                break
            case _:
                print("Opcao invalida!!")