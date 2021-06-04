x = int(input("Coordenada X: "))
y = int(input("Coordenada Y: "))

if x == 0 and y == 0:
    #x es igual a 0, y es igual a 0
    print("Origin")
elif x == 0:
    #x es igual a 0
    print("Axis Y")
elif y == 0:
    #y es igual a 0
    print("Axis X")
elif x > 0 and y > 0:
    #x es mayor que 0, y es mayor que 0
    print("Quadrant I")
elif x > 0 and y < 0:
    #x es mayor que 0, y es menor que 0
    print("Quadrant IV")
elif x < 0 and y > 0:
    #x es menor que 0, y es mayor que 0
    print("Quadrant II")
elif x < 0 and y < 0:
    #x es menor que 0, y es nenor que 0
    print("Quadrant III")
