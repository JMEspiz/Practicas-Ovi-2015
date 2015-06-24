
public class Matriz {
	static int n=3;
	private static int matriz[][]=new int[n][n];
	
	public static void main(String[] args){
		cargarMatriz();
		intercambiarFilas();
	}

	private static void cargarMatriz() {
		// TODO Auto-generated method stub
		int v =1;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matriz[i][j]=v;
				System.out.print("|"+matriz[i][j]+"|");
				v++;
			}
			System.out.println("");
		}
	}
	
	private static void intercambiarFilas() {
		// TODO Auto-generated method stub
		int aux[];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matriz[i][j];
				System.out.print("|"+matriz[i][j]+"|");
				v++;
			}
			for(int j=0;j<n;j++){
				matriz[i][j];
				System.out.print("|"+matriz[i][j]+"|");
				v++;
			}
			System.out.println("");
		}
	}
	
	
	
	
}
