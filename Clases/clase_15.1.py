
n = int(input("Ingrese cantidad de lineas: "))

# x
for x in range (n):
    for y in range (x):
        print("* ", end="")
    print("")

#y
for x in range (n, 0, -1):
    for y in range (x):
        print("* ", end="")
    print("")
