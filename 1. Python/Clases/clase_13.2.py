i = 1
while i <= 5:
    print(i)
    i = i + 1

manzanas = 5
cont = 0

print("Se ha iniciado el carrito. En total hay: "
    + str(cont) + " manzanas")

while (cont < manzanas):
    cont += 1
    print("Se ha agregado una manzana a la canasta. Ahora hay " + str(cont) + " manzanas")

bandera = True
cont = 0

while bandera == True :
    cont += 1
    print(cont, bandera)
    if (cont == 5):
        bandera = False
        print(bandera)
