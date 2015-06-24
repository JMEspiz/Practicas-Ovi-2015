package entrenamientojava;
/**
 *
 * @author Fernando Parada
 */
public class CuadradoMagico {
	private static int cuadro[][] = new int[3][3];
	private static int pares[] = new int[4];
	private static int impares[] = new int[5];

	public static void main(String[] args) {
		CuadradoMagico cm = new CuadradoMagico();
		cm.paresImpares();
		cm.acomodarPares();
		cm.acomodarImpares();
		cm.mostrar();
	}

	/* Implemento el metodo paresImpares() para calcular los numeros pares y los impares comprendidos entre 1 y 9 guardandolos en vectores diferentes.
	   Los Numeros los almaceno de mayor a menor:
	   pares: 8, 6, 4, 2
	   impares: 9, 7, 5 ,3, 1
	*/
	void paresImpares(){
		int x=0, y=0;
		//sacar pares
		for(int n=9;n>0;n--){
			if(n%2==0){
				pares[x]= n;
				x++;
			}else{
				impares[y]=n;
				y++;
			}
		}//for
	}//paresImpares

	/* Ahora hacemos un ciclo que haga el recorrido de filas de 1 a 3 y el de las columnas de 3 a 1;
	es decir que el recorrido de las filas vaya de arriba a abajo y el de las columnas de derecha a izquierda, 
	con la condicion de que se vayan guardando los numeros pares de mayor a menor en cada una de las posiciones 
	donde el entero de las filas y columnas sea par:
	0,0 - 0,2
	2,0 - 2,2
	*/
	void acomodarPares(){
		int x=0;
		for(int i=0;i<3;i++){
			for(int j=2;j>=0;j--){
				if(i%2==0 && j%2==0){
					cuadro[i][j] = pares[x];
					x++;
				}
			}//columnas
		}//filas
	}//acomodarPares

	/*Como ya tenemos organizados los numeros pares, ahora solo falta organizar los impares, con el mismo algoritmo
	  de arriba-abajo, derecha-izquierda pero con la condicion de que solo se fueran almacenando los impares si la
	  posicion estaba vacia (osea si es cero) pero en orden contrario, como los impares estaban de mayor a menor, el
	  codigo cambio en que se colocarian desde la ultima posicion hasta la primera, osea de menor a mayor. 
	*/
	void acomodarImpares(){
		int y=4;
		for(int i=0;i<3;i++){
			for(int j=2;j>=0;j--){
				if(cuadro[i][j] == 0){
					cuadro[i][j] = impares[y];
					y--;
				}
			}//columnas
		}//filas
	}//acomodarImpares

	//Una ves ya organizado todos los numeros en la matriz, procedemos a mostrarlos en pantalla
	void mostrar(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print("|"+cuadro[i][j]+"|");
			}//columnas
			System.out.println("");
		}//filas
	}//mostrar
}//class
