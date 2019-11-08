package ejerciciosBasicos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Basico04a {

	public static void main(String[] args) {
		
		// 1. InputStreamReader y BufferedReader
		// BufferedReader b = new BufferedReader(new InputStreamReader(System.in)) en un único paso
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		
		System.out.print("Introduce tu nombre: ");
		try {
			String nombre = b.readLine();
			System.out.println("Buenos días " + nombre);
		} catch (Exception e) {
			System.out.println("Error en el programa");
		}
	}

}
