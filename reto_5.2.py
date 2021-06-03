# Reto tema 5

# Define una función que reciba como parámetros una cadena de texto con el siguiente formato:
# "Enero,4,3,4;Febrero,4,3;Marzo,4,3,4;Abril,4,3,4,4" para los registros de ahorro 
# y un segundo parámetro con el nombre de la persona Por ejemplo:
# calculadoraMes(registroDeAhorros,nombre)

# Retorna la respuesta con el siguiente formato por ejemplo para las entradas 
# calculadoraMes("Enero,4,3,4;Febrero,4,3;Marzo,4,3,4;Abril,4,3,4,4" ,"daniel")  
# la salida sería ('daniel', {'Enero': 11, 'Febrero': 7, 'Marzo': 11, 'Abril': 15})


def calculadoraMes(registroDeAhorros, nombre):

    a = registroDeAhorros.split(";")
    print(a)

    for n in range(4):
        b = a[n].split(",")
        print(b)

        for m in range(1, len(b)):
            c = int(b[m])
            print(c)
            print(type(c))
    
    print(len(a))
    print(type(a))
    
    return nombre, a


print(calculadoraMes("Enero,4,3,4;Febrero,4,3;Marzo,4,3,4;Abril,4,3,4,4", "daniel"))

print("('daniel', ['Enero': 11, 'Febrero': 7, 'Marzo': 11, 'Abril': 15])")
