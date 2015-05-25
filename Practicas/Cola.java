import java.util.LinkedList;
public class Cola {

  public void colaPredeterminada(){
       LinkedList cola = new LinkedList();
        for(int i=1;i<11;i++)//{
           cola.offer(i);
         //  }//Fin del For
           while(cola.peek()!=null){
           System.out.println(cola.poll());  
    }//Fin del While
  }//Fin De la Funcion colaPredeterminada

}//Fin de la Clase Cola
