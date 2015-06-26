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
		int i;
		boolean llave = true;

		//INTERACCION CON EL USUARIO
		System.out.println("---INICIO DEL PROGRAMA---")
		System.out.println("El siguiente Ejercicio consiste en crear y llenar");
		System.out.println("una pila y una cola y luego vaciar ambos contenidos");
		System.out.println("Dentro de una lista, en la pila y en la cola los");
		System.out.println("los valores pueden coincidir, pero en la lista no");
		
		System.out.println("A continuacion se creara una pila, ingrese la cantidad maxima de objetos que agregara");

		while(llave){
			try {
				i = Integre.parseInt(ent.next());
				if(i < 1){
					System.out.println("Debe ser un numero entero y posito");
					llave = true;
					continue;
				}else {
					llave = false;
					System.out.println("A continuacion debe ingresar la cantidad " + i +" de valores");
					for( int = 0; j < i; j++){
						System.out.println("Ingrese un valor \n");
						pila.push(ent.next());
					}
					System.out.println("Valores ingresado");
				}
			}catch(FormatnumberException fne){
				System.out.println("Debe ingresar un numero entero positivo para definir el  largo de la pila");
				llave = true;
				continue;
			}
		}// FIN DEL WHILE DE VALIDACION DE PILA

	}
}
