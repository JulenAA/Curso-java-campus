package estructurasControl;

import java.util.Scanner;

public class Control04 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		double nota;
		double min = 10, max = 0;
		int contMat = 0, contSob = 0, contNot = 0, contApro = 0, contSusp = 0;
		int cont = 0;
		int suma = 0;
		
		nota = leerNota();
		while (nota >=0) {
			cont++;
			nota = Math.round(nota);
			suma += nota;
			max = Math.max(max, nota);
			min = Math.min(min, nota);
						
			int notaEntero = (int)nota;
			switch (notaEntero) {
			case 0: case 1: case 2: case 3: case 4:
				contSusp++;
				break;
			case 5: case 6:
				contApro++;
				break;
			case 7: case 8:
				contNot++;
				break;
			case 9:
				contSob++;
				break;
			case 10:
				contMat++;
				break;
			}
			
			// Otra forma con if
			/*if (nota < min) {
				min = nota;
			}
			if (nota > max) {
				max = nota;
			}
			if (nota<5) {
				contSusp++;
			} ...  			
			*/
			
			nota = leerNota();
		}
		
		if (cont == 0) {
			System.out.println("No se ha introducido ninguna nota");
		} else {
			System.out.println();
			System.out.println("El máximo es: " + max);
			System.out.println("El mínimo es: " + min);
			System.out.println("La media es " + Math.rint(((double)suma/cont)*100)/100);
			System.out.println("\nCalificación cualitativa de las notas");
			visualizarNota("MATRICULA DE HONOR", contMat);
			visualizarNota("SOBRESALIENTE", contSob);
			visualizarNota("NOTABLE", contNot);
			visualizarNota("APROBADO", contApro);
			visualizarNota("SUSPENSO", contSusp);
			System.out.println("\nFin del programa");
		}
	}
	
	private static void visualizarNota(String nota, int veces) {
		System.out.print(nota + " ");
		for (int i = 1; i <= veces; i++) {
			System.out.print("*");			
		}
		System.out.println();
	}
	
	private static double leerNota() {
		double nota = 0.0;
		sc = new Scanner(System.in);
		do {
			System.out.print("Introduzca una nota (valor negativo para terminar): ");
			nota = sc.nextDouble();
			if (nota>10) {
				System.out.println("> Nota no válida, introduzca un valor entre 0.0 y 10.0");
			}
		} while (nota>10);
		return nota;
	}

}
