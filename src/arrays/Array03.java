package arrays;

import java.util.Scanner;

public class Array03 {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int posMin = 0, posMax = 0;
		
		sc = new Scanner(System.in);
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = leerNumero("Introduce el número " + (i+1) + ": ");
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if (min>numeros[i]) {
				min = numeros[i];
				posMin = i;
			}
			if (max<numeros[i]) {
				max = numeros[i];
				posMax = i;
			}
		}
		
		System.out.printf("%nLa diferencia entre la posición del mayor %d y la del menor %d es %d", 
				max, min, (posMax-posMin));
		
		sc.close();
	}
	
	private static int leerNumero(String s) {
		System.out.print(s);
		int num = sc.nextInt();
		return num;
	}

}
