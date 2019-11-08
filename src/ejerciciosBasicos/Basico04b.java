package ejerciciosBasicos;

import java.util.Scanner;

public class Basico04b {
	
	public static void main(String[] args) {
		
		// 2. Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		try {
			// Aunque no sea necesario, en un bloque try-catch 
			String nombre = sc.nextLine();
			System.out.println("Buenos días " + nombre);
		} catch (Exception e) {
			System.out.println("Error en el programa");
		} finally {
			sc.close();
		}
	}

}
