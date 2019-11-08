package algoritmosBasicos;

import java.util.Scanner;

public class AlgoritmoBasico01 {

	public static void main(String[] args) {
		
		final double MILLA = 1.8532;
		int km;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introducir la distancia en km: ");
		km = sc.nextInt();
		double resultado = km / MILLA;
		resultado = Math.rint(resultado*100)/100;
		System.out.println("\nDistancia equivalente en millas marinas: " + resultado);
		sc.close();
	}

}
