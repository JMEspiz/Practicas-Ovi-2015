import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
Autor Yormi Altamirana 
Link del Tuturoial https://geekytheory.com/como-leer-un-fichero-en-java/

*/
public class LeerTexto2 {

   public static void mostarContenido (String archivo){
    String cadena;
   try{
    FileReader f = new FileReader(archivo);
    BufferedReader b = new BufferedReader(f);

      while((cadena = b.readLine())!=null){
          System.out.println(cadena);
         }
             b.close();
            }catch(FileNotFoundException error){
              System.out.println("No se Encotron el Archivo");
            }catch(IOException error){
              System.out.println("Se produjo un error de E/S");
            }

      }//Fin Del Metodo mostrarContenido
     public static void main(String[] args){
     mostarContenido("/home/yormi/Proyectos/Java/LeerArchivo/Archivo.txt");
 }//Fin del Main

}//Fin de la Clase
