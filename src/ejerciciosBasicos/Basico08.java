package ejerciciosBasicos;

import java.util.Scanner;

public class Basico08 {

	private static Scanner teclado;

	public static void main(String[] args) {
		int menor, pos;
		int n1, n2, n3, n4, n5, n6;
		n1 = leerNumero("Introduce el primer número: ");
		n2 = leerNumero("Introduce el segundo número: ");
		n3 = leerNumero("Introduce el tercer número: ");
		n4 = leerNumero("Introduce el cuarto número: ");
		n5 = leerNumero("Introduce el quinto número: ");
		n6 = leerNumero("Introduce el sexto número: ");
		
		menor = n1;
		pos = 1;
		if (n2 < menor) {	menor = n2; pos = 2;	}
		if (n3 < menor) {	menor = n3; pos = 3;	}
		if (n4 < menor) {	menor = n4; pos = 4;	}
		if (n5 < menor) {	menor = n5; pos = 5;	}
		if (n6 < menor) {	menor = n6; pos = 6;	}

		System.out.println("\nEl menor valor es el " + menor + " y esta en la posición " + pos);
	}
	
	private static int leerNumero(String s) {
		teclado = new Scanner(System.in);
		System.out.print(s);
		int num = teclado.nextInt();
		return num;
	}
}
