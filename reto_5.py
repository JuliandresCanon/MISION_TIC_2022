# Reto tema 5

# Define una función que reciba como parámetros una cadena de texto con el siguiente formato:
# "Enero,4,3,4;Febrero,4,3;Marzo,4,3,4;Abril,4,3,4,4" para los registros de ahorro 
# y un segundo parámetro con el nombre de la persona Por ejemplo:
# calculadoraMes(registroDeAhorros,nombre)

# Retorna la respuesta con el siguiente formato por ejemplo para las entradas 
# calculadoraMes("Enero,4,3,4;Febrero,4,3;Marzo,4,3,4;Abril,4,3,4,4" ,"daniel")  
# la salida sería ('daniel', {'Enero': 11, 'Febrero': 7, 'Marzo': 11, 'Abril': 15})


def calculadoraMes(registroDeAhorros, nombre):

    mes1 = registroDeAhorros[0:5]
    ap_mes1_1 = int(registroDeAhorros[6])
    ap_mes1_2 = int(registroDeAhorros[8])
    ap_mes1_3 = int(registroDeAhorros[10])
    ap_mes1 = ap_mes1_1 + ap_mes1_2 + ap_mes1_3
    
    mes2 = registroDeAhorros[12:19]
    ap_mes2_1 = int(registroDeAhorros[20])
    ap_mes2_2 = int(registroDeAhorros[22])
    ap_mes2 = ap_mes2_1 + ap_mes2_2
    
    mes3 = registroDeAhorros[24:29]
    ap_mes3_1 = int(registroDeAhorros[30])
    ap_mes3_2 = int(registroDeAhorros[32])
    ap_mes3_3 = int(registroDeAhorros[34])
    ap_mes3 = ap_mes3_1 + ap_mes3_2 + ap_mes3_3
    
    mes4 = registroDeAhorros[36:41]
    ap_mes4_1 = int(registroDeAhorros[42])
    ap_mes4_2 = int(registroDeAhorros[44])
    ap_mes4_3 = int(registroDeAhorros[46])
    ap_mes4_4 = int(registroDeAhorros[48])
    ap_mes4 = ap_mes4_1 + ap_mes4_2 + ap_mes4_3 +ap_mes4_4
    
    ver=[mes1, ap_mes1, mes2, ap_mes2, mes3, ap_mes3, mes4, ap_mes4]
    
    print(len(ver))
    
    return nombre, ver



nombre = str("daniel")
registroDeAhorros = str("Enero,4,3,4;Febrero,4,3;Marzo,4,3,4;Abril,4,3,4,4")

print(calculadoraMes(registroDeAhorros, nombre))

print("('daniel', ['Enero': 11, 'Febrero': 7, 'Marzo': 11, 'Abril': 15])")
