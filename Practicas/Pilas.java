import java.util.Stack;
import java.util.*;
import java.util.Scanner;
     public class Pilas {
      /**
       * push -> Introducimo un dato en la pila
       * pop  -> Es utilizado para quitar el ultimo dato introducido en pila  
       * peek -> permite ver el ultimo dato de la pila
       * empty -> nos permite validar si hay datos en la pila 
       */ 
      public static void pilaAlfaNumerica(){
         Stack pila = new Stack();
         pila.push(50);
         pila.push("Numero");
         pila.push("Letras");
         pila.push("Nombres");
         pila.push(20);
         pila.push(100);
         /*con pila.peek imprimimos el ultimo elemento introducido en  la pila*/
          System.out.println("El Ultimo Elemento introducido de la Pila es: " + pila.peek());

           /*esta rutina imprime los elementos introducido en la  pila
            y como se daran cuneta el primero elemento introducimo pasa 
              al ultimo lugar de la pila */
            while (pila.empty()==false){
             System.out.println(pila.pop());
            }//fin del While
      }//fin de l metodo pilas
      
      public static void pilaNumeros(){
          Stack pila = new Stack();
          int i;
            for(i=1;i<=10;i++){
              pila.push(i);            }
      
            System.out.println("El Ultimo Elemento introducido de la Pila es: " + pila.peek());
               
               while (pila.empty()==false){
                System.out.println(pila.pop());
       
            }//fin del While
        }//Fin del Metodo introducirNumeros
      
       public static void valoresIntroducidos(){
          Stack pila = new Stack();
          Scanner lecturaT = new Scanner(System.in);
        int va=0;
            System.out.println("Primer Valor");
            va=lecturaT.nextInt();
        
            System.out.println("Segundo Valor");
            va=lecturaT.nextInt();
      
        pila.push(va);
         System.out.println("El Ultimo Elemento introducido de la Pila es: " + pila.peek());
            
               while (pila.empty()==false){
                System.out.println(pila.pop());
         }//fin del While

      }//fin  del metodo valoresIntroducidos

      //METODO PARA CREAR, LLENAR Y VACIAR PILAS DE 'X' CANTIDAD DEFINIDA POR EL USUARIO
      public static void llenarPila(){
        
        //Variables Necesarias
        Stack pila = new Stack();
        Scanner entrada = new Scanner(System.in);
        int cant;
        int cont = 0;


        System.out.println("Cuantos Valores desea colocar dentro de la pila? \n");
        cant = entrada.nextInt();

        while(cont < cant){
          System.out.println("Ingrese un valor de tipo entero (Valor ingresado #" + (cont+1) + ")");
          pila.push(entrada.nextInt());
          cont++;
        }

        System.out.println("Su pila ha sido llenado correctamente, a continuación \nse mostrará (Vaciará) su contenido");

        while(pila.empty() == false) {
          
          System.out.println(cant + "- " + pila.pop());
          cant--;
        }

      } //fin metodo llenarPila;
    
}//fin de la clase while
