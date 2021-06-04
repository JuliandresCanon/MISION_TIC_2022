palabra = str(input("Ingrese una palabra: "))
vocal = "aeiou"
cant = []

for n in vocal:
    cont = 0
    for m in palabra.lower():
        if m==n:
            cont +=1
    x = (n + "=" + str(cont))
    cant.append(x)

print(cant)
