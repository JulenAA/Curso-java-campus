package algoritmosBasicos;

import java.util.Scanner;

public class AlgoritmoBasico02 {

	public static void main(String[] args) {
		
		double cent, fah, kel;
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Introducir la temperatura en grados centigrados: ");
		cent = sc.nextDouble();
		sc.close();
		fah = convertirCentFah(cent);
		kel = convertirCentKel(cent);
		System.out.println("La temperatura en grados Fahrenheit es: " + fah);
		System.out.println("La temperatura en grados Kelvin es: " + kel);
	}
	
	private static double convertirCentFah(double centig) {
		double fah = (centig / 0.5556) + 32;
		fah = Math.rint(fah*100)/100;
		return fah;
	}
	
	private static double convertirCentKel(double centig) {
		return centig + 273.16;			
	}

}
