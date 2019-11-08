package arrays;

import java.util.Scanner;

public class Array01 {

	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = leerNumero("Introduce el número " + (i+1) + ": ");
		}
		
		int cont = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (esPrimo(numeros[i])) {
				cont++;
			}
		}
		System.out.println("\nEn la lista hay " + cont + " numeros primos.");		

		sc.close();
	}
	
	private static boolean esPrimo(int num) {
		boolean primo = (num==1)?false:true;
		int i = 2;
		while (primo && i <= Math.sqrt(num)) {
			if (num % i == 0) {
				primo = false;
			}
			i++;
		}
		return primo;
	}
	
	private static int leerNumero(String s) {
		System.out.print(s);
		int num = sc.nextInt();
		return num;
	}

}
