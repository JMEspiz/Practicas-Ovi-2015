/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ovi;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author iutval
 */
public class Pila_y_Cola {
    Stack pila = new Stack();
    LinkedList cola = new LinkedList();
    Scanner captacion = new Scanner(System.in);
    public void llenarPila_Cola(){
       
        String x ="";
        for(int i=1; i<=3; i++){
            System.out.println("Introduszca el " +i+ "Valor:");
            x=captacion.nextLine();
            pila.push(x);
        }
    
    }
    public void vaciar(){
        while(pila.empty()!=true){
            System.out.println("\n"+pila.pop());
        }
    }
    public static void main(String [] args){
        Pila_y_Cola pC = new Pila_y_Cola();
        pC.llenarPila_Cola();
        pC.vaciar();
    }
    
}
