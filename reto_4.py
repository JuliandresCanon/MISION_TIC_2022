def calculoCostoHuevos(cantAAA, cantAA, cantA, cantB, cantC):
    
    costoAAA = cantAAA * 550
    costoAA = cantAA * 450
    costoA = cantA * 350
    costoB = cantB * 150
    costoC = cantC * 100
    costo_total = costoAAA + costoAA + costoA + costoB + costoC
    
    return("costoAAA:" + str(costoAAA) + " costoAA:" + str(costoAA) + " costoA:" + str(costoA) + " costoB:" + str(costoB) + " costoC:" + str(costoC) + " costo total:" + str(costo_total))
    
print(calculoCostoHuevos(1,2,3,4,5))
