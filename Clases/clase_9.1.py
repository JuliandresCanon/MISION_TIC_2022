#comparar Numero Palindromo 3 cifras

a = int(input("Ingrese número de 3 cifras: \n"))

unid = a//100
dece = a//10 - unid*10
cent = a - dece*10 - unid*100

if unid == cent:
    print("El número es Palindromo")
else:
    print("El número no cumple")
