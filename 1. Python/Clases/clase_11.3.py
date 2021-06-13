precio_manzana = 1200
cant_manzana = int(input("Ingrese cantidad de manzanas: "))
precio_cilantro = 200
cant_cilantro = int(input("Ingrese cantidad de cilantro: "))
precio_perejil = 300
cant_perejil = int(input("Ingrese cantidad de perejil: "))
subtotal = 0

print("Calculando el total del mercado... ")
total_manzana = precio_manzana * cant_manzana
print("El valor total de las manzanas es: $" + str(total_manzana))
subtotal = subtotal + total_manzana
print("... El Subtotal sería de: $"+ str(subtotal))

total_cilantro = precio_cilantro * cant_cilantro
print("El valor total del cilantro es: $" + str(total_cilantro))
subtotal = subtotal + total_cilantro
print("... El Subtotal sería de: $"+ str(subtotal))

total_perejil = precio_perejil * cant_perejil
print("El valor total del perejil es: $" + str(total_perejil))
subtotal = subtotal + total_perejil
print("... El Total de mercado es de: $"+ str(subtotal))

