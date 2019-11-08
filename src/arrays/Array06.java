package arrays;

public class Array06 {

	public static void main(String[] args) {
		
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		visualizar(numeros);
		
		// 1º método: mismo array y variable aux
		int aux;
		for (int i = 0; i < numeros.length/2; i++) {
			aux = numeros[i];
			numeros[i] = numeros[numeros.length-1-i];
			numeros[numeros.length-1-i] = aux;
		}
		visualizar(numeros);
		
		// 2º método: array auxiliar
		int[] arrayAux = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			arrayAux[i] = numeros[numeros.length-1-i];
		}
		numeros = arrayAux;
		visualizar(numeros);		
	}
	
	private static void visualizar(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
	}

}
