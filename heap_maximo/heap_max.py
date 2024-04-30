import heapq 

lista = []
heapq.heappush(lista, (1/5, "maykan"))
heapq.heappush(lista, (1/7, "transit"))
heapq.heappush(lista, (1/1, "erivelton"))
heapq.heappush(lista, (1/3, "tiburcio"))
print("ATENDIMENTOS")

for i in range(4):
    elemento = heapq.heappop(lista)
    print(elemento)
    input("proximo")

a = [1,3,5,7,9,2,4,6,8,0]