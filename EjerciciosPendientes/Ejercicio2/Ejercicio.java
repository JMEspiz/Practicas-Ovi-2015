import java.util.Stack;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

class Ejercicio {

	public static void main(String[] args){


		//DECLARACION DE VARIABLES E INSTANCIAS
		Stack pila = new Stack();
		LinkedList cola = new LinkedList();
		ArrayList lista = new ArrayList();
		Scanner ent = new Scanner(System.in);
		int i, h;
		boolean llavep = true;
		boolean llavec = true;

		//INTERACCION CON EL USUARIO
		System.out.println("---INICIO DEL PROGRAMA---");
		System.out.println("El siguiente Ejercicio consiste en crear y llenar");
		System.out.println("una pila y una cola y luego vaciar ambos contenidos");
		System.out.println("Dentro de una lista, en la pila y en la cola los");
		System.out.println("los valores pueden coincidir, pero en la lista no");

		System.out.println("A continuacion se creara una pila, ingrese la cantidad maxima de objetos que agregara");

		//ciclo para validar y llenar la Pila
		while(llavep){
			try {
				i = Integer.parseInt(ent.next());
				if(i < 1){
					System.out.println("Debe ser un numero entero y posito");
					llavep = true;
					continue;
				}else {
					llavep = false;
					System.out.println("A continuacion debe ingresar la cantidad " + i +" de valores");
					for( int j = 0; j < i; j++){
						System.out.println("Ingrese un valor \n");
						pila.push(ent.next());
					}
					System.out.println("Valores ingresado");
				}
			}catch(NumberFormatException fne){
				System.out.println("Debe ingresar un numero entero positivo para definir el  largo de la pila");
				llavep = true;
				continue;
			}
		}// FIN DEL WHILE DE VALIDACION DE PILA

		//INTERACION CON EL USUARIO PARA CREAR LA COLA

		System.out.println("Defina cuantos elementos ingresara a la cola");

		//VALIDACION Y LLENADO DE LA COLA
		while(llavec){
			try{
				h = Integer.parseInt(ent.next());
				if(h < 1) {
					System.out.println("Debe ingresar un numero entero positivo");
					llavec = true;
					continue;
				}else{
					llavec = false; 
					String elemento;
					for( int j = 0; j < h; j++){
						System.out.println("Ingrese el valor a almacenar");
						elemento = ent.next();
						cola.offer(elemento);
					}

					System.out.println("Valores Almacenados");
				}
			}catch(NumberFormatException nfe){
				System.out.println("El valor debe ser un numero entero positivo");
				llavec = true;
				continue;
			}

		}// FIN DEL WHILE DE LA COLA

		//INTERACCION CON EL USUARIO, MUESTRA DE ALGUNOS RESULTADOS
		System.out.println("FELICITACIONES HA LLENADO LA PILA CON " + i + " Y LA COLA CON " + h + "CORRECTAMENTE");
		System.out.println("A contnuacion se llenara una lista con los elementos de la pila y cola");
		System.out.println("En caso de coincidencias solo se almacenara un valor");

		System.out.println("---FIN DEL PROGRAMA--");
	}//fm
}//fc
