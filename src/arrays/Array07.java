package arrays;

import java.util.Scanner;

public class Array07 {
	
	static int[] numeros;
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int dim = leerNumero("Introduce la dimensión del array: ");
		numeros = new int[dim];
		
		llenarArray();
		visualizarArray();
		
		System.out.println();
		
		if(esCapicua()) {
			System.out.println("El array es capicua");
		} else {
			System.out.println("El array no es capicua");
		}
		
		sc.close();
	}
	
	private static boolean esCapicua() {
		boolean capicua = true;
		int aux = 0;
		while (capicua && aux < numeros.length / 2) {
			if (numeros[aux] != numeros[numeros.length-1-aux]) {
				capicua = false;
			}
			aux++;	
		}
		return capicua;
	}

	private static void llenarArray(){
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = leerNumero("Introduce el valor " + (i+1) + ": ");
		}
	}
	
	private static void visualizarArray() {
		System.out.println();
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
	}
	
	private static int leerNumero(String s) {
		System.out.print(s);
		return sc.nextInt();
	}

}
