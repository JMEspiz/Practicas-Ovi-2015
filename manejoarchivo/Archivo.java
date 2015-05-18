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
/*Loop para que se repita infinitamente                   */
/**********************************************************/


import java.io.*;


public class Archivo {

	
		           
		//VARIABLES:

		public String nombre_archivo;
		public String ruta_archivo;
		public String ruta_completa;
		public boolean existe;

		
		//constructor por Defecto
		
		public Archivo(){

			this.nombre_archivo = "ejemplo.txt";
			this.ruta_archivo ="";
			this.ruta_completa = ruta_archivo + nombre_archivo;

		}
		
		//CONSTRUCTOR CON PARAMETROS
		public Archivo(String nombre, String ruta){

			this.nombre_archivo = nombre;
			this.ruta_archivo =ruta;
			this.ruta_completa = ruta + "/" + nombre + ".txt";
		}

		//Metodo para obtener la ruta para la instancia File

		public String getRuta(){

			return ruta_completa;		
		}
		
		//METODO DE LECTURA DE YORMI
		
		public void leerArchivo(String archivo){
			
			//Variable par manejar la lectura
			String cadena;
			
			//Todo Manejo de archivo debe usarse el Try, para manejar excepciones
						
			try {
				
				
				FileReader fr = new FileReader(archivo); //Para leer el archivo
				BufferedReader br = new BufferedReader(fr);
				
				//Recorrrer cada linea del archivo
				while((cadena = br.readLine()) != null){
					
					System.out.println(cadena); //Imprimir cada linea
				}
				
				//Cerrar el archivo
				
				br.close();
				fr.close();
			
			}catch(FileNotFoundException error){
	              System.out.println("No se Encontro el Archivo");
	        }catch(IOException error){
	              System.out.println("Se produjo un error de E/S");
	        }
			
		}
		
		//METODO PARA VERIFICAR EXISTENCIA DE UN ARCHIVO
		public boolean existeArchivo(String archivo){
			
			File f = new File(archivo);
			
			if (f.exists()){
				System.out.println("Archivo Encontrado!");
				this.existe = true;
				return existe;
			}else{
				//System.out.println("No Existe el " + nombre_archivo +" en la ruta " + ruta_archivo);
				this.existe = false;
				return existe;
			}
		}
		
		
		//METODO PARA CREAR ARCHIVO TXT
		
		public void crearArchivo(String archivo, boolean existe){
			
			if (!existe){
				
				File f = new File(archivo);
			
				try{
					//Creando el archivo vacio
					
					f.createNewFile();
					
				}catch(Exception e){
					System.out.println("Error al crear el archivo");
				}
			}else {
				System.out.println("Archivo ya existe!");
			}
			
			
		}
		
		//METODO PARA ESCRIBIR ARCHIVO TXT
		public void escribirArchivo(String archivo, String texto){
			
			try{
				//Instancias necesarias para escribir
				FileWriter fw = new FileWriter(archivo);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				
				//escribiendo
				pw.write(texto + "\n");
					
				//Cerrando Archivo
				pw.close();
				bw.close();
					
				}catch(IOException e){
					System.out.println("Error de E/S " + e);
				}
		}
		
		//METODO PARA BORRAR ARCHIVOS TXT
		
		public void borrarArchivo(String archivo){
			
			try{
				File f = new File(archivo);
				
				f.delete();
				System.out.println("Eliminado el archivo " + nombre_archivo + " en la ruta " + ruta_archivo);
			}catch(Exception e){
				System.out.println("Error al intentar eliminar archivo");
			}
			
		}
			
			
}