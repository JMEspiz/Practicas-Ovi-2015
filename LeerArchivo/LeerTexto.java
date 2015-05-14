import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerTexto {

   public static void mostarContenido (String archivo) throws FileNotFoundException, IOException{
    String cadena;
    FileReader f = new FileReader(archivo);
    BufferedReader b = new BufferedReader(f);
    while((cadena = b.readLine())!=null){ 
           System.out.println(cadena);
  	}
        b.close();
    }
     public static void main(String[] args)throws IOException{
         mostarContenido("/home/yormi/Proyectos/Java/LeerArchivo/Archivo.txt");
 }
}//fin de la clase
