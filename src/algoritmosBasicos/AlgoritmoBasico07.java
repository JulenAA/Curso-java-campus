package algoritmosBasicos;

import java.util.Calendar;
import java.util.Scanner;

public class AlgoritmoBasico07 {

	public static void main(String[] args) {
		
		int mes, anio, numDias = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el mes: ");
		mes = sc.nextInt();
		System.out.print("Introduce el año: ");
		anio = sc.nextInt();
		sc.close();
		switch (mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			numDias = 31;
			break;
		case 4: case 6: case 9: case 11:
			numDias = 30;
			break;
		case 2:
			if ((anio%4 == 0 && anio%100 != 0) || (anio%400 == 0)) {
				numDias = 29;
			}else {
				numDias = 28;
			}
		default:
			System.out.println("No existe el mes " + mes);
		}
		
		if (numDias != 0) {
			System.out.println("El mes " + mes + " del año " + anio + " tiene " + numDias + " días.");
		}
		
		
		// Otra forma
		Calendar fecha = Calendar.getInstance();
		fecha.set(anio, mes, 0);
		numDias = fecha.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Número de días: " + numDias);

	}

}
