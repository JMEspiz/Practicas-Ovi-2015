import java.util.InputMismatchException; 

import java.util.Scanner; 

public class Validar_Letras_Numero {
    
 public static void validarNumero(){
       
       Scanner captura = new Scanner(System.in); 
       int dato= 0;  
      do{  
         try{
             System.out.println("Ingrese un Numero");
              dato=captura.nextInt();
               System.out.println("Numero Ingresado es:"+dato);

            }catch(InputMismatchException e){

              System.out.println("\nSólo se pueden ingresar números."); 
              captura.next();
              }
      }while(dato< 1 || dato >8); 
}//fin de la funcion validarNumero <- 

   public static void main(String[] args){
    Validar_Letras_Numero vLN = new Validar_Letras_Numero();
    vLN.validarNumero();
   }//Fin del main
}//Fin de la clase 
