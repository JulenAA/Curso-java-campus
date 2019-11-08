package arrays;

import java.util.Scanner;

public class Array09 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int array1[] = new int[leerNumero("Introduce la dimensión del primer array: ")];
		int array2[] = new int[leerNumero("Introduce la dimensión del segundo array: ")];
		int arrayConcatenado[] = new int[array1.length + array2.length];
		
		System.out.println("Introduciendo los valores del primer array");
		llenarArray(array1);
		System.out.println("Introduciendo los valores del segundo array");
		llenarArray(array2);
		
		System.out.println();
		System.out.println("Primer array");
		visualizarArray(array1);
		System.out.println("Segundo array");
		visualizarArray(array2);
		System.out.println();
		concatenarArrays(array1, array2, arrayConcatenado);
		System.out.println("Array concatenado");
		visualizarArray(arrayConcatenado);
		
		// Otro método con arrayCopy
		int[] arrayConcatenado2 = new int[arrayConcatenado.length];
		System.arraycopy(array1, 0, arrayConcatenado2, 0, array1.length);
		System.arraycopy(array2, 0, arrayConcatenado2, array1.length, array2.length);
		System.out.println("Array concatenado arraycopy");
		visualizarArray(arrayConcatenado2);
		
		sc.close();
	}
	
	private static void concatenarArrays(int[] pArray1, int[] pArray2, int[] pArray3) {
		for (int i = 0; i < pArray1.length; i++) {
			pArray3[i] = pArray1[i];
		}
		
		for (int j=pArray1.length, k=0; j < pArray3.length; j++, k++) {
			pArray3[j] = pArray2[k];
		}		
	}

	private static void llenarArray(int[] pArray){
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
