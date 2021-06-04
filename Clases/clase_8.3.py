#CONVERSOR DE TEMPERATURA 

unid = str(input("Unidades a convertir: (C) Celsius - (F) Fahrenheit " '\n'))
temp = float(input("Ingrese valor: " '\n'))

if unid == 'C':
    print(round((9*temp+(32*5))/5, 1), "°F")
elif unid == 'F':
    print(round(5*(temp-32)/9,1), "°C")
else:
    print("Ingrese unidades validas")
