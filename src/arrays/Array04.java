package arrays;

import java.util.Scanner;

public class Array04 {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		int suma = 0;
		double media;
		int contSup = 0, contInf = 0;
		int[] numeros = new int[10];
		sc = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = leerNumero("Introduce el número " + (i+1) + ": ");
			suma += numeros[i];
		}
		
		media = (double)suma/numeros.length;
		System.out.println("\nLa media de los número es: " + media);
		
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]>media) {
				contSup++;
			}
			if (numeros[i]<media) {
				contInf++;
			}
		}
		
		System.out.println("Valores por encima de la media: " + contSup);
		System.out.println("Valores por debajo de la media: " + contInf);
		
		sc.close();
	}
	
	private static int leerNumero(String s) {
		System.out.print(s);
		int num = sc.nextInt();
		return num;
	}

}
