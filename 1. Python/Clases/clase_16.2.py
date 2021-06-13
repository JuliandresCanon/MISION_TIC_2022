#El total de una factura más IVA

def factura(pago, iva=21):
    return pago + pago*iva/100

print(factura(1000, 10))
