package ejerciciosBasicos;

import java.util.Scanner;

public class Basico05b {
	
	public static void main(String[] args) {
		
		// 2. Scanner
		
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		try {
			num1 = sc.nextInt();
			System.out.print("Introduce el segundo número: ");
			num2 = sc.nextInt();
			System.out.println("Primer número: " + num1);
			System.out.println("Segundo número: " + num2);
		} catch (Exception e) {
			System.out.println("Error en el programa!!!");
		} finally {
			sc.close();
		}
		
	}

}
