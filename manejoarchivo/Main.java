package manejoarchivo;



/**********************************************************/
/* Convenciones para nombre de Variables, Metodos y Clases*/
/* VARAIBLES: nombres en minusculas y separados con '_'.  */
/*            Ej: nombre_archivo;                         */
/* METODOS: camelCase, primera letra en miniscula y luego */
/*          mayuscula. Ej:  abrirArchivo();               */
/*CLASES: Mayusculas primera letra de cada palabra, EJ:   */
/*        ArchivoBase {} o Archivo{}                      */
/*INSTANCIAS: primera letra de la clase. Ej: instancia    */
/*            la clase -> Archivo a = new Archivo()       */
/*                                                        */
/* Son solo sugerencias para un buen trabajo en equipo    */
/* Abierto a cambios por decisión grupal                  */
/**********************************************************/

/**********************************************************/
/* OBJETIVOS:                                             */
/*	Crear una clase base con el objeto para manejar       */
/*   Archivos: Crear, Leer, Escribir, Borrar, Buscar      */
/**********************************************************/

//import java.io.*;


public class Main {

	public static void main(String[] args){

		Archivo a = new Archivo("hola.txt", "/home/usuario/");
		Archivo a2 = new Archivo();
		

		//Revisar ruta_completa donde se creara el archivo, porque serán usadas en la creacion de Archivos .txt

		String ruta_a, ruta_a2;

		ruta_a = a.getRuta();

		ruta_a2 = a2.getRuta();

		System.out.println(ruta_a);

		System.out.println(ruta_a2);

		


<<<<<<< HEAD
		a.getRuta("");
=======
>>>>>>> upstream/master

	}

}
