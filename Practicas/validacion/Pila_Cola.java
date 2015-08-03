/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author yormi
 */
public class Pila_Cola {
    Stack pila = new Stack();
    LinkedList cola = new LinkedList();
    Scanner entrada = new Scanner(System.in);
    String valores;
    String [] e = new String[4]; 
    String [] w = new String[4];
    public void llenar_Pila_Cola(){
        
      for(int i = 1;i <=3;i++){
         System.out.println("Ingrese el Elemento " +i+ " en la Pila "); 
         pila.push(valores=entrada.nextLine());
         e[i] = valores;
        }
      
         System.out.println("------------------------------------");
       
      for(int i = 1;i <=3;i++){
         System.out.println("Ingrese el Elemento " +i+ " en la Cola");
         cola.offer(valores=entrada.nextLine());
         w[i] = valores;
        }
      
         System.out.println("------------------------------------");
         
    }
    
    public void vaciar(){
        
                
        System.out.println(pila.size());
        System.out.println("Elementos de la Pila: ");
        while(pila.empty()==false){
            System.out.println(pila.pop());
            
            
        }
        
        System.out.println("Elementos de la Cola: ");
        while(cola.peek()!=null){
            System.out.println(cola.poll());
        }
        
        System.out.println("............................");
//        System.out.println(e[1]);
//        System.out.println(w[1]);
        
        for(int i=1;i<=3;i++){
            
            for(int j=1;j<=3;j++){
                
                  if(!e[i].equals(w[j])){
                      System.out.println(""+e[i]);
                     
                      }
                  
                    break;
                }
                  
               }
               
            }
        }//fin del metodo Vaciar

// e        w
//john    jhon 
//rubi    rubi
//hola    mami   


        
    
    

