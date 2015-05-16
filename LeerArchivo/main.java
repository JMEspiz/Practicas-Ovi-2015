import java.util.Scanner;
public class main{

  public static void main(String[] args){
   EjercicioArchivo a = new EjercicioArchivo();
   Scanner escribir = new Scanner(System.in);

/*
   //para el metodo LeerArchivo
     a.LeerArchivo("/home/yormi/Practicas-Ovi-2015/LeerArchivo/Archivo.txt");
     a.contarPalabras("/home/yormi/Practicas-Ovi-2015/LeerArchivo/Archivo.txt");

   //Para el Mentodo escribirArvivo
     a.escribirTexto("nuevoArchivo.txt");
     a.LeerArchivo("/home/yormi/Practicas-Ovi-2015/LeerArchivo/nuevoArchivo.txt");
     a.contarPalabras("/home/yormi/Practicas-Ovi-2015/LeerArchivo/nuevoArchivo.txt");
              */
   System.out.println("Menu De Opcione");
   System.out.println("1-Para Leer Un Archivo");
   System.out.println("2-Para Escribir y Leer El Archivo");
   System.out.println("3-Para Salir");

   int opciones;
   System.out.println("Elija Una Opcion");
   opciones = escribir.nextInt();

   
   switch (opciones){
       case 1:
        {
         a.LeerArchivo("/home/yormi/Practicas-Ovi-2015/LeerArchivo/Archivo.txt");
         a.contarPalabras("/home/yormi/Practicas-Ovi-2015/LeerArchivo/Archivo.txt");
          break;
        }
        case 2:
        {
         a.escribirTexto("nuevoArchivo.txt");
         a.LeerArchivo("/home/yormi/Practicas-Ovi-2015/LeerArchivo/nuevoArchivo.txt");
         a.contarPalabras("/home/yormi/Practicas-Ovi-2015/LeerArchivo/nuevoArchivo.txt");
          break;
        }
        case 3:
        {
          System.exit(0);
          break;
        }
    
     }//fin del Switch
   
  }//fin del mentodo min
}//Fin del Main
