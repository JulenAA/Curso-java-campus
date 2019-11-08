package estructurasControl;

import java.util.Scanner;

public class Control02 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		int x, y, rep;
		double rdo;
		sc = new Scanner(System.in);
		x = leerNumero("Introducir el valor de x: ");
		y = leerNumero("Introducir el valor de y: ");
		rep = leerNumero("Introducir el número de repeticiones: (n): ");
		rdo = calcularSerie(x, y, rep);
		System.out.println("\nEl valor de la serie es " + rdo);
		sc.close();
	}
	
	private static double calcularSerie(int x, int y, int repeticiones) {
		double rdo = 0.0;
		for (int i = 1; i <= repeticiones; i++) {
			rdo += 1.0 / (x + Math.pow(y, 1)); 
		}
		rdo = Math.rint(rdo * 100000)/100000;
		return rdo;
	}
	
	private static int leerNumero(String s) {
		System.out.print(s);
		int num = sc.nextInt();
		return num;
	}
}
