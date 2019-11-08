package estructurasControl;

import java.util.Scanner;

public class Control01 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		int num = leerNumero();
		sc = new Scanner(System.in);
		while (num > -1) {
			visualizarFactorial(num);
			num = leerNumero();
		}
		System.out.println("\nFin del programa");
		sc.close();
	}
	
	private static void visualizarFactorial(int num) {
		long fact = 1;
		System.out.print(num + "! = ");
		while (num > 0) {
			fact *= num;
			System.out.print(num);
			if (num > 1) {
				System.out.print(" * ");
			} else {
				System.out.print(" = ");
			}
			num--;
		}
		System.out.println(fact);
		System.out.println();
		
		// Con bucle for
		// for(int i = num;i>0;i--) 
	}
	
	private static int leerNumero() {
		int num;
		sc = new Scanner(System.in);
		System.out.print("Introduce un número (negativo para terminar): ");
		num = sc.nextInt();
		return num;
	}

}
