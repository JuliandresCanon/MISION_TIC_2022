#1. Verificar letra inicial y letra final
def texto(word):

    print("Empieza con H?:", word.startswith('H'))
    print("Termina con a?:", word.endswith('a'))

texto("Hola mundo")

#2. Intercambiar texto de minusculas a mayusculas y viceversa
def transf1(frase):

    if frase.isupper() == True:
        print(frase.lower())
    else:
        print(frase.upper())

transf1('BUENOS DIAS CLASE')
transf1('buenos dias clase')


def transf2(frase):

    print(frase.swapcase())

transf2('BUENOS dias CLASE')
transf2('buenos DIAS clase')

#3.	Borrar los espacios de un string # Holamundo,bienvenidosybienvenidasaPython

def reemplazo(texto):

    print(texto.replace(' ',''))

reemplazo('Hola mundo, bienvenidos y bienvenidas a Python')
