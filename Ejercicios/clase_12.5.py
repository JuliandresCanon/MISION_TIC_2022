# INICIO DE COMPRAS EN SUPERMERCADO

precio_manzana = 2500
cant_manzana = 5
precio_panes = 1500
cant_panes = 3
precio_salchichas = 1200
cant_salchichas = 7
precio_salsas = 3000
cant_salsas = 2

subtotal = 0
cantidad = 0

print("Calculando el total del mercado... ")

for i in range (cant_manzana):
    subtotal += precio_manzana
    cantidad += 1
    print("... El Subtotal sería de: $"+ str(subtotal))
    print("Se han comprado "+ str(cantidad) + " productos")

for i in range (cant_panes):
    subtotal += precio_panes
    cantidad += 1
    print("... El Subtotal sería de: $"+ str(subtotal))
    print("Se han comprado "+ str(cantidad) + " productos")

for i in range (cant_salchichas):
    subtotal += precio_salchichas
    cantidad += 1
    print("... El Subtotal sería de: $"+ str(subtotal))
    print("Se han comprado "+ str(cantidad) + " productos")

for i in range (cant_salsas):
    subtotal += precio_salsas
    cantidad += 1
    print("... El Subtotal sería de: $"+ str(subtotal))
    print("Se han comprado "+ str(cantidad) + " productos")


pago = int(input("Ingrese el monto recibido del cliente: "))
cambio = pago - subtotal

if cambio > 0:
    print("El pago fue realizado efectivamente: \n Cambio: $" + str(cambio))
else:
    print("El monto recibido es insuficiente: \n Faltan $"+ str(cambio*-1))
