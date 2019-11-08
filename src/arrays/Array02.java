package arrays;

import java.util.Scanner;

public class Array02 {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		// Podríamos igualar el maximo y el minimo al primer elemento
	    // int max = numeros[0];
		
		sc = new Scanner(System.in);
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = leerNumero("Introduce el número " + (i+1) + ": ");
		}
		
		for (int i = 0; i < numeros.length; i++) {
			min = Math.min(min, numeros[i]);
			max = Math.max(max, numeros[i]);
			// Otra forma
			/*if (min<numeros[i]) {
				min = numeros[i];
			}
			if (max>numeros[i]) {
				max = numeros[i];
			}*/
		}
		
		System.out.println();
		System.out.println("El valor mayor es: " + max);
		System.out.println("El menor valor es: " + min);
		System.out.printf("%nLa diferencia entre el mayor %d y el menor %d es %d", 
				max, min, (max-min));
		
		sc.close();
	}
	
	private static int leerNumero(String s) {
		System.out.print(s);
		int num = sc.nextInt();
		return num;
	}

}
