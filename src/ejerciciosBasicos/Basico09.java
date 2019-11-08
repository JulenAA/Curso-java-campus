package ejerciciosBasicos;

import java.util.Scanner;

public class Basico09 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número de 5 cifras: ");
		num = sc.nextInt();
		sc.close();
		System.out.println("\nCon el operador /");
		System.out.println(num / 10000);
		System.out.println(num / 1000);
		System.out.println(num / 100);
		System.out.println(num / 10);
		System.out.println(num);
		
		System.out.println("\nCon el método substring de la clase String");
		String strNum = String.valueOf(num);
		System.out.println(strNum.substring(0, 1));
		System.out.println(strNum.substring(0, 2));
		System.out.println(strNum.substring(0, 3));
		System.out.println(strNum.substring(0, 4));
		System.out.println(strNum.substring(0, 5));
	}

}
