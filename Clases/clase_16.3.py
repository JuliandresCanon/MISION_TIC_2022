#Una funcion que calcule el máximo común divisor de dos números
def mcd(n, m):

    rest = 0
    while (m>0):
        rest = m
        m = n%m
        n = rest 
    return n

print(mcd(36, 24))
