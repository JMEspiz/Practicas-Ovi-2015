import java.util.Scanner;
public class main{

  public static void main(String[] args){
   EjercicioArchivo a = new EjercicioArchivo();
   Scanner escribir = new Scanner(System.in);
   Pilas pilas = new Pilas();

  
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
   System.out.println("5-Para Salir");
    
    int opciones =0;
    System.out.println("Elija Una Opcion");
    opciones = escribir.nextInt();
     /*Ciclo repetitivo,el cual me permite repetir hasta que le numero de la opcion no sean igula a 1 2 3*/
     do{
           /*con este if comparo el valor de opciones, que he captado por teclado con la clase Scanner
                y si no es igual a del menu imprime el numero de captado y arroja un mensaje 
               , esto se va a repetrir hasta que sea igual al del menu */
          if(opciones <=0 || opciones >5){
             System.out.println("El Numero "+opciones+" no esta en las opciones");
             System.out.println("Elija Una Opcion");
             opciones = escribir.nextInt();
           }
          
          switch (opciones){
             case 1:{
             a.LeerArchivo("/home/yormi/Practicas-Ovi-2015/LeerArchivo/Archivo.txt");
             a.contarPalabras("/home/yormi/Practicas-Ovi-2015/LeerArchivo/Archivo.txt");
             break;
            }
              case 2: {
             a.escribirTexto("nuevoArchivo.txt");
             a.LeerArchivo("/home/yormi/Practicas-Ovi-2015/LeerArchivo/nuevoArchivo.txt");
             a.contarPalabras("/home/yormi/Practicas-Ovi-2015/LeerArchivo/nuevoArchivo.txt");
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
             case 5:{
             System.exit(0);
             break;
         }
       }//fin del Switch
     }while(opciones < 1 || opciones > 5);
   
 }//fin del mentodo min
}//Fin del Main
