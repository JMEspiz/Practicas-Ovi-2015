import java.util.LinkedList;
public class Lista{
    /*
     para añadir un elemento en la lista usar add
     add(1,17) con el primero indicamo en qye indice va el valor introducido
     con get(0) Muestra el valor introducido en ese indice
     addFirst() Añade el valor en el Primer indice de la lista
     addLast() Añade el valor en el ultimo indice de la lista
     seze Se Obtiene el tamaño de la lista 
     getFirst() nos indica el primer valor de la lista 
     get(lista.size()-1) tambien regresa el ultimo valor de la lista  
     getLast() Regresa el ultimo valor de lalista
     */
  public void llenarLista(){
   LinkedList lista = new LinkedList();
   lista.add("Primer");
   lista.add(5);
   
   System.out.println("El Tamaño de la lista es:"+lista.size());
   System.out.println(lista.get(1)); 
   
  }//Fin de la Funcion LLenar Lista 
}//Fin de la Clase Lista
