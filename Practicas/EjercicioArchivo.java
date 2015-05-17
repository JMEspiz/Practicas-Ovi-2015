import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.File;

//import java.io*; con el asterisco no es necesario instaciamos libreria por lbreria 
public class EjercicioArchivo {

   public static void LeerArchivo (String archivo){
     // String cadena;
       try{
          FileReader f = new FileReader(archivo);
          BufferedReader b = new BufferedReader(f);
          String cadena = "";//la de claro vacia 

         while(cadena!=null){
           cadena = b.readLine();
          /*con este if y el break se controla que si el documento 
          .txt esta vacio no retorne la palabra null en Pantalla */
              if (cadena==null) 
                   break;
               System.out.println(cadena);
           }
           b.close();
            
          }catch(IOException error){
              System.out.println("Se produjo un error de E/S");
            }

    }//Fin Del Metodo mostrarContenido

     /*Metodo que me permite Contar en numero de palabras de un texto */
     public static void contarPalabras(String archivo){
       int palabras = 0;
             try{
          /* se tiene que manejar Excepciones 
           por que se esta trabajndo con un fichero */

         FileReader f = new FileReader(archivo);//este recibe el Archivo .txt
         StreamTokenizer st = new StreamTokenizer(f); //le paso la instancia f
          
            while(st.nextToken() != StreamTokenizer.TT_EOF){
                 if(st.ttype == StreamTokenizer.TT_WORD){
                      palabras++;
                 }

               }//fin del While
               
               System.out.println("Cantidad DE Palabras "+palabras);
             }//findel try

             catch(IOException error){
                System.out.println("Se produjo un error de E/S");
          } 
     
     }//fin del metodo contarPalabras

     /*Metodo que me permite escribir un en u  texto .txt*/
     public static void escribirTexto(String nombreArchivo){
          File f = new File(nombreArchivo);
          try{
              FileWriter w = new FileWriter(f);
              BufferedWriter bw = new BufferedWriter(w);
              PrintWriter wr = new PrintWriter(bw);
              
              wr.write("Como Escribir un archivo plano .txt");
              wr.append("\nParticando para en la OVI 2015");
              wr.close();
              bw.close();
              
             }catch(IOException error){
                 System.out.println("Error");
          }
     }//fin del mentodo escribirTexto

}//Fin de la Clase
