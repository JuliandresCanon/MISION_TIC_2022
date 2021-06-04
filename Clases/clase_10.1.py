#CALCULO DE NOTA DE LAS PRACTICAS

n1 = float(input("Ingrese Nota No. 1 "))
n2 = float(input("Ingrese Nota No. 2 "))
n3 = float(input("Ingrese Nota No. 3 "))
n4 = float(input("Ingrese Nota No. 4 "))

if n1 < n2 and n1 < n3 and n1 < n4:
    print("La nota de las practicas es: ", (n2 + n3+ n4)/3)
elif n2 < n1 and n2 < n3 and n2 < n4:
    print("La nota de las practicas es: ", (n1 + n3+ n4)/3)
elif n3 < n1 and n3 < n2 and n3 < n4:
    print("La nota de las practicas es: ", (n1 + n2+ n4)/3)
elif n4 < n1 and n4 < n2 and n4 < n3:
    print("La nota de las practicas es: ", (n1 + n2+ n3)/3)

