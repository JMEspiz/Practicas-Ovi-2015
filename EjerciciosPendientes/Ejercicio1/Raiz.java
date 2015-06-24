class Raiz {
	
	public double hacerEcuacion(double raiz, int num){
		double resultado;
		
		resultado = 1 / 2 * (raiz + num / raiz);
		return resultado;
	}

	public boolean validarEcuacion(int num, double raiz){
		boolean resp;
		double cuadrado = Math.pow(raiz, 2);
		double valor = num - cuadrado;
		if(valor > 0.00001){
			resp = false;
		} else {
			resp = true;
		}
		
		return resp;
	}
}
