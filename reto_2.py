#RetoMisionTic2022 @Ministerio_TIC @UIS

import os
os.system ("clear")

peso=float(input("Ingrese su Peso en kg: " ))
estatura=float(input("Ingrese su Estatura en m: " ))

imc=(round(peso/(estatura*estatura), 1))

if imc < 18.5:
    print(" IMC = " + str(imc) + " Bajo Peso")
elif imc < 25:
    print(" IMC = " + str(imc) + " Normal")
elif imc < 30:
    print(" IMC = " + str(imc) + " Sobrepeso")
else:
    print(" IMC = " + str(imc) + " Obeso")
