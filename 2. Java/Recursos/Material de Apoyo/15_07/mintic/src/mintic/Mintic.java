package mintic;

import java.util.Scanner;
import javax.swing.text.View;
import mintic.ejemplo.Usuario;
import mintic.espadas.EspadaHierro;
import mintic.espadas.EspadaReforzada;
import mintic.parqueadero.Automovil;
import mintic.parqueadero.Cicla;
import mintic.parqueadero.Motocicleta;
import mintic.parqueadero.Vehiculo;
import mintic.player.Jugador;
import mintic.prueba3.Alimento;
import mintic.prueba3.Conejo;
import mintic.seguridad.HRC1;
import mintic.seguridad.OverolCategoriaUno;
import mintic.seguridad.OverolConvencional;
import mintic.vehiculos.IElectrico;

/**
 *
 * @author Adrian Ruiz
 */
public class Mintic {
    
    public static void main1(String[] args) {
        //Tipos de datos en Java
        //primitivos
        long x = 20l;
        int cantidad = 2; int edad = 20;
        short medio = 123; byte n = 4;
        double valor1 = 18000.50d, valor2 = 2500;
        float menor = (float) 2500.0d;
        boolean flag = false;
        
        //Complejos
        String cantidad2 = "3";
        String nombre1 = "Pedro", nombre2 = "Pedro ";
        
        
        //Mensajes de salida
        
        System.out.println("Total :" + cantidad * valor1);
        
        //Operadores logicos
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        
        System.out.println(!false);
        System.out.println(!true);
        boolean vida = true;
        System.out.println(!vida);
        System.out.println(vida);
        
        //Operadores relacionales
        //Forma recomendada para comparar igualdad entre Strings
        System.out.println(!nombre1.equals(nombre2));
        //No se recomienda
        System.out.println(nombre1 != nombre2);
        
        System.out.println(edad > 20);
        System.out.println(edad >= 20);
        System.out.println(edad < 20);
        System.out.println(edad <= 20);
        System.out.println(edad != 20);
        
        //Operadores matematicos
        System.out.println(edad);
        System.out.println(edad++);
        System.out.println(edad);
        System.out.println(++edad);
        System.out.println(edad);
        
        System.out.println("Total: " + cantidad * valor1);
        System.out.println("Total: " + cantidad / valor1);
        System.out.println("Total: " + cantidad % valor1);
        System.out.println("Total: " + (cantidad + valor1));
        
        //Operadores de asignacion
        
        edad = edad + 19;
        edad += 19;
        System.out.println(edad);
        
        
        //Estructura condicional si-no
        if(edad > 20){
            //...
        }else if(true){
            //...
        }else{
            //...
        }
        //python
        //if a > b :
        //    print("")
        
        
        //Estructuras repetitivas, ciclos o bucles
        for(int a =0; a< 10;a++){
            //..
        }
        
        for(int numero : new Integer[]{1,2,3}){
            //..
        }
        
        while(edad > 10){
            //..
        }
        
        do{
            //..
        }while (true);       

    }
    
    public static void main2(String[] args) {
        
//        if(true && true || true || !true){
//            
//        }
//        
//        if(true){
//            
//        }else{
//            
//        }
//        
//        if(true){
//            
//        }else if(true){
//            
//        }else if(true){
//            
//        }else{
//            
//        }
        int a = 3, b = 3;
        if(a > b){
          System.out.println("a es mayor que b");
        }else if(b > a){
            System.out.println("b es mayor que a");
        }else{
            //pass
        }
        /**
         Programa que solicite 3 números los muestre en pantalla y definir cuál es el número mayor
          y el número menor.
         */
        //double valores = new Scanner(System.in).nextDouble();
        //int a = 3, b = 3;
        Scanner cmd =  new Scanner(System.in);
        System.out.println("Ingrese los valores para el numero 1");
        a = cmd.nextInt(); 
        System.out.println("Ingrese los valores para el numero 2");
        b = cmd.nextInt();
        System.out.println("Ingrese los valores para el numero 3");
        int c = cmd.nextInt();
        
        //Double
        cmd.nextDouble();
        //Float
        cmd.nextFloat();
        //String
        cmd.nextLine();
        
        
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        
        if(a > b && a > c){
            System.out.println("a = "+a+" es mayor");
            if(b > c){
                System.out.println("c = "+c+" es menor");
            }else{
                System.out.println("b = "+b+" es menor");
            }
        }else if(b > c && b > a){
            System.out.println("b = "+b+" es mayor");
            if(a > c){
                System.out.println("c = "+c+" es menor");
            }else{
                System.out.println("a = "+a+" es menor");
            }
        }else{
            System.out.println("c = "+c+" es mayor");
            if(b > a){
                System.out.println("a = "+a+" es menor");
            }else{
                System.out.println("b = "+b+" es menor");
            }
        }
        
    }
    
    static double impuesto(int precioBase){
        double iva = 0;
        if(precioBase > 150000){
            iva = precioBase * 0.19;
        }else{
            iva = precioBase * 0.16;
        }
        return iva;
    }
    
    public static void main3(String[] args) {
        /**
         Programa que lea un valor de precio base y calcule su impuesto, si es valor es mayor de
         150.000 se le aplicará un 19% de impuestos, en caso contrario se le aplicará un 16%.
         */
        Scanner cmd = new Scanner(System.in);
//        int b = 10, index = 0;
//        for(b = 0; b < 10; b++){
//            index = b;
//        }
//        int a = 12;
        //int can = 0;
        while(true){
            //can++;
            System.out.println("Menu:\n1 -> Calcular impuesto\n2 -> Salir");
            int opc = cmd.nextInt();
            
            if(opc == 1){
                System.out.println("Ingrese el valor base: ");
                int precioBase = cmd.nextInt();
                System.out.println("El valor del iva es de: "+ impuesto(precioBase));
            }else{
                break;
            } 
//            for(String palabra : new String[]{"Hola","tripulantes"}){
//                
//            
//            }
        }
        
        do{
            System.out.println("Menu:\n1 -> Calcular impuesto\n2 -> Salir");
            int opc = cmd.nextInt();
            
            if(opc == 1){
                System.out.println("Ingrese el valor base: ");
                int precioBase = cmd.nextInt();

                System.out.println("El valor del iva es de: "+impuesto(precioBase));
            }else{
                break;
            } 
        }while(true);
        
        
        //double e = Math.E;
        //return 0;
    }
    
    public static void main4(String[] args) {
        
//        String dia = "Otro";
//        boolean dato = true;
//        switch(dato){
//            case true:
//                break;
//            case false:
//                break;
//        }
//        switch('a'){
//            case 'a':
//                break;
//            case 'b':
//                break;
//        }
//        switch(dia){
//            case "Lunes":
//            case "Martes":
//            case "Miercoles":
//            case "Jueves":
//            case "Viernes":
//                System.out.println("a trabajar mano");
//                break;
//            case "Sabado":
//            case "Domingo":
//                System.out.println("a playa");
//                break;
//            default:
//                System.out.println("Otro");
//        }
        
//        if(dia == 1){
//            //....
//        }else if(dia == 2){
//            
//        }else if(dia == 3){
//            
//        }else if(dia == 5){
//            
//        }
    
    Scanner cmd = new Scanner(System.in);
    int x = 1;
//    while(1 != x){
//        System.out.println("Menu\n 1 -> Saludar\n 2 -> Salir");
//        int in = cmd.nextInt();
//        if(in == 1){
//            System.out.println("Hola, tripulante!!");
//        }else if(in == 2){
//            System.out.println("Gracias...");
//            System.out.println("Tripulante...");
//            break;
//        }
//        else{
//            System.out.println("error...");
//        }
//    }
    /*
    Escribir un programa en java que permita ingresar para los N alumnos de una 
    universidad: SEXO (‘M’ o ‘F’), edad   y carrera (‘A’,’B’,’C’). 
    Imprimir la carrera con menor promedio de edad de sus alumnos que son varones
    */
    int aM =0, aF=0, bM =0, bF =0,cM=0,cF = 0, edadA =0, edadB =0, edadC =0;
        do {
            System.out.println("Menu\n 1 -> Ingresar un nuevo estudiantes\n 2 -> Resultados \n 3 -> Salir");
            int in = cmd.nextInt();
            switch (in) {
                case 1:
                    System.out.println("M -> Masculino\nF -> Femenino");
                    String sexo = cmd.next();
                    System.out.println("Ingrese la edad:");
                    int edad = cmd.nextInt();
                    System.out.println("Seleccione la carrera:\nA\nB\nC");
                    String carrera = cmd.next();
                    switch(sexo){
                        case "M":
                        case "m":
                            switch(carrera){
                                case "a":
                                case "A":
                                    aM++;
                                    edadA += edad;
                                    //edadA = edadA + edad;
                                    break;
                                case "b":
                                case "B":
                                    bM++;
                                    edadB += edad;
                                    break;
                                case "c":
                                case "C":
                                    cM++;
                                    edadC += edad;
                                    break;
                            }
                            break;
                        case "F":
                        case "f":
                            switch(carrera){
                                case "a":
                                case "A":
                                    aF++;
                                    edadA += edad;
                                    //edadA = edadA + edad;
                                    break;
                                case "b":
                                case "B":
                                    bF++;
                                    edadB += edad;
                                    break;
                                case "c":
                                case "C":
                                    cF++;
                                    edadC += edad;
                                    break;
                            }
                            break;
                    }
                    break;
                case 2:
                    //carrera con menor promedio de edad de sus alumnos que son varones
                    if((aM + aF) <= 0 || (bM + bF) <= 0 || (cM + cF) <=
                            0){
                        System.out.println("Error");
                    }else{
                        double promA =  edadA / (aM + aF), 
                                promB = edadB / (bM + bF), 
                                promC = edadC / (cM + cF);
                        System.out.println("A :"+promA);
                        System.out.println("B :"+promB);
                        System.out.println("C :"+promC);
                        if(promA < promB && promA < promC)
                            System.out.println("El menor promedio es de la Carrera A");
                        else if(promB < promC){
                            System.out.println("El menor promedio es de la Carrera B");
                        }else if(promC < promB){
                            System.out.println("El menor promedio es de la Carrera C");
                        }else{
                            System.out.println("EL promedio de las carreras son iguales.");
                        }
                    
                    }
                    break;
                case 3:
                    System.out.println("Gracias...");
                    System.out.println("Tripulante...");
                    x = 100;
                    break;
                default:
                    System.out.println("error...");
                    break;
            }
        } while (1 == x);
    

        
    }
    public static void main5(String[] args) {
       
        Scanner cmd = new Scanner(System.in);
        
        for(int a=0 ; a<2 ; a++){
            Carro maxda = new Carro();
            
            maxda.color = cmd.next();
            maxda.modelo = cmd.next();
            maxda.peso = cmd.nextInt();
            maxda.example();
            System.out.println(maxda.info());
            
            System.out.println(Carro.infoCarro(maxda));
            //Math.
        }
//        Carro maxda = new Carro();
//        maxda.color = "gris";
//        maxda.modelo = "2000";
//        maxda.peso = 600;
//        
//        System.out.println(maxda.color + " "+ maxda.modelo+" - "+maxda.peso);
        
//        Usuario usu = new Usuario();
//        usu.contrasena = "12345";
//        usu.id = "987654321";
//        usu.nombre = "Adrian";
//        Usuario admin = new Usuario();
//        admin.id = "88881";
//        admin.contrasena ="$#!q1213";
//        admin.nombre = "ramon";


        //celular
        //nombre
        //direccion
        //email
        //foto
        //web
        
        //agregar
        //eliminar
        //editar
        //informacion
        //llamar
        //buscar
    }
    
    public static void main6(String[] args) {
        
        /*
            Desarrolle un programa que solicite a N cantidad de Jugadores con su Nick y su puntaje 
            para evaluar cual de los jugadores tiene el mayor puntaje y el menor, desarrolle una 
            solución usando clases y objetos.
        */
        Scanner cmd = new Scanner(System.in);
        boolean ciclo = true;
        Jugador mayor = null, menor = new Jugador("", 0);
        while(ciclo){
            String menu = "Menu\n1 -> Registrar un nuevo Jugador\n2 -> Resultados\n3 -> Salir";
            System.out.println(menu);
            int opc = cmd.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Ingrese nombre y puntaje del jugador: \n");
                    Jugador player = new Jugador(cmd.next(),cmd.nextInt());
                    if(mayor == null){
                        mayor = player;
                        menor = player;
                    }
                    if(mayor.getPuntaje() < player.getPuntaje()){
                        mayor = player;
                    }else if(menor.getPuntaje() > player.getPuntaje())
                        menor = player;
                    break;
                case 2:
                    if(mayor != null)
                        System.out.println(mayor.getInfo());
                    System.out.println(menor.getInfo());
                    break;
                case 3:
                    ciclo = false;
                    break;
                default:
                    
            }
        }
        
        
    }
    public static void main7(String[] args) {
        
        /*
            Desarrolle un programa que solicite a N cantidad de Jugadores con su Nick y su puntaje 
            para evaluar cual de los jugadores tiene el mayor puntaje y el menor, desarrolle una 
            solución usando clases y objetos.
        */
        Scanner cmd = new Scanner(System.in);
        boolean ciclo = true;
        Jugador[] jugadores = new Jugador[3];
        
        Jugador mayor = null, menor = new Jugador("", 0);
        while(ciclo){
            String menu = "Menu\n1 -> Registrar un nuevo Jugador\n2 -> Resultados\n3 -> Salir";
            System.out.println(menu);
            int opc = cmd.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Ingrese nombre y puntaje del jugador: \n");
                    Jugador player = new Jugador(cmd.next(),cmd.nextInt());
                    for(int a =0; a< jugadores.length; a++){
                        if(jugadores[a] == null){
                            jugadores[a] = player;
                            break;
                        }
                        if(player.getPuntaje() > jugadores[a].getPuntaje())
                        {
                            Jugador temp = jugadores[a];
                            jugadores[a] = player;
                            for(int i= a+1 ; i < jugadores.length;i++){
                                Jugador tempi = jugadores[i];
                                
                                if(i == a+1)
                                    jugadores[i] = temp;
                                else
                                    jugadores[i] = tempi;
                            }
                        }
                    }
                    
                    break;
                case 2:
                    for(int a =0; a< jugadores.length; a++){
                        if(jugadores[a] != null)
                            System.out.println(jugadores[a].getInfo());
                    }
                    break;
                case 3:
                    ciclo = false;
                    break;
                default:
                    
            }
        }
        
        
    }
    
    public static void main8(String[] args) {
        Scanner cmd = new Scanner(System.in);
        Vehiculo[] parqueadero = new Vehiculo[10];
//        Motocicleta moto = new Motocicleta("", "");
//        parqueadero[0] = moto;
//        Cicla cicla = new Cicla("", "");
//        parqueadero[1] = cicla;
        //Automovil ejemplo = null;
        //Automovil auto = new Automovil("maxda", "ibc20a");
        //Object obj = auto;
        
        ciclo : do{
            System.out.println("Menu\n1->Ingresar un vehiculo\n2->Listar\n3->Retirar vehiculo\n4->Salir");
            Vehiculo seleccion = null;
            switch(cmd.nextInt()){
                case 1:
                    System.out.println("Seleccione\n1->Automovil\n2->Motocicleta\n3->Cicla");
                    switch(cmd.nextInt()){
                        case 1:
                            System.out.println("Ingrese la marca y la placa del Automovil");
                            seleccion = new Automovil(cmd.next(), cmd.next());
                            break;
                        case 2: 
                            System.out.println("Ingrese la marca y la placa de la Motocicleta");
                            seleccion = new Motocicleta(cmd.next(), cmd.next());
                            break;
                        case 3:
                            System.out.println("Ingrese la marca y la serial de la Cicla");
                            seleccion = new Cicla(cmd.next(), cmd.next());
                            break;
                    }
                        
                        listarVehiculos(parqueadero);
                        //String placa = cmd.next();
                        System.out.println("Seleccione una ubicacion del parqueadero:");
                        parqueadero[cmd.nextInt()-1] = seleccion;
                        listarVehiculos(parqueadero);
                    break;
                case 2:
                        listarVehiculos(parqueadero);
                    break;
                case 3: 
                        listarVehiculos(parqueadero);
                        System.out.println("Seleccione una ubicacion del parqueadero:");
                        parqueadero[cmd.nextInt()-1] = null;
                    break;
                case 4:
                    break ciclo;
                    default:
                        
            }
        }while(true);
    }

    private static void listarVehiculos(Vehiculo[] parqueadero) {
        for(int a=0;a< parqueadero.length;a++){
            if(parqueadero[a] instanceof Cicla){
                Cicla cicla = (Cicla) parqueadero[a];
                System.out.println("("+(a+1)+") "+ 
                        cicla.getSerial() + " " + 
                        cicla.getMarca() + " - " + 
                        cicla.getTarifa());
            }else if(parqueadero[a] instanceof Automovil){
                Automovil auto = (Automovil) parqueadero[a];
                System.out.println("("+(a+1)+") "+ 
                        auto.getMatricula() + " " + 
                        auto.getMarca() + " - " + 
                        auto.getTarifa());
            }else if(parqueadero[a] instanceof Motocicleta){
                Motocicleta moto = (Motocicleta) parqueadero[a];
                System.out.println("("+(a+1)+") "+ 
                        moto.getMatricula() + " " + 
                        moto.getMarca() + " - " + 
                        moto.getTarifa());
                //moto = new Automovil("", "");
            }else
                System.out.println("("+(a+1)+") Espacio disponible.");
        }
        //return "";
    }
    
    public static void main9(String[] args) {
        
        EspadaReforzada espada = new EspadaReforzada(5,"material","medida",1);
        //EspadaHierro hierro = new EspadaHierro(5);
        //hierro.cortar();
        //System.out.println(hierro.cortar()+" - "+ espada.cortar());
    }
    
    public static void main10(String[] args) {
        
        mintic.vehiculos.Automovil sparkGT = new mintic.vehiculos.Automovil();
        boolean resultado = sparkGT.pruebElectrico(sparkGT, new mintic.vehiculos.Motocicleta());
        mintic.vehiculos.IElectrico electrico = sparkGT;
        
        
//        sparkGT.getFabricante();
//        
//        mintic.vehiculos.Combustion combustion = sparkGT;
//        combustion.getTipo_combustible();
//        
//        mintic.vehiculos.Vehiculo general = sparkGT;

        mintic.vehiculos.Motocicleta pulsar = new mintic.vehiculos.Motocicleta();
        
        String ejemplo = mintic.vehiculos.Motocicleta.NOMBRE_ELECTRICO;
        
        
    }
    
    public static void main11(String[] args) {
        
        Alimento banana = new Alimento(120);
        Alimento raices = new Alimento(60);
        Alimento platano = new Alimento(78.5);
        double suma = 0;
        
        
        
        Alimento[] alimentos = new Alimento[3];
        alimentos[0] = banana;
        alimentos[1] = raices;
        alimentos[2] = platano;
        
        //Ciclo for
        for(Alimento ali : alimentos)
            suma += ali.getGramos();
        for(int a=0; a< alimentos.length;a++)
            suma += alimentos[a].getGramos();

        
        Conejo conejo = new Conejo(2.1);
        conejo.setAlimsIngeridos(alimentos);

        System.out.println(conejo.getPeso());
        //System.out.println(conejo.getPesoAlims());        
        System.out.println(Math.round(conejo.getIMC()));
    }
    
    public static void main(String[] args) {
        OverolConvencional convencional = new OverolConvencional(OverolConvencional.Tallas.SM, 
                OverolConvencional.Opciones.Impermeable,
                "Gris");
        //convencional = new OverolConvencional(talla, 0, color);
        OverolCategoriaUno uno = new OverolCategoriaUno("", "", "");
        //HRC1.caracteristicas;
        System.out.println(convencional.getMaterial());
    }
    
}
