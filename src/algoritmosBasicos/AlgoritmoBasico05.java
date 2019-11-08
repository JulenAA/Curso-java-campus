package algoritmosBasicos;

import java.util.Random;

public class AlgoritmoBasico05 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int temp = r.nextInt(55) - 10;
		System.out.println("La temperatura actual es de " + temp + " grados.");
		System.out.println();
		if (temp < 10) {
			System.out.println("Mucho frío");
		} else if (temp < 15) {
			System.out.println("Poco frío");
		} else if (temp < 25) {
			System.out.println("Temperatura normal");
		} else if (temp < 30) {
			System.out.println("Poco calor");
		} else {
			System.out.println("Mucho calor");
		}
		
		// Otra forma aleatorio
		// En general, para conseguir un número entero entre M y N con M menor que N, debemos usar esta fórmula
        // int valorEntero = Math.floor(Math.random()*(N-M+1)+M);  // Valor entre M y N, ambos incluidos.
		// temp = (int) Math.floor(Math.random()*(-54) + 45);

	}

}
