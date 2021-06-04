#COMPRAS EN SUPERMERCADO

cant_manzanas = int(input("Ingrese cantidad de manzanas: "))
cant_panes = int(input("Ingrese cantidad de panes: "))
cant_salchichas = int(input("Ingrese cantidad de salchichas: "))
cant_salsas = int(input("Ingrese cantidad de salsas: "))

subtotal = 0
cantidad = 0

print("Calculando el total del mercado... ")

for i in range (cant_manzanas):
    subtotal += 2500
    cantidad += 1
    print("... El Subtotal sería de: $"+ str(subtotal))
    print("Se han comprado "+ str(cantidad) + " productos")

for i in range (cant_panes):
    subtotal += 1500
    cantidad += 1
    print("... El Subtotal sería de: $"+ str(subtotal))
    print("Se han comprado "+ str(cantidad) + " productos")

for i in range (cant_salchichas):
    subtotal += 1200
    cantidad += 1
    print("... El Subtotal sería de: $"+ str(subtotal))
    print("Se han comprado "+ str(cantidad) + " productos")

for i in range (cant_salsas):
    subtotal += 3000
    cantidad += 1
    print("... El Subtotal sería de: $"+ str(subtotal))
    print("Se han comprado "+ str(cantidad) + " productos")


pago = int(input("Ingrese el monto recibido del cliente: "))
cambio = pago - subtotal

if cambio > 0:
    print("El pago fue realizado efectivamente: \n Cambio: $" + str(cambio))
else:
    print("El monto recibido es insuficiente: \n Faltan $"+ str(cambio*-1))
