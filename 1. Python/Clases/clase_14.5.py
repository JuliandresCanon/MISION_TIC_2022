# El cajero de un banco solo dispone de billetes de $ 10.000, $ 2.000 y $ 100. 
# Su función es cambiar los cheques a los clientes, dándoles el menor número 
# posible de billetes. Asumiendo que todos los cheques son múltiplos de $ 100, 
# hacer el diagrama y el programa que reciba el valor del cheque a cambiar y 
# que le informe al cajero cuantos billetes de cada denominación debe entregar. 
# Como no se sabe cuantos clientes vienen en un día, el programa debe terminar 
# cuando reciba ceros como valor del cheque, y al final del día debe informar 
# cuántos billetes de cada denominación se gastaron.

flag = True
cont = 0
cont_b1 = 0
cont_b2 = 0
cont_b3 = 0
cheque = 0

while flag == True:
    cheque = int(input("Ingrese valor del cheque a cambiar \n $"))
    
    b1 = cheque//10000
    b2 = (cheque-(b1*10000))//2000
    b3 = (cheque-(b1*10000)-(b2*2000))//100
    
    if cheque == 0:
        flag = False
    else:
        print("Se deben entregar", b1, "billetes de $10000,", b2, "billetes de $2000, y", b3, "billetes de $100")
        cont += 1
        cont_b1 += b1
        cont_b2 += b2
        cont_b3 += b3
    
print("En la jornada se entregaron", cont_b1, "billetes de $10000 para un total de $", cont_b1*10000)
print("En la jornada se entregaron", cont_b2, "billetes de $2000 para un total de $", cont_b2*2000)
print("En la jornada se entregaron", cont_b3, "billetes de $100 para un total de $", cont_b3*100)
