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
		/* 		Crear una clase base con el objeto para manejar   */
		/*   Archivos: Crear, Leer, Escribir, Borrar, Buscar      */
		/**********************************************************/


import java.io.*;

class Archivo {

	
		           
		//VARIABLES:

		String nombre_archivo, ruta_archivo, ruta_completa;

		Archivo(){

			this.nombre_archivo = "ejemplo.txt";
			this.ruta_archivo ="";
			this.ruta_completa = ruta_archivo + nombre_archivo;

		}


		public void getRuta(String ruta_completa){

			System.out.println(this.ruta_completa);
		}
}

