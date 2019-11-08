package algoritmosBasicos;

import java.util.Scanner;

public class AlgoritmoBasico03 {

	public static void main(String[] args) {
		
		final int PRECIO = 45; 
		int centimos;
		Scanner sc = new Scanner(System.in);
		System.out.print("Cantidad introducida en céntimos de euro: ");
		centimos = sc.nextInt();
		sc.close();
		System.out.println();
		if (centimos < PRECIO) {
			System.out.println("Cantidad insuficiente. Introduzca más céntimos");
		} else if (centimos == PRECIO) {
			System.out.println("Has introducido la cantidad exacta");
		} else {
			centimos -= PRECIO;
			System.out.println("El cambio a devolver es el siguiente");
			System.out.println("Monedas de 2 euros: " + centimos/200);
			centimos %= 200;
			System.out.println("Monedas de 1 euro: " + centimos/100);
			centimos %= 100;
			System.out.println("Monedas de 50 céntimos: " + centimos/50);
			centimos %= 50;
			System.out.println("Monedas de 20 céntimos: " + centimos/20);
			centimos %= 20;
			System.out.println("Monedas de 10 céntimos: " + centimos/10);
			centimos %= 10;
			System.out.println("Monedas de 5 céntimos: " + centimos/5);
			centimos %= 5;
			System.out.println("Monedas de 2 céntimos: " + centimos/2);
			centimos %= 2;
			System.out.println("Monedas de 1 céntimo: " + centimos);
		}
	}

}
