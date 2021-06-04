materias = ["Matematicas", "Fisica", "Quimica", "Historia", "Lengua"]
reprobado = []

for n in materias:
    nota = float(input("Ingrese la nota de " + n + ": "))
    
    if nota < 3.0:
        reprobado.append(n)
    
print("Las materias que debe repetir son: ", reprobado)
