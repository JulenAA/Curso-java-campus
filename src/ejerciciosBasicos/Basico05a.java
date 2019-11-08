package ejerciciosBasicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Basico05a {
	
	public static void main(String[] args) {
		
		// 1. InputStreamReader y BufferedReader
		
		int num1, num2;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(isr);
		System.out.print("Introduce el primer número: ");
		try {
			String cadena = b.readLine();
			num1 = Integer.parseInt(cadena);
			System.out.print("Introduce el segundo número: ");
			cadena = b.readLine();
			num2 = Integer.parseInt(cadena);
			System.out.println("Primer número: " + num1);
			System.out.println("Segundo número: " + num2);
		} catch (Exception e) {
			System.out.println("Error en el programa!!!");
		}
		
	}

}
