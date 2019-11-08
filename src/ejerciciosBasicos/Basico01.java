package ejerciciosBasicos;

public class Basico01 {
	
	public static void main(String[] args) {
		
		// El enunciado está mal. Las variables deben ser en minúsculas por convenio de nomenclatura
		
		// Declaración de las variables
		int n;
		double a;
		char c;
		
		// Asignación de valores
		n = 15;
		a = 3.7;
		c = '#';
		
		// Declaración y asignación
		float f = 2.3f;
		
		System.out.println("Valor de la variable n: " + n);
		System.out.println("Valor de la variable a: " + a);
		System.out.println("Valor de la variable c: " + c);
		System.out.println("Valor de la variable f: " + f);
		
		System.out.println("La suma de " + n + " mas " + a + " es " + (n+a));
		System.out.println("La diferencia de " + n + " menos " + a + " es " + (n-a));
	}

}
