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

total_manzana = precio_manzana * cant_manzana
print("El valor total de las manzanas es: $" + str(total_manzana))
subtotal = subtotal + total_manzana
print("... El Subtotal sería de: $"+ str(subtotal))
cantidad = cantidad + cant_manzana
print("Se han comprado "+ str(cantidad) + " Productos")

total_panes = precio_panes * cant_panes
print("El valor total del panes es: $" + str(total_panes))
subtotal = subtotal + total_panes
print("... El Subtotal sería de: $"+ str(subtotal))
cantidad = cantidad + cant_panes
print("Se han comprado "+ str(cantidad) + " Productos")


total_salchichas = precio_salchichas * cant_salchichas
print("El valor total del salchichas es: $" + str(total_salchichas))
subtotal = subtotal + total_salchichas
print("... El Total de mercado es de: $"+ str(subtotal))
cantidad = cantidad + cant_salchichas
print("Se han comprado "+ str(cantidad) + " Productos")

total_salsas = precio_salsas * cant_salsas
print("El valor total del salsas es: $" + str(total_salsas))
subtotal = subtotal + total_salsas
print("... El Total de mercado es de: $"+ str(subtotal))
cantidad = cantidad + cant_salsas
print("Se han comprado "+ str(cantidad) + " Productos")

pago = int(input("Ingrese el monto recibido del cliente: "))
cambio = pago - subtotal

if cambio > 0:
    print("El pago fue realizado efectivamente: \n Cambio: $" + str(cambio))
else:
    print("El monto recibido es insuficiente: \n Faltan $"+ str(cambio*-1))
