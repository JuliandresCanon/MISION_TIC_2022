x = int(input())
y = int(input())

if x > 0:
    if y > 0:
        #x es mayor que 0, y es mayor que 0
        print("Quadrant I")
    else:
        #x es mayor que 0, y es menor o igual que 0
        print("Quadrant IV")
else:
    if y > 0:
        #x es menor o igual que 0, y es mayor que 0
        print("Quadrant II")
    else:
        #x es menor o igual que 0, y es menor o igual que 0
        print("Quadrant III")
