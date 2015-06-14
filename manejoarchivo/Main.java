



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
/*Crear una clase base con el objeto para manejar         */
/*Archivos: Crear, Leer, Escribir, Borrar, Buscar         */
/**********************************************************/

/**********************************************************/
/* PENDIENTE:                                             */
/*Incorporar un ArrayList para historial                  */
/*Menu de opcion con el ArrayList                         */
/**********************************************************/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main {


	public static void main(String[] args){

		//VARIABLES E INSTANCIAS:
		
		Archivo a; //instancia clase Archivo
		boolean existencia; //Validar existencia de Archivo
		boolean repetir = true; //Loop del menu
		String nombre, ruta; //Valores para la ruta
		String ruta_a; //Ruta para uso de los metodos
		Scanner entrada = new Scanner(System.in);
		Scanner linea = new Scanner(System.in);
		int opcion, opcion2;
		ArrayList al = new ArrayList(); //Clase lista para almacenar Strings
		
		//INTERACCION CON EL USUARIO
		while(repetir){
			System.out.println("****BIENVENIDO****");
			System.out.println("Que desea hacer?");
			System.out.println("1-- Crear Archivo");
			System.out.println("2-- Buscar Archivo");
			System.out.println("3-- Ver Archivos usados recientemente");
			System.out.println("4-- Salir");
			System.out.println("NOTA: para Leer, escribir o Eliminar un archivo debe buscarlo primero    ");
			

			//VALIDAR QUE LA ENTRADA SEA UN ENTERO
			try{
				opcion = Integer.parseInt(entrada.next());


				//VALIDAR QUE EL NUMERO ELEGIDO ESTE ENTRE 1 Y 4

				if(opcion > 4 || opcion < 1){

					System.out.println("Debe elegir una opcion Valida (entre 1 y 4) \n");
				}else{
						
		
			if(opcion == 1 ){
				
				//Se lee ruta y nombre de archivo
				
				System.out.println("Ingrese la ruta donde desea crear el Archivo: \n");
				ruta = entrada.next();
				
				System.out.println("Ingrese el nombre del Archivo a crear (la extensión .txt se genera automaticamente): \n");
				nombre = entrada.next();
				
				//instacia clase Archivo
				a = new Archivo (nombre, ruta);
				ruta_a = a.getRuta();
				
				//Se verifica la existencia para inicar el manejo de archivo
				existencia = a.existeArchivo(ruta_a);
				
				if(existencia){
					//En caso de que exista
					System.out.println("El Arhivo ya Existe!\n");
					
				}else{
					//lo crea de no existir.
					System.out.println("El Archivo ha sido creado!\n");
					a.crearArchivo(ruta_a, existencia);
					al.add(ruta_a);
				}
				
			}else if (opcion == 2){
				//Se lee ruta y nombre de archivo
				
				System.out.println("Ingrese la ruta del archivo a buscar: \n");
				ruta = entrada.next();
				
				System.out.println("Ingrese el nombre del archivo a buscar: \n");
				nombre = entrada.next();
				
				//instacia clase Archivo
				a = new Archivo (nombre, ruta);
				ruta_a = a.getRuta();
				//Agregandolo a la lista de recientes
				al.add(ruta_a);
				//Se verifica la existencia para inicar el manejo de archivo
				existencia = a.existeArchivo(ruta_a);
				
				if(existencia){
					//En caso de que exista
					System.out.println("Seleccione que hacer \n1-- Leerlo \n2-- Escribir\n3--Eliminarlo");
					
					//VALIDANDO QUE SEA UN ENTERO Y ESTE EN LAS OPCIONES VALIDAS
					try{
					opcion2 = Integer.parseInt(entrada.next());

					if(opcion2 < 1 || opcion2 >3){
						System.out.println("---ERROR--- \nopcion NO valida");
					
					}else{
					//Agregandolo a la Lista
					

					switch(opcion2){
					
					case 1:
						a.leerArchivo(ruta_a);
						break;
					case 2:
						String texto;
						System.out.println("Ingrese el texto que desea escribir \n");
						texto = linea.nextLine();
						a.escribirArchivo(ruta_a, texto);
						System.out.println("Archivo escrito");
						break;
					case 3:
						int resp;
						System.out.println("Esta seguro que desea eliminar el archivo " + ruta_a +"\n 1-- SI\n 2-- NO");
						resp = entrada.nextInt();
						if(resp == 1){
							a.borrarArchivo(ruta_a);
						}else {
							System.out.println("Archivo no borrado");
						}
					
					}
				}
				}catch(NumberFormatException e){
				System.out.println("---ERROR---");
				System.out.println("Debe ingresar un numero entero entre 1 y 3 \n\n");

				}
				}else {
					System.out.println("Archivo no existe \n\n");
				}
			}else if (opcion == 4){
				
				repetir = false;
				System.out.println("Adios...\n");

			}else if (opcion == 3){
				
				if(al.isEmpty()){

					System.out.println("Vacio...");
					System.out.print("los datos del historial no son persistentes, se pierden al salir del programa \n\n");
				}else {

					System.out.println("Archivos usados recientemente: ");
					ListIterator iterador = al.listIterator();

					while(iterador.hasNext()){
						System.out.println(iterador.next());
					}
					System.out.println("\n\n"); //espacio de separacion.
				}
			}
		}

			}catch(Exception e){
				System.out.println("---ERROR---");
				System.out.println("Debe ingresar un numero entero entre 1 y 4 \n\n");
			}
		

		} //fin while
	} //fin metodo main
} //fin clase
