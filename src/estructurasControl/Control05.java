package estructurasControl;

import java.util.Scanner;

public class Control05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introducir el número de filas: ");
		int numFilas = sc.nextInt();
		for (int i=0, j=numFilas; i <= numFilas; i++, j--) {
			escribirCaracter(' ', i);
			escribirCaracter('*', j);
			System.out.println();
		}
		
		sc.close();
	}
	
	private static void escribirCaracter(char c, int cont) {
		for (int i = 0; i < cont; i++) {
			System.out.print(c);
		}
	}
	
}
