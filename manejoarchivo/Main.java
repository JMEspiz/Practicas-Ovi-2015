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

/**********************************************************/
/* PENDIENTE:                                             */
/*	Loop para que se repita infinitamente                 */
/**********************************************************/

import java.util.Scanner;


class Main {

	public static void main(String[] args){

		//VARIABLES E INSTANCIAS:
		
		Archivo a; //instancia clase Archivo
		boolean existencia; //Validar existencia de Archivo
		boolean repetir = true; //Loop del menu
		String nombre, ruta; //Valores para la ruta
		String ruta_a; //Ruta para uso de los metodos
		Scanner entrada = new Scanner(System.in);
		int opcion, opcion2;
		
		
		//INTERACCION CON EL USUARIO
		//while(repetir){
			System.out.println("//**BIENVENIDO**\\");
			System.out.println("Que desea hacer?\n1-- Crear Archivo\n2-- Buscar Archivo \n3-- Salir");
			System.out.println("NOTA: para Leer, escribir o Eliminar un archivo debe buscalo primero    ");
			opcion = entrada.nextInt();
		
			if(opcion == 1 ){
				
				//Se lee ruta y nombre de archivo
				
				System.out.println("Ingrese la ruta donde desea crear el Archivo: \n");
				ruta = entrada.next();
				
				System.out.println("Ingrese el nombre del Archivo a crear: \n");
				nombre = entrada.next();
				
				//instacia clase Archivo
				a = new Archivo (nombre, ruta);
				ruta_a = a.getRuta();
				
				//Se verifica la existencia para inicar el manejo de archivo
				existencia = a.existeArchivo(ruta_a);
				
				if(existencia){
					//En caso de que exista
					System.out.println("El Arhivo ya Existe!");
					
									
				}else{
					//lo crea de no existir.
					System.out.print("El Archivo ha sido creado!");
					a.crearArchivo(ruta_a, existencia);
				}
				
				
			}else if (opcion == 2){
				
				repetir = false;
				
				//Se lee ruta y nombre de archivo
				
				System.out.println("Ingrese la ruta donde desea crear el Archivo: \n");
				ruta = entrada.next();
				
				System.out.println("Ingrese el nombre del Archivo a crear: \n");
				nombre = entrada.next();
				
				//instacia clase Archivo
				a = new Archivo (nombre, ruta);
				ruta_a = a.getRuta();
				
				//Se verifica la existencia para inicar el manejo de archivo
				existencia = a.existeArchivo(ruta_a);
				
				if(existencia){
					//En caso de que exista
					System.out.println("Seleccione que hacer \n1-- Leerlo \n2-- Escribir\n3--Eliminarlo");
					opcion2 = entrada.nextInt();
					
					switch(opcion2){
					
					case 1:
						a.leerArchivo(ruta_a);
						break;
					case 2:
						String texto;
						System.out.println("Ingrese el texto que desea escribir \n");
						texto = entrada.next();
						a.escribirArchivo(ruta_a, texto);
						System.out.println("Archivo escrito");
						break;
					case 3:
						int resp;
						System.out.println("Esta seguro que desea elimar el archivo " + ruta_a +"\n 1-- SI\n 2-- NO");
						resp = entrada.nextInt();
						if(resp == 1){
							a.borrarArchivo(ruta_a);
						}else {
							System.out.println("Archivo no borrado");
							repetir = true;
						}
						
					}					
													
			}else if (opcion == 3){
				
				repetir = false;
				System.exit(0);
				
			}else{
				repetir = false;
			}
			
		}
		
	}

 
}