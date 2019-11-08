package algoritmosBasicos;

import java.util.Scanner;

public class AlgoritmoBasico04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un caracter: ");
		String cadena = sc.next();
		sc.close();
		char caracter = cadena.charAt(0);

		// Con esta sentencia no habría que comprobar las mayúsculas
		// caracter = Character.toLowerCase(caracter);
		
		if (caracter >= '0' && caracter <= '9') {
			System.out.println("El caracter " + caracter + " es de tipo numérico.");
		} else if ((caracter >= 'a' && caracter <='z') || (caracter >= 'A' && caracter <='Z')) {
			System.out.println("El caracter " + caracter + " es una letra.");
		} else {
			System.out.println("El caracter " + caracter + " es un carecter especial.");
		}
		
		// Otra forma
		String resultado = "El caracter " + caracter;
		if (Character.isDigit(caracter)) {
			resultado += " es de tipo numérico.";
		} else if (Character.isLetter(caracter)) {
			resultado += " es una letra.";
		} else {
			resultado += " es un carcater especial.";
		}
		System.out.println(resultado);
		

	}

}
