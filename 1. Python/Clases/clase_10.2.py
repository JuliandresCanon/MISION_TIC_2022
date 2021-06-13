#DETERMINAR SI TRES LONGITUDES FORMAN UN TRIANGULO Y CLASIFICARLO

l1 = float(input("Ingrese la longitud 1: "))
l2 = float(input("Ingrese la longitud 2: "))
l3 = float(input("Ingrese la longitud 3: "))


if l1 < (l2 + l3) and l2 < (l1 + l3) and l3 < (l1 + l2):
    if l1 == l2 == l3:
        tipo = str("Equilatero")
    elif (l1*l1)==(l2*l2+l3*l3) or (l2*l2)==(l1*l1+l3*l3) or (l3*l3)==(l1*l1+l2*l2):
        tipo = str("Rectangulo")
    elif l1 != l2 != l3:
        tipo = str("Escaleno")
    else:
        tipo = str("Isosceles")

    print("Es un triangulo y se clasifica como: \n", tipo )
else:
    print("No es un triangulo")

