# Tenemos la información de las personas mayores de edad que viven en un barrio X. 
# Por cada una de ellas hay un registro con tres datos: el nombre, la edad y el sexo
# (H=hombre, M=mujer). No sabemos cuantos son pero en el último registro el campo edad 
# es igual a cero. Hacer el programa que averigüe e imprima: 
# a) Cuantos hombres y cuantas mujeres hay en el barrio. 
# b) El nombre y la edad de todas las ancianas (mayores de 70 años), y cuantas hay en el barro.

# https://colab.research.google.com/drive/13kP5W8O-7JRWvXPAI0PlKc3WQ8m9SbVs?usp=sharing#scrollTo=511k5Tgox5dx
# https://colab.research.google.com/drive/1CrzBGm1xVsrpuviPYK3d951D5Ut4XJKJ?usp=sharing#scrollTo=9y1rf1r5XJNa


bandera = True
cont = 0
cont_m = 0 
cont_f = 0
cont_v = 0

while bandera == True:
    cont += 1
    nombre = str(input("Nombre: "))
    edad = int(input("Edad: "))
    sexo = str(input("Sexo M/F: "))
    print(nombre, edad, sexo)
    
    if edad == 0:
        bandera = False
    
    if sexo == "M":
        cont_m += 1
        
    elif sexo == "F":
        cont_f += 1
        
    if edad > 70 and sexo == "F":
        cont_v += 1

print("En el barrio hay", cont, "Personas")
print("De los cuales", cont_m, "son hombres")
print("De los cuales", cont_f, "son mujeres")
print("De los cuales", cont_v, "son ancianas")

