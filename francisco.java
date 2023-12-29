import java.util.Scanner;
import java.util.Calendar;
import java.util.Random;

public class francisco {
    public static void main ( String args[]) {
//???????????????????????????????????????????????????????????????????????????????????????????????????????????????????
//      Variables
        Random ale          = new Random(System.currentTimeMillis());           //Generador de numeros aleatorios
        Scanner sc          = new Scanner(System.in);                           //Metodo de entrada de datos
        Calendar call       = Calendar.getInstance();                           //Metodo de lectura de reloj
        String blanco       = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";         //Para poner la pantalla limpia
        String opcion       = "",                                               //Variable para validar datos introducidos correctos
                prefix      = "Lord",                                           //Prefijo del usuario
                saludo      = "día",                                            //Dias,noches,tardes
                cadena      = "",                                               //lectura del teclado enviada a metodos
                nomUser     = " ",                                              //Nombre de usuario
                ampm        = "aapp";                                           //guarda la palabra am o pm
        double res          = 0.0,                                              // Variables de operaciones
                nEntrada    = 0.0,                                              //...
                nNumeros    = 0.0,                                              //...
                n1          = 0.0,                                              //...
                n2          = 0.0;                                              //...
        boolean caso        = false;                                            //Variable en el ciclo principal While
        int hora            = call.get(Calendar.HOUR_OF_DAY),                   //Variafles de hora y fecha: Hora del dia 24jrs
            minuto          = call.get(Calendar.MINUTE),                        //... Minutos
            segundo         = call.get(Calendar.SECOND),                        //... Segundos
            diaM            = call.get(Calendar.DAY_OF_MONTH),                  //... Dia del mes 1-31
            diaS            = call.get(Calendar.DAY_OF_WEEK),                   //... Dia de la semana 1-7
            mes             = call.get(Calendar.MONTH),                         //... Mes 1-12
            anio            = call.get(Calendar.YEAR),                          //... 1970->
            diasAnio        = call.get(Calendar.DAY_OF_YEAR),                   //... Dias del año 1-356
            nOperadores     = 0;                                                //Cuenta el numero de operadores en Juegos->Operaciones->Switch(Default)
        char operadores[]   ={'^','^','^','^','^','^','^','^'};                 //Arreglo de operadores en Juegos->Operaciones->Switch(Default)
        String sdiaS[]      = {" ","Domingo","Lunes","Martes",                  //Lunes, Martes, Mier...
                                "Miercoles","Jueves","Viernes",                 //
                                "Sábado"},                                      //
                smes[]      = {"Enero","Febrero","Marzo",                       //Enero, Febrero, Marzo...
                                "Abril","Mayo","Junio","Julio",                 //
                                "Agosto","Septiembre","Octubre",                //
                                "Noviembre","Diciembre"};                       //
        char cion           = '0';                                              //opcion para salir de ciclo while

        System.out.println(blanco);
        System.out.println("Hola");
        System.out.println("Ingresa su nombre mi Lord\n");
        nomUser = sc.nextLine();
        if ( hora >= 6 && hora < 12) {
        saludo = "día";
        }
        else {
            if (hora >= 12 && hora < 19){
                saludo = "tarde";
            }
            else {
                saludo = "noche";
            }
        }
        System.out.println(blanco);
        System.out.println("\nBuenas "+saludo+"s mi "+prefix+" "+nomUser+"\n");
        System.out.println("Si gusta que le siga llamando mi "+prefix+" ignore este mensaje, sino pulse \"Y\" seguido por la tecla [Enter]\n");

        opcion =sc.nextLine();
        opcion=opcion.trim();                                                   //Para borrar blancos
        opcion=opcion.toUpperCase();                                            //Para convertir a mayusculas
        if (ValorEn(opcion)) {                                                  //Para leer si el valor es valido
            System.out.println(blanco);
            System.out.println("\nPor favor dígame cómo desea que le llame si a usted le parece.");
            prefix = sc.nextLine();
            System.out.println("");
        }
        while (caso == false) {
            System.out.println(blanco);
            System.out.println("¿Qué desea hacer mi "+prefix+" "+nomUser+"?");
            System.out.println("\n\t1: Operaciones Matemáticas. \n\t2: Opciones de reloj. \n\t3: Validar si es primo. \n\t4: Mostrar números primos. \n\t5: Juegos. \n\t6: Cambiar nombre y prefijo. \n\t0: Salir.");
            System.out.println("");
            opcion = sc.nextLine();
            System.out.print("");
            opcion=opcion.trim();                                               //Para borrar blancos

            switch (ValorSwitch(opcion)) {
                case '1':///////Operaciones Matemáticas
                    System.out.println(blanco);
                    System.out.println("¿En qué operaciones desea que le ayude mi "+prefix+" "+nomUser+"?");
                    System.out.println("\n\t1: Suma-Resta \n\t2: Multiplicación \n\t3: División \n\t4: Potencia");
                    opcion = sc.nextLine();
                    System.out.println("");
                    opcion=opcion.trim();

                    switch(ValorSwitch(opcion)) {
                        case '1':///////Suma-Resta
                            cadena = "¿Cuantos números desea operar?";
                            nNumeros = IsNumInt(cadena);
                            res=0;
                            nEntrada=0;

                            for (int i = 1; i <= nNumeros; i++){
                                cadena = "Num "+i+": ";
                                nEntrada = IsNumDouble(cadena);
                                res = res + nEntrada;
                            }
                            System.out.println("El RESULTADO es: "+res);
                            Esperar(6);
                            break;
                        case '2':///////Multiplicacion
                            cadena = "¿Cuantos números desea operar?";
                            nNumeros = IsNumInt(cadena);                        //Verifica si es entero y asigna a variable
                            res=1;
                            nEntrada=0;

                            for (int i = 1; i<=nNumeros; i++){
                                cadena = "Num "+ i +": ";
                                nEntrada = IsNumDouble(cadena);                 //Verifica si es doble y asigna a variable
                                res = res * nEntrada;
                            }
                            System.out.println("El RESULTADO es: "+res);
                            Esperar(6);
                            break;
                        case '3':///////Division
                            cadena = "Ingrese el divisor:";
                            n1 = IsNumDouble(cadena);
                            cadena = "Ingrese numero dividendo:";
                            n2= IsNumDouble(cadena);
                            System.out.println("El resultado es: "+n1/n2);
                            Esperar(6);
                            break;
                        case '4'://////Potencia
                            cadena = "Ingrese un valor:";
                            n1 = IsNumDouble(cadena);
                            cadena = "Ingrese la potencia a elevar:";
                            n2 = IsNumDouble(cadena);
                            res = Math.pow(n1,n2);
                            System.out.println("El resultado es: "+res);
                            Esperar(6);
                            break;
                        default: ///////Metodo por default
                            System.out.println("Por favor seleccione una opción válida mi "+prefix+" "+nomUser+".");
                            Esperar(3);
                            break;
                    }
                    break;
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
                case '2':///////Opciones de reloj
                    System.out.println(blanco);
                    System.out.println("¿Qué funciones desea utilizar mi "+prefix+" "+nomUser+"?");
                    System.out.println("\n\t1: Mostrar Hora AM/PM. \n\t2: Mostrar Hora 24hrs. \n\t3: Mostrar día del mes. \n\t4: Mostrar día de la semana. \n\t5: Mostrar Mes. \n\t6: Mostrar Año. \n\t7: Mostrar fecha completa. \n\t8: Contar días transcurridos de dos fechas. \n\t9: Mostrar edad.");
                    opcion = sc.nextLine();
                    System.out.println("");
                    opcion = opcion.trim();

                    switch(ValorSwitch(opcion)) {
                        case '1':///////Mostrar hora AM/PM
                            call = Calendar.getInstance();                      //Toma la hora actual
                            ampm = "aapp";
                            hora = call.get(Calendar.HOUR);
                            minuto = call.get(Calendar.MINUTE);
                            segundo=call.get(Calendar.SECOND);
                            if (call.get(Calendar.AM_PM)==0) ampm="AM";         // validar AM o PM
                            else ampm="PM";
                            if (hora == 0) hora=12;
                            System.out.printf("Son las "+hora+":"+minuto+":"+segundo+" "+ampm);
                            Esperar(3);
                            break;
                        case '2':///////Mostrar hora 24hrs
                            call = Calendar.getInstance();                      //Toma la hora actual
                            hora=call.get(Calendar.HOUR_OF_DAY);
                            minuto=call.get(Calendar.MINUTE);
                            segundo=call.get(Calendar.SECOND);
                            System.out.println("Son las "+hora+":"+minuto+":"+segundo+" hrs.");
                            Esperar(3);
                            break;
                        case '3':///////Mostrar dia del mes
                            call = Calendar.getInstance();                      //Toma la hora actual
                            diaM = call.get(Calendar.DAY_OF_MONTH);
                            System.out.println("Estamos en el día "+diaM);
                            Esperar(3);
                            break;
                       case '4':///////Mostrar dia de la semana
                            call = Calendar.getInstance();                      //Toma la hora actual
                            diaS = call.get(Calendar.DAY_OF_WEEK);
                            System.out.println("Estamos en el día "+diaS+" de la semana = "+sdiaS[diaS]);
                            Esperar(3);
                            break;
                       case '5':///////Mostrar mes
                            call = Calendar.getInstance();                      //Toma la hora actual
                            mes = call.get(Calendar.MONTH);
                            System.out.println("Estamos en el mes "+(mes+1)+" = "+smes[mes]);
                            Esperar(3);
                            break;
                        case '6':///////Mostrar año
                            call = Calendar.getInstance();                      //Toma la hora actual
                            anio = call.get(Calendar.YEAR);
                            System.out.println("Estamos en el año "+anio);
                            Esperar(3);
                            break;
                        case '7':///////Mostrar fecha completa
                            call = Calendar.getInstance();                      //Toma la hora actual
                            hora = call.get(Calendar.HOUR_OF_DAY);              //
                            minuto = call.get(Calendar.MINUTE);                 //
                            segundo = call.get(Calendar.SECOND);                //Variafles de hora y fecha
                            diaM = call.get(Calendar.DAY_OF_MONTH);             //
                            diaS = call.get(Calendar.DAY_OF_WEEK);              //
                            mes = call.get(Calendar.MONTH);                     //
                            anio = call.get(Calendar.YEAR);                     //
                            System.out.println("Son las "+hora+":"+minuto+":"+segundo+" hrs.");
                            System.out.println("Del "+sdiaS[diaS]+" "+diaM+" de "+smes[mes]+" del "+anio);
                            Esperar(6);
                            break;
                        case '8':///////Dias transcurridos de una fecha a otra. diasAnio= call.get(Calendar.DAY_OF_YEAR);
                            call = Calendar.getInstance();
                            int d1,d2,m1,m2,a1,a2,diasAnio2,r;                  //Variables solo del caso
                            diaM = call.get(Calendar.DAY_OF_MONTH);
                            System.out.println("Ingresa desde qué fecha deseas calcular los días:");
                            cadena = "Año: ";

                            do {
                                a1 = IsNumInt(cadena);
                                if (a1 < 1970) System.out.println("Ingrese un año después de 1970");
                            } while (a1 < 1970);

                            call.set(Calendar.YEAR, a1);
                            cadena = "Mes: ";

                            do {
                                m1 = IsNumInt(cadena);
                                if (m1 > 12 || m1 < 1) System.out.println("Ingrese un numero de mes válido.");
                            } while (m1 > 12 || m1 < 1);

                            call.set(Calendar.MONTH, m1-1);
                            cadena = "Día: ";

                            do {
                                d1 = IsNumInt(cadena);
                                if (d1 > call.getActualMaximum(Calendar.DAY_OF_MONTH) || d1 < 1) System.out.println("Ingrese un día válido para este mes, el cual tiene "+call.getActualMaximum(Calendar.DAY_OF_MONTH)+" días.");
                            } while (d1 > call.getActualMaximum(Calendar.DAY_OF_MONTH) || d1 < 1);

                            call.set(Calendar.DAY_OF_MONTH, d1);
                            diasAnio = call.get(Calendar.DAY_OF_YEAR);          //Calcula los Dias de ese año
                            r = call.getActualMaximum(Calendar.DAY_OF_YEAR) - diasAnio;

                            System.out.println("Ingresa hasta qué fecha deseas calcular los días:");
                            cadena = "Año: ";

                            do {
                            a2 = IsNumInt(cadena);
                            if (a2 < a1) System.out.println("Ingrese un año igual o después de "+a1);
                            } while (a2 < a1);

                            call.set(Calendar.YEAR, a2);
                            cadena = "Mes: ";

                            do {
                                m2 = IsNumInt(cadena);
                                if (m2 > 12 || m2 < 1 || m2 < m1 && a2 == a1) System.out.println("Ingrese un numero de mes válido y asegurase de ser una fecha posterior a la introducida antes.");
                            } while (m2 > 12 || m2 < 1 || m2 < m1 && a2 == a1);

                            call.set(Calendar.MONTH, m2-1);
                            cadena = "Día: ";

                            do {
                                d2 = IsNumInt(cadena);
                                if (d2 > call.getActualMaximum(Calendar.DAY_OF_MONTH) || d2 < 1 || d2 <= d1 && m2 == m1 && a2 == a1) System.out.println("Ingrese un día válido para este mes, el cual tiene "+call.getActualMaximum(Calendar.DAY_OF_MONTH)+" días y asegurase de ser una fecha posterior a la introducida antes.");
                            } while (d2 > call.getActualMaximum(Calendar.DAY_OF_MONTH) || d2 < 1 || d2 < d1 && m2 == m1 && a2 == a1);

                            call.set(Calendar.DAY_OF_MONTH, d2);
                            diasAnio2 = call.get(Calendar.DAY_OF_YEAR);         //Calcula los Dias de ese año
                            if (a2 == a1) r = diasAnio2 - diasAnio;             //Si son fechas del mismo año
                            else r = r + diasAnio2;

                            for (int i = a1+1; i < a2; i++) {
                                call.set(Calendar.YEAR, i);
                                r = r + call.getActualMaximum(Calendar.DAY_OF_YEAR); //Se agrega la cantidad de Dias del sig año
                            }
                            System.out.println("Días transcurridos de "+d1+"/"+m1+"/"+a1+" -----> "+d2+"/"+m2+"/"+a2+" ====== "+r);
                            Esperar(7);
                            break;
                        case '9':///////Mostrar mi edad
                            int anios;
                            call = Calendar.getInstance();
                            System.out.println("Ingrese su fecha de nacimiento mi "+prefix+" "+nomUser+".");
                            cadena = "Año: ";

                            do {
                                a1 = IsNumInt(cadena);
                                if (a1 < 1970) System.out.println("Ingrese un año después de 1970");
                            } while (a1 < 1970);

                            call.set(Calendar.YEAR, a1);
                            cadena = "Mes: ";

                            do {
                                m1 = IsNumInt(cadena);
                                if (m1 > 12 || m1 < 1) System.out.println("Ingrese un numero de mes válido.");
                            } while (m1 > 12 || m1 < 1);

                            call.set(Calendar.MONTH, m1-1);
                            cadena = "Día: ";

                            do {
                                d1 = IsNumInt(cadena);
                                if (d1 > call.getActualMaximum(Calendar.DAY_OF_MONTH) || d1 < 1) System.out.println("Ingrese un día válido para este mes, el cual tiene "+call.getActualMaximum(Calendar.DAY_OF_MONTH)+" días.");
                            } while (d1 > call.getActualMaximum(Calendar.DAY_OF_MONTH) || d1 < 1);

                            call = Calendar.getInstance();                      //Actualiza la variable call a la hora y fecha actual
                            anios = call.get(Calendar.YEAR) - a1;
                            if (call.get(Calendar.MONTH) >= m1){
                                if (call.get(Calendar.DAY_OF_MONTH) >= d1) {}
                                else anios = anios - 1;
                            }
                            else anios = anios-1;
                            System.out.println("\n\n\n\tUsted tiene "+anios+" días de su nombre, mi "+prefix+" "+nomUser+".");
                            Esperar(4);
                            break;
                        default:////////Metodo por default
                            System.out.println("Por favor seleccione una opción válida mi "+prefix+" "+nomUser+".");
                            Esperar(3);
                            break;
                    }
                    break;
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
                case '3':///////Validacion de un numero primo
                    System.out.println(blanco);
                    int contador = 0;
                    cadena = "Dame el numero que deseas evaluar";
                    nNumeros = IsNumInt(cadena);

                    for(int i=1; i <= nNumeros; i++)	if((nNumeros % i) == 0) contador++;
                    if (contador == 2) System.out.println("Efectivamente el número que ingresó ES PRIMO mi "+prefix+" "+nomUser+".");
                    else System.out.println("Lamento informarle que este número NO es PRIMO mi "+prefix+" "+nomUser+".");
                    Esperar(6);
                    break;
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
                case '4':///////Mostrar números primos
                    break;
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
                case '5':///////Juegos
                    double randomNum = 0 + ( 1000 - 0 ) * ale.nextDouble();
                    System.out.println(blanco);
                    System.out.println("Elija un pasatiempo mi "+prefix+" "+nomUser+".");
                    System.out.println("\n\t1: Gato. (coming soon) \n\t2: Operaciones matemáticas.");
                    opcion = sc.nextLine();
                    System.out.println("");
                    opcion = opcion.trim();                                     //Limpia la cadena

                    switch(ValorSwitch(opcion)) {
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                        case '1'://///// Gato.
                            System.out.println("NO DISPONIBLE POR EL MOMENTO");
                            String cuadro[][] = {{"………|","|………|","|………"},{"………|","|………|","|………"},{"====","=====","===="},{"………|","|………|","|………"},{"………|","|………|","|………"},{"====","=====","===="},{"………|","|………|","|………"},{"………|","|………|","|………"}};
                            boolean disponible [][] = {{true,true,true},{true,true,true},{true,true,true}};
                            int pos = 0;
                            //Seleccionará dificultad
                                                            //Facil //El turno del pc será con un random
                                                            //Moderado //El turno será buscando ganar
                                                            //Dificil //Evitar que gane el usuario
                                                            //Imposible //Evitar y ganar a toda costa
                            //Un ramdom para decidir quien inicia
                            while (cion != 'Y') {


                                //Imprimir todo el cuadro
                                System.out.println(blanco);
                                getCuadro(cuadro,disponible);// Imprime y actualiza el cuadro
                                                   // Imprimir cuadro con numeros para seleccionar dando tabulador al cuadro
                                //seleccione la cacilla deceada
                                cadena = "Elija una posición";
                                pos = ChekTrue(disponible,cadena);
                                while ((pos < 0 )) {
                                    System.out.println("Esta casilla ya no está disponible.");
                                    pos = ChekTrue(disponible,cadena);
                                } //Retorna el valor de la posicion elejida en negativo si no esta diponible y positivo si sí

                                //int pos = IsNumInt(cadena);//
                                cuadro = setCuadro(cuadro, pos);
                                System.out.println(blanco);
                                getCuadro(cuadro,disponible);
                                //Validar si está disponible y si es un número
                                //imprimir resultado

                                //Hacer un metodo de condiciones para cuando uno gane o pierda
                                //Validar si hay ganador
                            if (disponible[2][2]=false) cion = 'Y';


                                Esperar(2);
                            }
                            break;
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                        case '2'://///// Operaciones matemáticas.
                            int gan = 0, per = 0, intAleatorio;
                            double dato1 = 0, dato2 = 0, res1 = 0, res2 = 0;

                            System.out.println(blanco);
                            System.out.println("Se mostrarán operaciones al azar y usted, mi "+prefix+" "+nomUser+", deberá ingresar la respuesta correcta a dicho problema.\n\tPARA FINALIZAR EL JUEGO INGRESE LA LETRA \"Y\".");
                            Esperar(4);
                            while (cion != 'Y') {
                             ale = new Random(System.currentTimeMillis());
                                System.out.println(blanco);
                                System.out.println("\n\tPARA FINALIZAR EL JUEGO, INGRESE LA LETRA \"Y\".");
                                System.out.println("\tResueltos: "+gan+" ======= Fallados: "+per);
                                intAleatorio = ale.nextInt(5);
                                switch (intAleatorio) {
                                    case 1:///////Suma-Resta
                                        ale = new Random(System.currentTimeMillis());
                                        intAleatorio = ale.nextInt(3); //numero de ramdoms de 0 a (numero-1)
                                        while (intAleatorio < 1 || intAleatorio == 0) intAleatorio = ale.nextInt(4);
                                        for (int i = 1; i <= intAleatorio; i ++) {  //Numero maximo de numero a trabajar
                                            randomNum = (0 + ( 20 - 0) * ale.nextDouble()); //genera numero aleatorio double DONDE: valorMinimo + ( calorMaximo - ValorMinimo) * aleatorio.nextDouble()
                                            dato1 = (Signo(ale) * randomNum);
                                            dato1 = Math.round(dato1 * Math.pow(10, 1)) / Math.pow(10, 1);
                                            randomNum = 0 + ( 20 - 0) * ale.nextDouble(); //genera numero aleatorio double DONDE: valorMinimo + ( calorMaximo - ValorMinimo) * aleatorio.nextDouble()
                                            dato2 = (Signo(ale) * randomNum);
                                            dato2 = Math.round(dato2 * Math.pow(10, 1)) / Math.pow(10, 1);
                                            res1 = res1 + dato1 + dato2;
                                            if (i < intAleatorio) System.out.print("("+dato1+")+("+dato2+")+");
                                            else System.out.print("("+dato1+")+("+dato2+")");
                                            dato1 = 0;
                                            dato2 = 0;
                                        }
                                        cadena = "\nResultado?: ";
                                        System.out.println("");
                                        res2 = IsNumDoubleyExit(cadena);
                                        if (res2 == 0.00000123){                //Condicion para salir
                                            cion = 'Y';
                                        }
                                        else {
                                            res1 = Math.round(res1 * Math.pow(10, 1)) / Math.pow(10, 1);
                                            res2 = Math.round(res2 * Math.pow(10, 1)) / Math.pow(10, 1);
                                            if (res2 == res1){
                                                System.out.println("BIEN");
                                                gan = gan + 1;
                                                Esperar(2);
                                                } else {
                                                    System.out.println("MAL     Resultado correcto es :" +res1);
                                                    per = per + 1;
                                                    Esperar(2);
                                                }
                                        }
                                        dato1 = 0;
                                        dato2 = 0;
                                        res1 = 0;
                                        break;
                                    case 2:///////Multiplicacion
                                        ale = new Random(System.currentTimeMillis());
                                        while (dato1 == 0) dato1 = Signo(ale) * ale.nextInt(13);
                                        while (dato2 == 0) dato2 = Signo(ale) * ale.nextInt(13);
                                        res1 = (int)dato1 * (int)dato2;
                                        System.out.print("("+(int)dato1+"*"+(int)dato2+")");
                                        cadena = "\nResultado?: ";
                                        System.out.println("");
                                        res2 = IsNumDoubleyExit(cadena);
                                        if (res2 == 0.00000123){                //Condicion para salir
                                            cion = 'Y';
                                        }
                                        else {
                                            if ((int)res2 == (int)res1){
                                                System.out.println("BIEN");
                                                gan = gan + 1;
                                                Esperar(2);
                                                } else {
                                                    System.out.println("MAL     Resultado correcto es :" +(int)res1);
                                                    per = per + 1;
                                                    Esperar(2);
                                                }
                                        }
                                        dato1 = 0;
                                        dato2 = 0;
                                        res1 = 0;
                                        break;
                                    case 3:///////Division
                                        ale = new Random(System.currentTimeMillis());
                                        while (dato1 == 0) dato1 = Signo(ale) * ale.nextInt(100);
                                        while (dato2 == 0) dato2 = Signo(ale) * ale.nextInt(10);
                                        res1 = (int)dato1 / (int)dato2;
                                        System.out.print("("+(int)dato1+"/"+(int)dato2+")");
                                        cadena = "\nResultado? (solo en enteros): ";
                                        System.out.println("");
                                        res2 = IsNumDoubleyExit(cadena);
                                        if (res2 == 0.00000123){                //Condicion para salir
                                            cion = 'Y';
                                        }
                                        else {
                                            res1 = Math.round(res1 * Math.pow(10, 1)) / Math.pow(10, 1);
                                            res2 = Math.round(res2 * Math.pow(10, 1)) / Math.pow(10, 1);
                                            if ((int)res2 == (int)res1){
                                                System.out.println("BIEN");
                                                gan = gan + 1;
                                                Esperar(2);
                                                } else {
                                                    System.out.println("MAL     Resultado correcto es :" +(int)res1);
                                                    per = per + 1;
                                                    Esperar(2);
                                                }
                                        }
                                        dato1 = 0;
                                        dato2 = 0;
                                        res1 = 0;
                                        break;
                                    case 4:///////Potencia
                                        ale = new Random(System.currentTimeMillis());
                                        dato1 = Signo(ale) * ale.nextInt(3);
                                        while (dato1 == 0) dato1 = Signo(ale) * ale.nextInt(3);
                                        dato2 = ale.nextInt(13);
                                        res1 = Math.pow((int)dato1,(int)dato2);
                                        System.out.print("("+(int)dato1+"^"+(int)dato2+")");
                                        cadena = "\nResultado?: ";
                                        System.out.println("");
                                        res2 = IsNumDoubleyExit(cadena);
                                        if (res2 == 0.00000123){                //Condicion para salir
                                            cion = 'Y';
                                        }
                                        else {
                                            if ((int)res2 == (int)res1){
                                                System.out.println("BIEN");
                                                gan = gan + 1;
                                                Esperar(2);
                                                } else {
                                                    System.out.println("MAL     Resultado correcto es :" +(int)res1);
                                                    per = per + 1;
                                                    Esperar(2);
                                                }
                                        }
                                        dato1 = 0;
                                        dato2 = 0;
                                        res1 = 0;
                                        break;
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                                    default :///////Juntos
                                        String operS[] = {"","","","","","",""};
                                        String operacion = "";
                                        int operInt[] = {0,0,0,0,0,0,0};

                                        res1 = 0;
                                        dato1 = 0;
                                        dato2 = 0;
                                        intAleatorio = 0;
                                        int otrointAleatorio = 0;
                                        otrointAleatorio = RealRam(ale.nextInt(11),5,ale);//Operaiones a trabajar
                                        while (otrointAleatorio < 2) otrointAleatorio = RealRam(otrointAleatorio,5,ale); //Numero maximo de operaciones a trabajar
                                        for (int i = 1; i <= otrointAleatorio; i ++) {
                                            res1 = 0;
                                            dato1 = 0;
                                            dato2 = 0;
                                            intAleatorio = RealRam(ale.nextInt(11),4,ale);//Selección de operaciones
                                            switch (intAleatorio) {
                                                case 1:///////Suma-Resta-Juntos
                                                    intAleatorio = RealRam(intAleatorio,3,ale);
                                                    while (intAleatorio < 1 ) intAleatorio = RealRam(ale.nextInt(11),3,ale);
                                                    for (int j = 1; j <= intAleatorio; j ++ ) {  //Numero maximo de numero a trabajar
                                                        while (dato1 == 0) dato1 = (Signo(ale) * RealRam(ale.nextInt(j+i),11,ale) );
                                                        while (dato2 == 0) dato2 = (Signo(ale) * RealRam(ale.nextInt(j+i+1),11,ale) );
                                                        res1 = (int)res1 + (int)dato1 + (int)dato2;
                                                        if (j != 1 && j < intAleatorio) {
                                                            operS[i-1] = (operS[i-1] + "+(" + ((int)dato1 + ")+(" + (int)dato2) + ")");
                                                        }
                                                        else{
                                                            if (j == 1) operS[i-1] = ("(" + ((int)dato1 + ")+(" + (int)dato2) + ")");
                                                        }
                                                        if (j == intAleatorio && j !=1) operS[i-1] = (operS[i-1] + "+(" + (int)dato1 + ")+(" + (int)dato2) +")";
                                                        dato1 = 0;
                                                        dato2 = 0;
                                                    }
                                                    operInt[i-1] = (int)res1;
                                                    res1 = 0;
                                                    dato1 = 0;
                                                    dato2 = 0;
                                                    intAleatorio = 0;
                                                    ale = new Random(System.currentTimeMillis());
                                                    break;
                                                case 2:///////Multiplicacion-Juntos
                                                    while (dato1 == 0) dato1 = Signo(ale) * RealRam(i,11,ale);
                                                    while (dato2 == 0) dato2 = Signo(ale) * RealRam(i+1,11,ale);
                                                    res1 = (int)dato1 * (int)dato2;
                                                    operS [i-1] = ((int)dato1+"*"+(int)dato2);
                                                    operInt [i-1] = (int)res1;
                                                    dato1 = 0;
                                                    dato2 = 0;
                                                    res1 = 0;
                                                    intAleatorio = 0;
                                                    break;
                                                case 3:///////Division-Juntos ////Solo se evaluará el entero de la division
                                                    while (dato1 == 0) dato1 = Signo(ale) * RealRam(i,11,ale);
                                                    while (dato2 == 0) dato2 = Signo(ale) * RealRam(i+1,6,ale);
                                                    res1 = (int)dato1 / (int)dato2;
                                                    operS[i-1] = ((int)dato1 + "/" + (int)dato2);
                                                    operInt [i-1] = (int)res1;
                                                    dato1 = 0;
                                                    dato2 = 0;
                                                    res1 = 0;
                                                    intAleatorio = 0;
                                                    ale = new Random(System.currentTimeMillis());
                                                    break;
                                                default:///////Potencia-Juntos
                                                    while (dato1 == 0) dato1 = Signo(ale) * RealRam(i,3,ale);
                                                    while (dato2 == 0) dato2 = RealRam(i+1,6,ale);
                                                    res1 = Math.pow((int)dato1,(int)dato2);
                                                    operS [i-1] = ((int)dato1+"^"+(int)dato2);
                                                    operInt [i-1] = (int)res1;
                                                    dato1 = 0;
                                                    dato2 = 0;
                                                    res1 = 0;
                                                    intAleatorio = 0;
                                                    ale = new Random(System.currentTimeMillis());
                                                    break;
                                            }
                                            if (i <= otrointAleatorio && i > 1) {
                                                ale = new Random(System.currentTimeMillis());
                                                intAleatorio = RealRam(ale.nextInt(11),4,ale);//Para seleccionar "/", "*", "-" o "+"
                                                switch (intAleatorio){
                                                    case 1:///  Divicion
                                                        nOperadores++;
                                                        operadores[nOperadores] = '/';
                                                        if (i == 2) {
                                                            System.out.print("(" + operS[i-2] + ")/(" + operS[i-1] + ")");
                                                            operacion = operInt[i-2] + "/" + operInt[i-1];
                                                        }
                                                        else {
                                                            System.out.print("/(" + operS[i-1] + ")");
                                                            operacion = operacion + "/" + operInt[i-1];
                                                        }
                                                        break;
                                                    case 2:///  Multiplicacion
                                                        nOperadores++;
                                                        operadores[nOperadores] = '*';
                                                        if (i == 2) {
                                                            System.out.print("(" + operS[i-2] + ")*(" + operS[i-1] + ")");
                                                            operacion = operInt[i-2] + "*" + operInt[i-1];
                                                        }
                                                        else {
                                                            System.out.print("*("+operS[i-1] + ")");
                                                            operacion = operacion + "*" + operInt[i-1];
                                                        }
                                                        break;
                                                    case 3:///  Resta
                                                        nOperadores++;
                                                        operadores[nOperadores] = '-';
                                                        if (i == 2) {
                                                            System.out.print("(" + operS[i-2] + ")-(" + operS[i-1] + ")");
                                                            operacion = operInt[i-2] + "-" + operInt[i-1];
                                                        }
                                                        else {
                                                            System.out.print("-("+operS[i-1] + ")");
                                                            operacion = operacion + "-" + operInt[i-1];
                                                        }
                                                        break;
                                                    default:/// Suma
                                                        nOperadores++;
                                                        operadores[nOperadores] = '+';
                                                        if (i == 2) {
                                                            System.out.print("(" + operS[i-2] + ")+(" + operS[i-1] + ")");
                                                            operacion = operInt[i-2] + "+" + operInt[i-1];
                                                        }
                                                        else {
                                                            System.out.print("+("+operS[i-1] + ")");
                                                            operacion = operacion + "+" + operInt[i-1];
                                                        }
                                                        break;
                                                }
                                            }
                                        }

                                        res = Eval(operInt,operadores,nOperadores);                  //Hacer un metodo que fragmente la cadena hasta encontrar un operador
                                        ///////////////////////////////////////

                                        cadena = "\n\t(Solo se evalua el entero de las diviciones)\nResultado?: ";
                                        System.out.println("");
                                        res2 = IsNumDoubleyExit(cadena);
                                        if (res2 == 0.00000123){                //Condicion para salir
                                            cion = 'Y';
                                        }
                                        else {
                                            if ((int)res2 == (int)res){
                                                System.out.println("BIEN");
                                                Esperar(2);
                                                gan = gan + 1;
                                                } else {
                                                    System.out.println("MAL     Resultado correcto es :" +(int)res);
                                                    per = per + 1;
                                                    Esperar(2);
                                                }
                                        }
                                        ////////////////////////////////////////////////////// para limpiar los arreglos
                                        for (int k = 0; k < otrointAleatorio; k++){
                                            operadores[k] = '^';
                                        }

                                        for (int k = 0; k <=otrointAleatorio; k++){
                                            operS[k] = " ";
                                        }

                                        for (int k = 0; k < otrointAleatorio; k++){
                                            operInt[k] = 0;
                                        }
                                        /////////////////////////////////////////////////
                                        dato1 = 0;
                                        dato2 = 0;
                                        res = 0;
                                        res1 = 0;
                                        nOperadores = 0;
                                        operacion = "";
                                        break;
                                }
                            }
                            break;                                           //Break del caso 2

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                        default:////////Metodo por default
                            System.out.println("Por favor seleccione una opción válida mi "+prefix+" "+nomUser+".");
                            Esperar(3);
                            break;
                    }
                    break;
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
                case '6':///////Cambiar nombre y prefijo
                    System.out.println(blanco);
                    System.out.println("Lamento haberle llamado así, por favor dígame qué debo cambiar.\n\t1: Nombre.\n\t2: Prefijo.");
                    opcion = sc.nextLine();
                    System.out.println("");
                    opcion=opcion.trim();
                    switch (ValorSwitch(opcion)) {
                        case '1':///////Cambiar nombre
                            System.out.println("¿Cómo desea que le llame, mi "+prefix+"?");
                            nomUser = sc.nextLine();
                            System.out.println("");
                            System.out.println("De acuerdo mi "+prefix+" "+nomUser+".");
                            Esperar(3);
                            break;
                        case '2':///////Cambiar Prefijo
                            System.out.println("¿Cual es el prefijo correcto para usted, "+nomUser+"?");
                            prefix = sc.nextLine();
                            System.out.println("");
                            System.out.println("De acuerdo mi "+prefix+" "+nomUser+".");
                            Esperar(3);
                            break;
                        default:
                            System.out.println("Por favor seleccione una opción válida mi "+prefix+" "+nomUser+".");
                            Esperar(3);
                            break;
                    }
                    break;
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
                case '0':///////Salir
                    caso=true;
                    break;
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
                default: ///////Metodo por default
                    System.out.println("Por favor seleccione una opción válida mi "+prefix+" "+nomUser+".");
                    Esperar(3);
                    break;
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
            }
        }
        System.out.println(blanco);
        System.out.println("Es todo por hoy mi "+prefix+" "+nomUser+".\nQue tenga una excelente "+saludo+" y que los dioses estén en su compañía.\n");
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>}
    private static double IsNumDouble(String cadena){
        Scanner scc = new Scanner(System.in);                                   //Metodo propio de Scannes
        String in = "";
        double num=0;
        try {
            System.out.println(cadena);
            in = scc.nextLine();
            System.out.print("");
            num = Double.parseDouble(in);                                       //transforma cadena a Double
            return num;
        } catch (NumberFormatException nfe){
            System.out.println("Ingrese un valor válido.");
            return IsNumDouble(cadena);
        }
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	private static double isNumDoubleyExit(String cadena){
    private static double IsNumDoubleyExit(String cadena){
        Scanner scc = new Scanner(System.in);                               //Metodo propio de Scannes
        String in = "";
        double num = 0;
        try {
            System.out.println(cadena);
            in = scc.nextLine();
            System.out.print("");
            num = Double.parseDouble(in);                                       //transforma cadena a Double
            return num;
            } catch (NumberFormatException nfe){                                //Cacha si es un numero
                in = in.trim();                                                 //Para borrar blancos
                in = in.toUpperCase();                                          //Para convertir a mayusculas
                if (ValorEn(in)) {
                    return 0.00000123;
                }
                System.out.println("Ingrese un valor válido.");
                return IsNumDoubleyExit(cadena);
            }
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private static int IsNumInt(String cadena){
        Scanner scc = new Scanner(System.in);                                   //Metodo propio de Scannes
        String in = "";
        int num=0;
        try {
            System.out.println(cadena);
            in = scc.nextLine();
            System.out.print("");
            num = Integer.parseInt(in);                                         //transforma cadena a entero
            return num;
        } catch (NumberFormatException nfe){                                    //Cacha si es un numero
            System.out.println("Ingrese un valor válido.");
            return IsNumInt(cadena);
        }
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private static boolean ValorEn(String cadena){
        try {
            if(cadena.charAt(0) == 'Y') //Para leer si solo el primer carácter posición (0)
                return true;
            else return false;
        } catch (StringIndexOutOfBoundsException nfe){ //Cacha la excepción de un scanner vacío
            return false;
        }
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private static char ValorSwitch(String cadena){
        try {
            return cadena.charAt(0);
        } catch (StringIndexOutOfBoundsException nfe){ //Cacha la excepción de un scanner vacío
            return 'P';
        }
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private static void Esperar(int segundos){
        try{
            Thread.sleep(segundos*1000); 		///hacer una pausa de tantos milisegundos
        }
        catch(InterruptedException e ) {
        }
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private static int Signo(Random aleatorio){             //Genera que sea negativo o positivo
        if (aleatorio.nextBoolean() == true) {                             //cant = posibilidad de tener numero negativo, entre mas alto, menos posible que sea igual a 2
            return 1;
        }else {
            return -1;
        }
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private static int Eval(int operInt[],char operadores[],int nOperadores){                         //Evalua una cadena de operaciones "*", "/", "+" y "-"
        int res = 0;
        char caracter [] = {'^',
            '*',
            '/',
            '+',
            '-'};

        for (int i=1; i <= 4; i++){                         // Ciclo de cambio de caracter del operador, 4 porque son los operadores que se buscan
            for (int j=1; j <= nOperadores; j++){           // Busca y maneja el numero de operadores que tenemos en el problema
                if (operadores[j] == caracter [i]){
                    operInt[j-1] = Resolver(operInt [j-1], operInt[j],i);
                    for (int k = j; k <= nOperadores+1; k++){                     // recorre todos los numeros a un dato atras
                        operInt[k] = operInt[k+1];
                        operadores[k] = operadores [k+1];
                    }
                    nOperadores--;
                    j--;
                }
            }
        }

        res = operInt[0];

        return res;
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private static int Resolver(int n1, int n2, int oper){                         //Evalua una cadena de operaciones "*", "/", "+" y "-"
        int res = 0;
        if (oper == 1) res = n1*n2;
        if (oper == 2) res = n1/n2;
        if (oper == 3) res = n1+n2;
        if (oper == 4) res = n1-n2;

        return res;
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private static int RealRam(int cant, int hasta, Random ale){                         //Evalua una cadena de operaciones "*", "/", "+" y "-"
        int resul = 0;
        for (int i = 0; i<=cant; i++){
         resul = ale.nextInt(hasta);
        }
        return resul;
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>}
    private static void getCuadro(String[][] cuadro, boolean[][] disponible){                         //imprime el cuadro del gato
        int t=0;
        for (int i = 0; i <= 7; i++){
            for (int j = 0; j<= 2; j++){
                System.out.print(cuadro[i][j]);// imprimir el cuadro de opciones

                if (j == 2) {
                    if (i == 1){
                        System.out.print("\t\t\t\t");
                        getNumeros(0,disponible);
                    }
                    if (i == 2) System.out.print("\t\t\t\t———————");
                    if (i == 3){
                        System.out.print("\t\t\t\t");
                        getNumeros(1,disponible);
                    }
                    if (i == 4) System.out.print("\t\t\t\t———————");
                    if (i == 5){
                        System.out.print("\t\t\t\t");
                        getNumeros(2,disponible);
                    }
                }

            }
            System.out.println("");
        }
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>}
    private static String[][] setCuadro(String[][] cuadro, int posicion){
        String marcaU[][] = {{"\\./|","|\\./|","|\\./"}/*Renglon1F1*/,{"/.\\|","|/.\\|","|/.\\"}/*Renglon2F1*/},
        marcaPC[][] = {{"[*]|","|[*]|","|[*]"}/*Renglon1F1*/,{"[*]|","|[*]|","|[*]"}/*Renglon2F1*/};
        int gatoInt[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int x = 0, y = 0;                                                       //Coordenadas para actualizar cuadro
        if (posicion <1 || posicion > 9) System.out.println("Introdusca una posición válida y disponible.");
        else {
            for (int i = 0; i <=2; i++){
                for (int j = 0; j<=2; j++){
                    if (posicion == gatoInt[i][j]){
                        x = j;
                        if (i == 0) y = 0;
                        if (i == 1) y = 3;
                        if (i == 2) y = 6;
                        cuadro[y][x] = marcaU[0][x];
                        cuadro[y+1][x] = marcaU[1][x];
                    }
                }
            }
        }
        return cuadro;
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>}
    private static void getNumeros(int y, boolean[][] disponible){
        int gatoInt[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i<=2; i++){
            if (i == 0) {
                if (disponible[y][i] == true) System.out.print(gatoInt[y][i]);
                else System.out.print("0");
            }
            if (i == 1) {
                System.out.print("| ");
                if (disponible[y][i] == true) System.out.print(gatoInt[y][i]);
                else System.out.print("0");
                System.out.print(" |");
            }
            if (i == 2) {
                if (disponible[y][i] == true) System.out.print(gatoInt[y][i]);
                else System.out.print("0");
            }
        }


    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>}
    private static int ChekTrue(boolean[][] disponible,String cadena){
        int gatoInt[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner scc = new Scanner(System.in);                                   //Metodo propio de Scannes
        String in = "";
        int num=0;
        try {
            System.out.println(cadena);
            in = scc.nextLine();
            System.out.print("");
            num = Integer.parseInt(in);                                         //transforma cadena a entero
            if (num > 9) return IsNumInt(cadena);///////////////////////Falta evaluar si la posicion esta disponible
            else return num;
        } catch (NumberFormatException nfe){                                    //Cacha si es un numero
            System.out.println("Ingrese un valor válido.");
            return IsNumInt(cadena);
        }
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>}
}
//length ->Indica cuantos caracteres posee una cadena
//substring ->Permite obtener una parte especifica de caracteres substring(desde,hasta)
                    //n="Carlos".substring(0,1); n=C  ... substring(0,2); n=Ca
//posicion=cad.indexOf(char,int)-> Busca un caracter "char" en una cadena "cad" desde la posicion "int" de la cadena dando un valor entero "int"
////////////////Juegos: 1) El gato (modo fácil, moderado e imposible) 2) Operaciones matemáticas (usando ramdoms) 3)
