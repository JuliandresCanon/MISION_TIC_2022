
# Reto tema 5

# Define una función que reciba como parámetros una cadena de texto con el siguiente formato:
# Enero,40000,35000,80000;Febrero,90000,30000;Marzo,50000,35000,25000;Abril,75000,35000,42000,38000
# para los registros de ahorro y un segundo parámetro con el nombre de la persona Por ejemplo:
# calculadoraMes(registroDeAhorros,nombre)

# Retorna la respuesta con el siguiente formato por ejemplo para las entradas 
# calculadoraMes("Enero,40000,35000,80000;Febrero,90000,30000;Marzo,50000,35000,25000;Abril,75000,35000,42000,38000" ,"daniel")
# la salida sería ('daniel', {'Enero': 155000, 'Febrero': 120000, 'Marzo': 110000, 'Abril': 190000})


def calculadoraMes(registroDeAhorros, nombre):

    registroMes = registroDeAhorros.split(";")
    resultado = {}
    
    for n in range(len(registroMes)):
        datosMes = registroMes[n].split(",")
        aportes = 0
        
        for m in range(1, len(datosMes)):
            aportes += int(datosMes[m])
            
        resultado[datosMes[0]] = aportes
        
    return nombre, resultado


print(calculadoraMes("Enero,40000,35000,80000;Febrero,90000,30000;Marzo,50000,35000,25000;Abril,75000,35000,42000,38000","Daniel"))

print("('Daniel', {'Enero': 155000, 'Febrero': 120000, 'Marzo': 110000, 'Abril': 190000})")
