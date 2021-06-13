def procesar_dato(a, b):
    if a < 2 and b < 0.027:
        c = True
    else:
        c = False
    return c

print(procesar_dato(1, 0.03))



def area_triangulo(a, b, c):
    import math

    s = (a+b+c)/2
    area = math.sqrt(s*(s - a)*(s - b)*(s - c))
    return area

print(area_triangulo(4, 5 ,3))



def peso_a_euro(a):
    b = a / 4491.96 
    return b

print (peso_a_euro(50000))



def yoEstoyViendo(cursos):
    materias = cursos.split(",")
    viendo = []
    for i in range(len(materias)):
        viendo.append("Yo estoy viendo " + materias[i])
    return viendo

print(yoEstoyViendo("Inglés,Física,Sociales,Historia,Programación"))
