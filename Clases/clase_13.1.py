tipos = int(input("Ingrese la cantidad de tipos de productos: "))

i = 1
subtotal = 0
cantidad = 0

while i <= tipos:
    x = str(input("Ingrese la descripcion del producto "))
    y = int(input("Ingrese el valor del producto "))
    z = int(input("Ingrese la cantidad del producto "))
    i += 1

    subtotal += y*z
    cantidad += z
    print("... El Subtotal sería de: $"+ str(subtotal))
    print("Se han comprado "+ str(cantidad) + " productos")


pago = int(input("Ingrese el monto recibido del cliente: "))
cambio = pago - subtotal

if cambio > 0:
    print("El pago fue realizado efectivamente: \n Cambio: $" + str(cambio))
else:
    print("El monto recibido es insuficiente: \n Faltan $"+ str(cambio*-1))
