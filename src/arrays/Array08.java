package arrays;

import java.util.Scanner;

public class Array08 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int v1[] = new int[leerNumero("Introduce la dimensión del array v1: ")];
		int v2[] = new int[leerNumero("Introduce la dimensión del array v2: ")];
		
		if (v1.length != v2.length) {
			System.out.println("Los arrays no tienen la misma longitud.");
		} else {
			llenarArray(v1);
			llenarArray(v2);
			System.out.println();
			visualizarArray(v1);
			visualizarArray(v2);
			
			if (comprobar(v1, v2)) {
				System.out.println("Todos los valores de v2 son mayores o iguales que los de v1");
			} else {
				System.out.println("Todos los valores de v2 NO son mayores o iguales que los de v1");
			}
		}		
		
		sc.close();
	}
	
	private static boolean comprobar(int[] v1, int[] v2) {
		for (int i = 0; i < v2.length; i++) {
			if (v1[i] > v2[i]) {
				return false;
			}
		}
		return true;
	}

	private static void llenarArray(int[] pArray){
		System.out.println("\nLlenando array ");
		for (int i = 0; i < pArray.length; i++) {
			pArray[i] = leerNumero("Introduce el valor " + (i+1) + ": ");
		}
	}
	
	private static void visualizarArray(int[] pArray) {
		for (int i = 0; i < pArray.length; i++) {
			System.out.print(pArray[i] + " ");
		}
		System.out.println();
	}
	
	private static int leerNumero(String s) {
		System.out.print(s);
		return sc.nextInt();
	}

}
