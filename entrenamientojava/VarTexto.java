package entrenamientojava;
import java.io.*;
/**
 *
 * @author Fernando Parada
 */
public class VarTexto {

    /**
    * @param args
    * leer desde el teclado
    * concat()
    * toUpperCase()
    * toLowerCase()
    * lenght()
    * Convertir variables numericas a String y viceversa
    */
    public static void main(String[] args){
	String texto = "";
	int x=0;
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader buffer = new BufferedReader(in);
	System.out.println("Introduce un número");
	try{
	    texto = buffer.readLine();
	    x = Integer.parseInt(texto);
	}catch(Exception e){
	    System.out.println("Debes escribir un número");
	};
	texto = texto.concat(" Fue el número introducido");
	System.out.println(texto);
	System.out.println(texto.toUpperCase());
	System.out.println(texto.toLowerCase());
	int a = texto.length();
	System.out.println("La frase tiene "+a+" letras");
	System.out.println(x+5+" Es la suma de 5+"+String.valueOf(x));
    }
}
