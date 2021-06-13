#Una funcion que calcule el máximo común divisor de dos números
def mcm(n, m):

    if (n>m):
        mayor = n
    else:
        mayor = m
    while (mayor%n != 0) or (mayor%m != 0):
        mayor += 1
    return mayor

print(mcm(4, 6))
