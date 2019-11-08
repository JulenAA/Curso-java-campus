package ejerciciosBasicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basico07b {
	
	public static void main(String[] args) {
		
		try {
			int num = leerNumero("Introduce un número de 2 cifras: ");
			if (num > 9 && num < 100) {
				System.out.println("El número tiene 2 cifras");
				
				int d1, d2;
				d1 = num / 10;
				d2 = num % 10;
				if (d1 % 2 == 0 && d2 % 2 == 0) {
					System.out.println("Los dos dígitos son pares");
				}
				System.out.println("La media de los dos dígitos es " + (double)(d1+d2)/2);
				
			} else {
				System.out.println("El número introducido " + num + " no es de 2 cifras.");
			}
			
		} catch (IOException e) {
			System.out.println("Error en el programa!!!");
		}
	}
	
	private static int leerNumero(String s) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(isr);
		System.out.print(s);
		String linea = b.readLine();
		return Integer.parseInt(linea);
	}

}
