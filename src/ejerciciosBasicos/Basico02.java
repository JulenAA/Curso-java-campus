package ejerciciosBasicos;

public class Basico02 {

	public static void main(String[] args) {
		
		double n;
		double m;
		
		n = 22.3;
		m = 13.4;
		
		// Otra forma
		// double n=22.3, m=13.4;
		
		System.out.println("El valor de la primera variable es: " + n);
		System.out.println("El valor de la segunda variable es: " + m);
		System.out.println("La suma de las dos variables es: " + (n+m));
		System.out.println("El diferencia de las dos variables es: " + (n-m));
		System.out.println("El producto de las dos variables es: " + (n*m));
		System.out.println("El cociente de las dos variables es: " + (n/m));
		System.out.println("El resto de las dos variables es: " + (n%m));
		System.out.println("El doble de " + n + " es " + 2*n + " y el de " + m + " es " + 2*m);
	}

}
