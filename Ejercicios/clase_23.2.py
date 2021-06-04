import string
def alfabeto():
    return string.ascii_lowercase

letras = list(alfabeto())
quitar = []

for n in range (2, len(letras), 3):
    quitar.append(letras[n])

for m in quitar:
    letras.remove(m)

print(letras)
