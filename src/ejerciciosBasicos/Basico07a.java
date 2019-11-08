package ejerciciosBasicos;

import java.util.Scanner;

public class Basico07a {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número de 2 cifras: ");
		num = sc.nextInt();
		
		// Otra forma
		/*
		String cadena = String.valueOf(num);
		if (cadena.length() == 2) {
			System.out.println("El número tiene dos cifras");
		} 
		*/
		
		if (num > 9 && num < 100) {
			System.out.println("El número tiene 2 cifras");
			
			int d1, d2;
			d1 = num / 10;
			d2 = num % 10;
			if (d1 % 2 == 0 && d2 % 2 == 0) {
				System.out.println("Los dos dígitos son pares");
			} else if (d1 % 2 == 0) {
				System.out.println("El primer dígito (" + d1  + ") es par");
			} else if (d2 % 2 == 0) {
				System.out.println("El segundo dígito (" + d2  + ") es par");
			} else {
				System.out.println("Ninguno de los dígitos es par");
			}
			
			System.out.println("La media de los dos dígitos es " + (double)(d1+d2)/2);
			
		} else {
			System.out.println("El número introducido " + num + " no es de 2 cifras.");
		}
		sc.close();

	}

}
