def contagem_regressiva(n):
    # caso base - caso de parada
    if n == 0:
        print('Fogo!')
    else:
        print(n)
        contagem_regressiva(n-1)

def fatorial(m):
    # caso base - quando m == 0
    if m == 0:
        return 1
    else:
        return m*fatorial(m-1)

def fatorial_nrec(n):
    r = 1
    for i in range(1,n+1):
        r += r*i
    return r 

if __name__ == "__main__":
    r =fatorial_nrec(1000000000000000)
    print(r)
