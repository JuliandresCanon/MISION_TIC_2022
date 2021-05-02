clear;

# DATOS INICIALES DE ENTRADA
Datos=input(['Introducir datos por: EXCEL [1], MANUAL [2] ' '\n']);

if Datos==1:

    # EXCEL

    nnd=xlsread('DATOS_PORTICO.xlsx','DATOS','E4');     #Numero de nudos
    nsec=xlsread('DATOS_PORTICO.xlsx','DATOS','E5');    #Numero de secciones
    nmat=xlsread('DATOS_PORTICO.xlsx','DATOS','E6');    #Numero de materiales
    nel=xlsread('DATOS_PORTICO.xlsx','DATOS','E7');     #Numero de elementos
    nndrest=xlsread('DATOS_PORTICO.xlsx','DATOS','E8'); #Numero de nudos restringidos
    nFext=xlsread('DATOS_PORTICO.xlsx','DATOS','E9');   #Numero de fuerzas externas
    nAsen=xlsread('DATOS_PORTICO.xlsx','DATOS','E10');  #Número de asentamientos.

    GL=nnd*3;

    # DIMENSIONAMIENTO DE MATRICES

    Coor=zeros(nnd,2);
    Sec=zeros(nsec,2);
    Mprop=zeros(nmat,1);
    Elem=zeros(nel,4);
    Rest=zeros(nnd,3); # Matriz de restricciones de los nudos
    Fext=zeros(nnd,3);
    Asen=zeros(nnd,3);

    FF=zeros(GL,1);

    GLnd=zeros(nnd,2); # Matriz de grados de libertad de los nudos
    GLel=zeros(nel,4); # Matriz de grados de libertad de los elementos o Matriz de Incidencia


    # Matriz de Coordenadas
    [num,xlRange]=xlsread('DATOS_PORTICO.xlsx','NUDOS','F4');

    Coor=xlsread('DATOS_PORTICO.xlsx','NUDOS',Rango);

    # Matriz Propiedades de la Seccion
    [num,xlRange]=xlsread('DATOS_PORTICO.xlsx','SECCIONES','F4');

    Sec=xlsread('DATOS_PORTICO.xlsx','SECCIONES',Rango);

    # Matriz Propiedades de Materiales
    [num,xlRange]=xlsread('DATOS_PORTICO.xlsx','MATERIALES','F4');

    Mprop=xlsread('DATOS_PORTICO.xlsx','MATERIALES',Rango);

    # Matriz con las Definiciones de los Elementos
    [num,xlRange]=xlsread('DATOS_PORTICO.xlsx','ELEMENTOS','F4');

    Elem=xlsread('DATOS_PORTICO.xlsx','ELEMENTOS',Rango);

    # Matriz con las Restricciones de los Nudos
    [num,xlRange]=xlsread('DATOS_PORTICO.xlsx','RESTRICCIONES','F4');

    Rest=xlsread('DATOS_PORTICO.xlsx','RESTRICCIONES',Rango);

    # Matriz de Fuerzas Externas en los Nudos
    [num,xlRange]=xlsread('DATOS_PORTICO.xlsx','FUERZAS','F4');

    Fext=xlsread('DATOS_PORTICO.xlsx','FUERZAS',Rango);

    # Matriz con los Asentamientos en los Apoyos
    [num,xlRange]=xlsread('DATOS_PORTICO.xlsx','ASENTAMIENTOS','F4');

    Asen=xlsread('DATOS_PORTICO.xlsx','ASENTAMIENTOS',Rango);


    # Cálculo de Grados de libertad restringidos por EXCEL

    nr=0;
    for i in range (1,nnd):
        for j in range (1,3):
            nr=nr+Rest(i,j);
        end
    end


    # MANUAL

    nnd=input(['Numero de nudos' '\n']);
    nsec=input(['Numero de secciones' '\n']);
    nmat=input(['Numero de materiales' '\n']);
    nel=input(['Numero de elementos' '\n']);
    nndrest=input(['Numero de restricciones' '\n']);
    nFext=input(['Numero de fuerzas externas' '\n']);
    nAsen=input(['Numero de asentamientos' '\n']);

    GL=nnd*3;

    # DIMENSIONAMIENTO DE MATRICES

    Coor=zeros(nnd,2);
    Sec=zeros(nsec,2);
    Mprop=zeros(nmat,1);
    Elem=zeros(nel,4);
    Rest=zeros(nnd,3); # Matriz de restricciones de los nudos
    Fext=zeros(nnd,3);
    Asen=zeros(nnd,3);

    FF=zeros(GL,1);

    GLnd=zeros(nnd,2); # Matriz de grados de libertad de los nudos
    GLel=zeros(nel,4); # Matriz de grados de libertad de los elementos o Matriz de Incidencia


    # ENTRADA DE DATOS DE LOS NUDOS

    for i in range (1,nnd):
        Coor(i,1)=input(['Coordenada x del nudo ' num2str(i) '\n'])
        Coor(i,2)=input(['Coordenada y del nudo ' num2str(i) '\n'])
    end


    # SECCIONES

    for i=1:1:nsec
        b=input(['Base de la sección ' num2str(i) '\n'])
        h=input(['Altura de la sección ' num2str(i) '\n'])
        Sec(i,1)=b*h;
        Sec(i,2)=b*h^3/12;
    end


    # MATERIALES

    for i=1:1:nmat
        Mprop(i,1)=input(['Modulo de elasticidad del material ' num2str(i) '\n'])
    end


    # IDENTIFICACION DE LOS ELEMENTOS

    for i=1:1:nel
        Elem(i,1)=input(['Nudo inicial del elemento ' num2str(i) '\n'])
        Elem(i,2)=input(['Nudo final del elemento ' num2str(i) '\n'])
        Elem(i,3)=input(['Tipo de seccion del elemento ' num2str(i) '\n'])
        Elem(i,4)=input(['Tipo de material del elemento ' num2str(i) '\n'])
    end


    # ENTRADA DE DATOS DE LAS RESTRICCIONES

    nr=0;

    for il=1:1:nndrest
        i=input(['Nudo restringido ' '\n'])
        j=input(['Restringido en x[1], y[2], z[3], xy[4], xyz[5] ' '\n'])
        if j<4:
            Rest(i,j)=1;
            nr=nr+1;
        else
            if j==4:
                Rest(i,1)=1;
                Rest(i,2)=1;
                nr=nr+2;

            else
                Rest(i,1)=1;
                Rest(i,2)=1;
                Rest(i,3)=1;
                nr=nr+3
            end
        end
    end


    # FUERZAS EXTERNAS

    for k=1:1:nFext
        i=input(['Nudo con carga ''\n'])
        j=input(['Direccion de la carga en x[1], y[2], z[3], xy[4] ''\n'])

        if j<4:
            Fext(i,j)=input(['Magnitud de la carga en el nudo ' num2str(i) '\n'])
        else
            F=input(['Magnitud de la carga en el nudo ' num2str(i) '\n'])
            Ang=input(['Angulo de inclinacion de la carga con respecto a x(+)' '\n'])
            Fext(i,1)=F*cosd(ang);
            Fext(i,2)=F*send(ang);
        end
    end


    #ENTRADA DE DATOS DE ASENTAMIENTOS

    for il=1:1:nAsen
        i=input(['Nudo con asentamiento ' '\n'])
        j=input(['Direccion del asentamiento en x[1], y[2], z[3] ' '\n'])
        Asen(i,j)=input(['Magnitud del asentamiento en el nudo ' num2str(i) '\n'])
    end
end

# FIN INGRESO DE DATOS



GIC=GL-nr;

# DIMENSIONAR DESPLAZAMIENTOS Y MATRIZ DE RIGIDEZ GLOBAL

KT=zeros(GL,GL);
UT=zeros(GL,1);
UA=zeros(nr,1);     # Desplazamientos de los apoyos
UN=zeros(GIC,1);
FA=zeros(nr,1);     # Reacciones de los apoyos
FN=zeros(GIC,1);


# MATRIZ DE GRADOS DE LIBERTAD

il=1;
ir=GIC+1;
for i=1:1:nnd
    for j=1:1:3
        if Rest(i,j)==1:
            GLnd(i,j)=ir;
            ir=ir+1;
        else
            GLnd(i,j)=il;
            il=il+1;
        end
    end
end


# TRANSFORMACION DEL VECTOR DE FUERZAS EXTERNAS Y VECTOR DE DESPLAZAMIENTOS

for i=1:1:nnd
    for j=1:1:2
        if GLnd(i,j)<=GIC:
            FN(GLnd(i,j),1)=Fext(i,j);
        else
            FA(GLnd(i,j)-GIC,1)=Fext(i,j);
            UA(GLnd(i,j)-GIC,1)=Asen(i,j);
        end
    end
end


# DETERMINACION DE LA MATRIZ DE RIGIDEZ Y DE TRANSFORMACION DE CADA ELEMENTO

for i=1:1:nel

    # PROPIEDADES DE CADA ELEMENTO

    xi=Coor(Elem(i,1),1);
    yi=Coor(Elem(i,1),2);
    xf=Coor(Elem(i,2),1);
    yf=Coor(Elem(i,2),2);

    Delx=xf-xi;
    Dely=yf-yi;
    Long=(Delx^2+Dely^2)^0.5;
    Cs=Delx/Long;
    Sn=Dely/Long;
    T{i}=[Cs,-Sn,0,0,0,0;
          Sn,Cs,0,0,0,0;
          0,0,1,0,0,0;
          0,0,0,Cs,-Sn,0;
          0,0,0,Sn,Cs,0;
          0,0,0,0,0,1];

     AE=Sec(Elem(i,3),1)*Mprop(Elem(i,4),1);
     IE=Sec(Elem(i,3),2)*Mprop(Elem(i,4),1);

    # MATRIZ DE RIGIDEZ LOCAL

    r1=AE/Long;
    r2=12*IE/Long^3;
    r3=6*IE/Long^2;
    r4=4*IE/Long;
    r5=2*IE/Long;

    kel=[r1,0,0,-r1,0,0;
         0,r2,r3,0,-r2,r3;
         0,r3,r4,0,-r3,r5;
         -r1,0,0,r1,0,0;
         0,-r2,-r3,0,r2,-r3;
         0,r3,r5,0,-r3,r4];

    # MATRIZ DE RIGIDEZ GLOBAL

    keg{i}=T{i}*kel*T{i}';

    # IDENTIFICACION DE GRADOS DE LIBERTAD POR ELEMENTO

    for j=1:1:3
        GLel(i,j)=GLnd(Elem(i,1),j);
        GLel(i,j+3)=GLnd(Elem(i,2),j);
    end

    # ENSAMBLAJE DE LA MATRIZ DE RIGIDEZ
    for m=1:1:6
        for n=1:1:6
            KT(GLel(i,m),GLel(i,n))=KT(GLel(i,m),GLel(i,n))+keg{i}(m,n);
        end
    end


    # CALCULO DE FUERZAS FIJAS

    # Dimensionamiento de Vectores
    Fg=zeros(2,1);
    Fl=zeros(2,1);
    FFl=zeros(6,1);
    FFg=zeros(6,1);

    # Transformacion de Fuerzas
    TF=[Cs,-Sn;
        Sn,Cs];

    ncff=input(['Numero de Cargas en el Elemento ' num2str(i) '\n']);
    FFelp=zeros(6,1);
    for k=1:1:ncff
        tc=input(['Tipo de Carga en el Elemento ' num2str(i) ': PUNTUAL[1], DISTRIBUIDA[2]' '\n']);

        if tc==1:

        #CALCULO FUERZAS FIJAS CARGA PUNTUAL

            a=input(['Distancia de la Carga Puntual (LOCALES) ''\n']);
            b=Long-a;
            px=input(['Carga en Direccion x (GLOBALES) ''\n']);
            py=input(['Carga en Direccion y (GLOBALES) ''\n']);

            Fg(1,1)=px;
            Fg(2,1)=py;

            Fl=TF'*Fg;

            FFl(1,1)=-Fl(1,1)*b/Long;
            FFl(2,1)=-Fl(2,1)*b/Long*(1+a*b/Long^2-a^2/Long^2);
            FFl(3,1)=-Fl(2,1)*a*b^2/Long^2;
            FFl(4,1)=-Fl(1,1)*a/Long;
            FFl(5,1)=-Fl(2,1)*a/Long*(1+a*b/Long^2-b^2/Long^2);
            FFl(6,1)=Fl(2,1)*b*a^2/Long^2;

            FFg=T{i}*FFl;

        else

            #CALCULO FUERZAS FIJAS CARGA DISTRIBUIDA

            wx=input(['Carga Distribuida en Direccion x (GLOBALES) ''\n']);
            wy=input(['Carga Distribuida en Direccion y (GLOBALES) ''\n']);

            Fg(1,1)=Dely*wx;
            Fg(2,1)=Delx*wy;

            Fl=1/Long*TF'*Fg;

            FFl(1,1)=-Fl(1,1)*Long/2;
            FFl(2,1)=-Fl(2,1)*Long/2;
            FFl(3,1)=-Fl(2,1)*Long^2/12;
            FFl(4,1)=-Fl(1,1)*Long/2;
            FFl(5,1)=-Fl(2,1)*Long/2;
            FFl(6,1)=Fl(2,1)*Long^2/12;

            FFg=T{i}*FFl;
        end
        FFelp=FFelp+FFg;
        FFel{i}=FFelp;
    end


    # ENSAMBLAJE DEL VECTOR DE FUERZAS FIJAS

    for l=1:1:6
        FF(GLel(i,l),1)=FF(GLel(i,l),1)+FFelp(l,1);
    end

end


# EXTRACCION DE LA MATRIZ DE RIGIDEZ

KNN=KT(1:GIC,1:GIC);
KNA=KT(1:GIC,GIC+1:GL);
KAN=KT(GIC+1:GL,1:GIC);
KAA=KT(GIC+1:GL,GIC+1:GL);
FNF=FF(1:GIC,1)
FAF=FF(GIC+1:GL,1)

# SOLUCION DE DESPLAZAMIENTOS Y REACCIONES

UN=KNN^-1*(FN-FNF-KNA*UA)
FA=-FA+FAF+KAN*UN+KAA*UA


# FUERZAS EN LOS EXTREMOS DE LOS ELEMENTOS

for i=1:1:nel

    Uel=zeros(6,1);

    # IDENTIFICACION DE LOS DESPLAZAMIENTOS EN EL ELEMENTO

    for j=1:1:6

        if GLel(i,j)<= GIC:
            Uel(j,1)=UN(GLel(i,j));
        else
            Uel(j,1)=UA(GLel(i,j)-GIC);
        end

        # FUERZAS GLOBALES EN LOS EXTREMOS DEL ELEMENTO
        Fgel{i}=FFel{i}+keg{i}*Uel;

        # FUERZAS LOCALES EN LOS EXTREMOS DEL ELEMENTO
        Flel{i}=T{i}'*Fgel{i};
    end

end
