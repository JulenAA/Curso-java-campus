package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array10 {
	
	private static Scanner sc;
	private static int numeros[];

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		numeros = new int[leerNumero("Introduce la dimensión del array: ")];
		
		llenarArray();
		System.out.println("\nArray original");
		visualizarArray();
		Arrays.sort(numeros);
		System.out.println("\nArray ordenado");
		visualizarArray();

		sc.close();
	}

	private static void llenarArray(){
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = leerNumero("Introduce el valor " + (i+1) + ": ");
		}
	}
	
	private static void visualizarArray() {
		for (int num : numeros) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	private static int leerNumero(String s) {
		System.out.print(s);
		return sc.nextInt();
	}

}
