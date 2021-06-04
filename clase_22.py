a=5
numeros=[1,a,555,333,444]
print(numeros[1])#Validamos el valor en una posicion
print(numeros[:])#Imp todos los elementos
print(numeros[1:3])#Imp dentro de intervalo: x1,x2
print("acá: ", numeros[:-3]) #Imp quitando los ultimos indicados
print(numeros[:2])#Imp hasta la posicion indicada
print(numeros[-3:])#Imp eliminando las posiciones en reversa de la indicada


#append
nombres=['David', 'Elkincito', 'Diaz']
print(nombres)
nombres.append("Plata")
print(nombres)

#agregar lista extend
apellidos=['juan', 'carlos', 'laura']
print('apellidos: ',apellidos)
nombres.extend(apellidos)
print("nombres y apellidos", nombres)

#agregar en una posicion x, un dato nuevo
nombres.insert(1, 'Ivon')
apellidos.insert(1, 'Martinez')
print(nombres, apellidos)
nombres.extend(apellidos)
print(nombres)
print("----------------------------")

print("palabra: ",nombres.pop(0),nombres)

print("palabra: ",nombres.pop(),nombres)
a=input('escriba un nombre: ')
nombres.remove(a)
print("palabra eliminada", nombres)


n=10
edades=list(range(n))
print(edades)
print(edades[0])
print(edades[n-1])
print(len(edades))



prueba=['mundo','feliz', 'bonito']
for i in prueba:
    print(i)
