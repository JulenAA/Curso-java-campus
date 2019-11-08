package ejerciciosBasicos;

import java.util.Scanner;

public class Basico06 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		num = sc.nextInt();
		if (num == 0) {
			System.out.println("El número es el cero");
		} else if (num > 0) {
			System.out.println("El número es positivo");
		} else {
			System.out.println("El número es negativo");
		}
		
		sc.close();
	}

}
