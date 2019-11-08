package estructurasControl;

import java.util.Scanner;

public class Control03 {

	private static Scanner sc;
	
	public static void main(String[] args) {
		int n1, n2;
		sc = new Scanner(System.in);
		n1 = leerNumero("Introduce el límite inferior (N1): ");
		n2 = leerNumero("Introduce el límite superior (N2): ");
		while (n2 <= n1) {
			System.out.println("El límite superior debe ser mayor que el límite inferior.");
			n2 = leerNumero("Introduce el límite superior (N2): ");
		}
		
		System.out.printf("%nLos números primos entre %d y %d son %n%n", n1, n2);
		
		int cont = 0;
		for(int i=n1; i<=n2; i++) {
			if (esPrimo(i)) {
				System.out.print(i + " ");
				cont++; 
			}
			if(cont == 4){
				System.out.println();
				cont = 0;
			}
		}
				
		System.out.println("\n\nFin del programa");
		sc.close();
		
	}
	
	private static boolean esPrimo(int num) {
		boolean primo = (num==1)?false:true;
        int divisor=2;
        while(primo && divisor<=Math.sqrt(num)){
            if(num%divisor==0){
                primo = false;
            }
            divisor++;
        }
        return primo;
	}
	
	private static int leerNumero(String s) {
		System.out.print(s);
		int num = sc.nextInt();
		return num;
	}

}
