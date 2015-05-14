import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class EjercicioArchivo {

   public static void mostarContenido (String archivo){
    String cadena;
   try{
    FileReader f = new FileReader(archivo);
    BufferedReader b = new BufferedReader(f);

      while((cadena = b.readLine())!=null){
          System.out.println(cadena);
         }
             b.close();
            }
            catch(FileNotFoundException error){
              System.out.println("No se Encotron el Archivo");
            }
             catch(IOException error){
              System.out.println("Se produjo un error de E/S");
            }
    }//Fin Del Metodo mostrarContenido
         /*con este metodo cuneto el numero de palabras */
    public static void contarPalabras(String archivo){
       int palabras = 0;
             try{
          /* se tiene que manejar Excepciones 
           por que se esta trabajndo con un fichero */
            FileReader f = new FileReader(archivo);//este recibe el Archivo .txt
          //  BufferedReader b = new BufferedReader(f);
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

     public static void main(String[] args){
     mostarContenido("/home/yormi/Practicas-Ovi-2015/LeerArchivo/Archivo.txt");
     contarPalabras("/home/yormi/Practicas-Ovi-2015/LeerArchivo/Archivo.txt");
 }//Fin del Main
}//Fin de la Clase
