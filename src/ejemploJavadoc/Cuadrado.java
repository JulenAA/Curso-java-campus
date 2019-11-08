package ejemploJavadoc;

/**
 * Clase cuadrado. Atributos lado y área
 * @author Julen
 * @version 1.0
 */

public class Cuadrado {
	
	/**
	 * Variable que indica el tamaño del lado del cuadrado
	 */
	private int lado;
	
	/**
	 * Variable que indica el área del cuadrado 
	 */
	private double area;
	
	/**
	 * Constructor vacío de la clase Cuadrado
	 */
	public Cuadrado() {
	
	}


	/**
	 * Obtener el valor del lado del cuadrado
	 * @return devuelve el valor del lado 
	 */
	public int getLado() {
		return lado;
	}


	/**
	 * Asigna el valor del lado del cuadrado y 
	 * actualiza el valor del área 
	 * @param lado, nuevo valor para el lado
	 */
	public void setLado(int lado) {
		this.lado = lado;
	}


	/**
	 * Obtener el valor del área del cuadrado 
	 * @return devuelve el valor del área 
	 */
	public double getArea() {
		return area;
	}

}
