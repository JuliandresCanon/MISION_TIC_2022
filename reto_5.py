# Reto tema 5

# Define una función que reciba como parámetros una cadena de texto con el siguiente formato:
# "Enero,4,3,4;Febrero,4,3;Marzo,4,3,4;Abril,4,3,4,4" para los registros de ahorro 
# y un segundo parámetro con el nombre de la persona Por ejemplo:
# calculadoraMes(registroDeAhorros,nombre)

# Retorna la respuesta con el siguiente formato por ejemplo para las entradas 
# calculadoraMes("Enero,4,3,4;Febrero,4,3;Marzo,4,3,4;Abril,4,3,4,4" ,"daniel")  
# la salida sería ('daniel', {'Enero': 11, 'Febrero': 7, 'Marzo': 11, 'Abril': 15})


def calculadoraMes(registroDeAhorros, nombre):

    registroMes = registroDeAhorros.split(";")
    resultado = []
    
    for n in range(len(registroMes)):
        datosMes = registroMes[n].split(",")
        aportes = 0
        
        for m in range(1, len(datosMes)):
            aportes += int(datosMes[m])
            
        resultado.append(datosMes[0]+": "+str(aportes))
    
    return nombre, resultado


print(calculadoraMes("Enero,4,3,4;Febrero,4,3;Marzo,4,3,4;Abril,4,3,4,4", "daniel"))
