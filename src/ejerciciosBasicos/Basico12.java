package ejerciciosBasicos;

public class Basico12 {

	public static void main(String[] args) {
		
		int num = 1;
		System.out.println("WHILE");
		while (num <= 100) {
			System.out.print(num + " ");
			num++;
		}
		
		System.out.println("\nDO-WHILE");
		num = 1;
		do {
			System.out.print(num + " ");
			num++;
		} while (num <= 100);
		
		System.out.println("\nFOR");
		for (num = 1; num <= 100; num++) {
			System.out.print(num + " ");
		}

	}

}
