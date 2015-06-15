import java.util.Arrays;

class MainOrd {


	public static void main(String[] args){

		int[] arreglo = {2, 5, 1, 3, 7, 4, 8};
		Ordenando o = new Ordenando();

		System.out.println("Este es el Arreglo creado");
		for(int j : arreglo){
			System.out.println(j);	
		}
		
		System.out.println("\nOrdenado Descendente Metodo burbuja");
		
		//Arregla el Array de mayor a menor
		o.burbujaDec(arreglo);

		for(int h : arreglo){
			System.out.println(h);	
		}

		System.out.println("\nOrdenado Ascendente Metodo burbuja");

		//de menor a mayor

		o.burbujaAsc(arreglo);

		for(int h : arreglo){
			System.out.println(h);	
		}

		

		System.out.println("\n\nOrdenado Descendente Metodo insertion");
		
		
		o.insertionDec(arreglo);

		for(int h : arreglo){
			System.out.println(h);	
		}		


		System.out.println("\n\nOrdenado Ascendente Metodo insertion");
		
		
		o.insertionAsc(arreglo);

		for(int h : arreglo){
			System.out.println(h);	
		}	
	}
}