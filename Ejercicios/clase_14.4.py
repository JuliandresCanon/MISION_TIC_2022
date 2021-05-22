# Hacer un código que lea cuatro datos: El código de un estudiante 
# y las notas de los tres previos de una materia cualquiera; y que 
# calcule e imprima la nota final de la materia, junto con el código 
# del estudiante. Este se podrá utilizar para más de un estudiante, 
# y que informe cuantos perdieron la materia.

bandera = True
cont = 0
perd = 0

while bandera == True:
    
    cod = int(input("Ingrese el código del estudiante: "))
    
    if cod == 0:
        bandera = False
    
    else:
        cont += 1
        n1 = float(input("Nota 1: "))
        n2 = float(input("Nota 2: "))
        n3 = float(input("Nota 3: "))
        nf = (n1+n2+n3)/3
        print(cod, nf)
    
    if nf < 3:
        perd += 1
    
print("En el curso hay", cont, "Estudiantes")
print("De los cuales", perd, "perdieron la materia")
