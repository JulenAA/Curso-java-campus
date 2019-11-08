package algoritmosBasicos;

import java.util.Scanner;

public class AlgoritmoBasico06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char respuesta;
		System.out
				.println("Resolución problemas de acceso a internet - Manolo & Company");
		System.out.println();
		System.out
				.print("¿Esta conectado el cable a la tarjeta de red? (S/N): ");
		try {
			respuesta = sc.next().toUpperCase().charAt(0);
			if (respuesta == 'S') {
				System.out
						.print("¿La direccion IP de la maquina y la mascara de red son correctas? (S/N): ");
				respuesta = sc.next().toUpperCase().charAt(0);
				if (respuesta == 'S') {
					System.out
							.print("¿La puerta de enlace predeterminada es correcta? (S/N): ");
					respuesta = sc.next().toUpperCase().charAt(0);
					if (respuesta == 'S') {
						System.out
								.print("¿El servidor DNS es correcto? (S/N): ");
						respuesta = sc.next().toUpperCase().charAt(0);
						if (respuesta == 'S') {
							System.out
									.print("¿El servidor proxy esta correctamente configurado en el navegador? (S/N): ");
							respuesta = sc.next().toUpperCase().charAt(0);
							if (respuesta == 'S') {
								System.out
										.println("\nExiste un problema de HW. Consulte a su tecnico");
							} else {
								System.out
										.println("\nConfigurar el proxy e intentar de nuevo. FIN");
							}
						} else {
							System.out
									.println("\nConfigurar el DNS e intentar de nuevo. FIN");
						}
					} else {
						System.out
								.println("\nConfigurar la puerta de enlace e intentar de nuevo. FIN");
					}
				} else {
					System.out.println("\nConfigurar la direccion. FIN");
				}
			} else {
				System.out
						.println("\nConectar el cable e intentar de nuevo. FIN");
			}
		} catch (Exception e) {
			System.out.println("Error en el programa!");
		} finally {
			sc.close();
		}

	}

}
