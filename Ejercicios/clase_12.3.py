#CALCULO PARA SABER SI UN NUMERO ES PRIMO
#EMPLEANDO EL MODULO %

n=int(input("Ingrese un número: \n"))
cont = 0

for i in range (2,n):
    print(n%i)
    if n%i == 0:
        cont += 1

if cont > 0:
    print("El número no es primo")
else:
    print("El número es primo")
