#Calculo compra producto 

valor = int(input("Ingrese el valor del producto $ " ))
cant  = int(input("Ingrese la cantidad: "))

n_doc = round(cant/12, 0)

if n_doc < 3:
    compra = cant * valor
    desc = compra * 0.10
    obsq = 0
else:
    compra = cant * valor
    desc = compra * 0.15
    obsq = n_doc - 3

print("Monto de compra $ " + str(compra))
print("Monto de descuento $ " + str(desc))
print("Monto a pagar $ " + str(compra - desc))
print("Unidades de Obsequio " + str(obsq))
