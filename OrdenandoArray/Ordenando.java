class Ordenando {

	public void burbujaDec(int[] array){

		boolean val = false;
		int aux;

		while(true)
		{
			val = false;

			for(int i = 1; i < array.length; i++)
			{
				if(array[i] > array[i-1])
				{
					aux = array[i];
					array[i] = array[i-1];
					array[i-1] = aux;
					val = true;
				}

				
			}
			if(val == false){
					break;
				}
		}

	}

	public void burbujaAsc(int[] array){

		boolean val = false;
		int aux;

		while(true)
		{
			val = false;

			for(int i = 1; i < array.length; i++)
			{
				if(array[i] < array[i-1])
				{
					aux = array[i];
					array[i] = array[i-1];
					array[i-1] = aux;
					val = true;
				}

				
			}
			if(val == false){
					break;
				}
		}

	}//fin metodo

	public void insertionDec(int[] array){

		int aux;

		for(int i = 1; i < array.length; i++){

			aux = array[i];

			for(int j = i-1; j >= 0 && array[j] < aux; j--){

					array[j+1] = array[j];
					array[j] = aux;
				
			}
		}

	}//fm


	public void insertionAsc(int[] array){

		int aux;

		for(int i = 1; i < array.length; i++){

			aux = array[i];

			for(int j = i-1; j >= 0 && array[j] > aux; j--){

					array[j+1] = array[j];
					array[j] = aux;
				
			}
		}

	}//fm
	
}
