
# Una empresa consultora de bebidas realizó un estudio sobre la temperatura 
# ideal que debería tener un café colombiano para un buen sabor. 
# Se encontró que la temperatura ideal es de 202 grados Fahrenheit 
# y cada segundo que pasa el café a temperatura ambiente se enfría 1° Fahrenheit.

# Nota: La máquina muestra la temperatura °C que tiene el café que produce.


t_c = float(input("Ingrese temperatura del cafe en °C: "))
t_f = ((9*t_c+(32*5))/5)
print(t_f)

while t_f > 203:
    t_f -= 1
    print(t_f)
