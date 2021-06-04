# Hacer un programa que lea un número n entero y positivo, de cualquier número de dígitos, 
# que calcule la suma de sus dígitos y que la imprima junto con el número leído.

# https://colab.research.google.com/drive/1CrzBGm1xVsrpuviPYK3d951D5Ut4XJKJ?usp=sharing

n = str(input("Número: "))
suma = 0

for x in n:
    digito = (int(x))
    suma += digito

print(suma, n)
