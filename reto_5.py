# Reto tema 5
# Planteamiento de la situación

# Acabas de ver la última consola de videojuegos y piensas que debe ser tuya como sea. 
# Como ya has pedido dinero a tus padres en los últimos meses, piensas en ahorrar por 
# tu propia cuenta el dinero para comprarla, aprovechando tu trabajo de mensajero.

# Ya han pasado varios meses y en tu agenda de ahorro tienes los siguientes datos: 
# los aportes de los meses de enero, febrero, marzo y abril. Durante el mes de enero 
# tuviste tres aportes, en febrero dos, en marzo nuevamente tres y en abril, cuatro 
# aportes. Descubres que tus amigos, llevan la misma estrategia de ahorro y decides 
# facilitar el proceso de cálculo de los valores ahorrados mensualmente.

# Aprovechando que has iniciado un curso de programación, decides automatizar el 
# proceso para impresionar a tus amigos sobre la forma efectiva y rápida de hacer 
# estos cálculos.

# Planteamiento del reto
# ¿De qué manera podrías organizar los datos de tal manera que puedas obtener 
# automáticamente el ahorro que has hecho tú y tus amigos por cada mes?

# Acciones de aprendizaje

# Identifica los tipos de datos que tienes.

# Define la estructura de datos más adecuada para representarlos.

# Utiliza la estructura de datos definida para encontrar la suma 
# total de los ahorros por cada mes.

# Como el proceso se puede repetir para ti y cada uno de tus amigos, define una 
# función que reciba como parámetros una cadena de texto con el siguiente formato:
# "Enero,4,3,4;Febrero,4,3;Marzo,4,3,4;Abril,4,3,4,4" para los registros de ahorro 
# y un segundo parámetro con el nombre de la persona a quien se le hará el cálculo. 
# Por ejemplo: calculadoraMes(registroDeAhorros,nombre)

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