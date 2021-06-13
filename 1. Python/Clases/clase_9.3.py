#ALGORITMO QUE DETERMINE QUIENES TIENEN LA MISMA EDAD

juan = int(input("Ingrese la edad de Juan "))
mario = int(input("Ingrese la edad de Mario "))
pedro = int(input("Ingrese la edad de Pedro "))

if juan == mario and juan == pedro:
    print("Todos tienen la misma edad")
elif juan == mario:
    print("Juan y Mario tienen la misma edad")
elif juan == pedro:
    print("Juan y Pedro tienen la misma edad")
elif mario == pedro: 
    print("Mario y Pedro tienen la misma edad")
else:
    print("Tienen edades diferentes")
