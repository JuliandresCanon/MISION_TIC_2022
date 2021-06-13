contagio_validado = "No"
paciente = "Lisa"

if (contagio_validado == "No"):
    print("La paciente " + paciente +
    ", aún no se ha realizado su prueba para validad si se encuentra contagiado, se recomienda aplicar la prueba PCR")
    print("Aplicando prueba ...")
    contagio_validado = "Pendiente"

if (contagio_validado == "Pendiente"):
    print(paciente + ", por favor valide en su correo el resultado de la prueba")
    contagio_validado = "Si"

if (contagio_validado == "Si"):
    print(paciente + ", de acuerdo a su resultado, por favor mantengase alejado de las personas")
