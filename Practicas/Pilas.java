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
    
}//fin de la clase while
