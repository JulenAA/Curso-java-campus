package ejerciciosBasicos;

import java.util.Scanner;

public class Basico11 {

	public static void main(String[] args) {
		int rep, num = 5;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el número de repeticiones de la serie: ");
		rep = teclado.nextInt();
		teclado.close();
		
		// Con for
		// for(inicializar variable; condicion seguir en el bucle; actualizar la variable)
		for (int i = 1; i <= rep; i++) {
			System.out.print(num + " ");
			num += 5;
		}
		
		System.out.println();

		// Con while
		num = 5;
		int i = 1;
		while (i <= rep) {
			System.out.print(num + " ");
			num += 5;
			i++;
		}
		 
	}

}
