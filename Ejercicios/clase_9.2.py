#Calculo de costos arriendo de Vehiculo

km = int(input("Ingrese la distancia recorrida: "))

if km < 300:
    pago = 300000
elif km > 300 and km < 1000:
    pago = 300000 + 15000*(km - 300)
else:
    pago = 300000 + 15000*(700) + 10000*(km - 1000)

print("El costo del alquiler es: $", pago)
print("El costo del impuesto es: $", pago - pago/1.20)
