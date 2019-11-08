package javadoc.ejemploDocumentacion;

import javadoc.ejemploDocumentacion.negocio.Cuadrado;

/**
 * Programa que inicia el proyecto de ejemplo de JavaDoc
 * @author Julen
 * @version 1.0
 */
public class Main {

	/**
	 * Genera un objeto de la clase {@link Cuadrado} para obtener su área
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cuadrado obj = new Cuadrado();
		obj.setLado(10);
		System.out.println("El área del cuadrado es " + obj.getArea());
	}

}
