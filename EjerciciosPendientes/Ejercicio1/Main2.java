import java.util.Scanner;

class Main22 {

	public static void main(String[] args){
	
		//DECLARACION DE VARIABLES
		int num;
		boolean llave = false;
		double raiz;
		
		//INSTANCIAS 
		Scanner ent = new Scanner(System.in);
		Raiz ra = new Raiz();

		//-------------- INICIO DEL PROGRAMA ---------------
		
		//Interaccion con el usuario

		System.out.println("El programa acontinuacion evalua una ecuacion para determinar Raices");
		System.out.println("Basado en la formula Raiz = 1/2 * (raiz + numero /raiz) en el cual");
		System.out.println("Numero es el valor ingresado por el usuario y raiz la mitad de mismo");
		System.out.println("El resultado se validara con la formula (numero - raiz al cuadrado");
		System.out.println("El mismmo se repetira hasta cumplir un margen de error de 0,000001 \n\n\n");

		do{
			//Validacion e Interaccion
			try{
				System.out.println("Por favor ingrese un numero (Debe ser Entero y Positivo)");
				num = Integer.parseInt(ent.next());
				
				//Validacion de que se un entero Positivo
				if(num < 0){
					System.out.println("El numero ingresado debe ser positivo");
					llave = true;
					continue;
				} else {
					//Logica del Algoritmo
					double resultado;
					raiz = (double) num / 2; //valor iniciado de la raiz
					
					//Asignado el resultado de la formula a la variabel resultado
					resultado = ra.hacerEcuacion(raiz, num);
					
					//Comprobando si es valido y detener el ciclo
					llave = ra.validarEcuacion(num, resultado);
		
					//Impresion de Datos y Resultados
					System.out.println("-----RESULTADOS-------");
					System.out.println("El numero de ingresado es: " + num);
					System.out.println("El valor incial para raiz es de: " + raiz);
					System.out.println("El resultado de la ecuacion fue " + resultado);

					if(llave != true){
						System.out.println("La verificacion arrojo como resultado un valor aceptable");
						System.out.println("---FIN DEL PROGRAMA---");
					} else{
						System.out.println("La verificacion arrojo como resultado un valor no aceptable");
					}

					continue;					
				}
			}catch(NumberFormatException e){
				System.out.println("El valor ingresado no cumple con los requisitos\n\n");
				llave = true;
				continue;
			}		

		}while(llave);
	}
}
