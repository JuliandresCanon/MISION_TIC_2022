#RetoMisionTic2022 @Ministerio_TIC @UIS

import os
os.system ("cls")

peso=float(input("Ingrese su Peso (kg): " ))
estatura=float(input("Ingrese su Estatura (m): " ))

imc=(round(peso/(estatura*estatura), 1))

if imc < 18.5:
    print("Bajo peso")
elif imc < 25:
    print("Normal")
elif imc < 30:
    print("Sobrepeso")
else:
    print("Obeso")
