package ejerciciosBasicos;

import java.util.Scanner;

public class Basico05c {
	
	private static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		// 3. Recoger datos teclado en una función
		
		int num1, num2;
		num1 = leerNumero("Introduce el primer número: ");
		num2 = leerNumero("Introduce el segundo número: ");
		System.out.println("El primer número es: " + num1);
		System.out.println("El segundo número es: " + num2);
		sc.close();
	}
	
	private static int leerNumero(String s) {
		System.out.print(s);
		int num = sc.nextInt();
		return num;
	}

}
