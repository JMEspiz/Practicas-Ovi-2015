import java.util.Scanner;
import java.util.InputMismatchException;
public class main{

  public static void main(String[] args){
   EjercicioArchivo a = new EjercicioArchivo();
   Scanner escribir = new Scanner(System.in);
   Pilas pilas = new Pilas();
   Cola cola = new Cola();
   Lista lista = new Lista();

  
   System.out.println("\n-------------------------------------------------------------------------------------------");
   System.out.println("======   =======         ====       ======== ========   O   ======       ====      ======= ");
   System.out.println("=    =   ==    ==       ==  ==      =           ==      ==  =           ==  ==     =       ");
   System.out.println("==== =   ==    ==      ==    ==     =           ==      ==  =          ==    ==    ======= ");
   System.out.println("=        ==========   ==========    =           ==      ==  =         ==========         = ");
   System.out.println("=        ==      ==  ==        ==   =           ==      ==  =        ==        ==        = ");
   System.out.println("=        ==      == ==          ==  ========    ==      ==  ======= ==          == ======= ");
   System.out.println("-------------------------------------------------------------------------------------------\n");

   System.out.println("   [] Menu de Opcione []");
   System.out.println("1-Para Leer Archivo");
   System.out.println("2-Para Escribir y Leer El Archivo");
   System.out.println("3-Ejecutar Pila Con Valores Alfa Numericos");
   System.out.println("4-Ejecutar Pila Con Elementos Numercos");
   System.out.println("5-Ejecutar Pila con Cantidad \'X\' de Elementos");
   System.out.println("6-Ejecutar Cola Con Valores Predeterminadosde 1 al 10");
   System.out.println("7-Ejecutar lista Con Valores Predeterminadosde");
   System.out.println("8-Para Salir");
    
    int opciones =0;
   /* System.out.println("Elija Una Opcion");
    opciones = escribir.nextInt();
    System.out.println("----------------");
     
   */
  
     /*Ciclo repetitivo,el cual me permite repetir hasta que le numero de la opcion no sean igula a 1 2 3*/
     do{
           /*con este if comparo el valor de opciones, que he captado por teclado con la clase Scanner
                y si no es igual a del menu imprime el numero de captado y arroja un mensaje 
               , esto se va a repetrir hasta que sea igual al del menu */
         try{
              System.out.println("Elija Una Opcion");
              opciones = escribir.nextInt();
              System.out.println("----------------");

                 if(opciones <=0 || opciones >8){
                   System.out.println("El Numero "+opciones+" no esta en las opciones");
                   System.out.println("Elija Una Opcion");
                   System.out.println("----------------");
                   opciones = escribir.nextInt();
                 }
             }catch(InputMismatchException e){
                 System.out.println("Solo Puede Ingresr Numeros");
                 escribir.next();
          }
          switch (opciones){
             case 1:{
             a.LeerArchivo("/home/yormi/Practicas-Ovi-2015/Practicas/Archivo.txt");
             a.contarPalabras("/home/yormi/Practicas-Ovi-2015/Practicas/Archivo.txt");
             break;
            }
              case 2: {
             a.escribirTexto("nuevoArchivo.txt");
             a.LeerArchivo("/home/yormi/Practicas-Ovi-2015/Practicas/nuevoArchivo.txt");
             a.contarPalabras("/home/yormi/Practicas-Ovi-2015/Practicas/nuevoArchivo.txt");
             break;
            }
             case 3:{
               pilas.pilaAlfaNumerica();
               break;
             }
             case 4:{
               pilas.pilaNumeros();
               break;
             }
             case 5: {
              pilas.llenarPila();

             }
             case 6:{
             cola.colaPredeterminada();
             break;
             }
             case 7:{
             lista.llenarLista();
             break;
             }
             case 8:{
             System.exit(0);
             break;
             }  
    
       }//fin del Switch
     }while(opciones < 1 || opciones > 8);
   
 }//fin del mentodo min
}//Fin del Main
