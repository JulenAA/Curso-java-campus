package ejerciciosBasicos;

public class Basico03 {

	public static void main(String[] args) {
		
		int a = 1, b = 2, c = 3, d = 4;
		int aux;
		
		System.out.println("El valor de a es " + a);
		System.out.println("El valor de b es " + b);
		System.out.println("El valor de c es " + c);
		System.out.println("El valor de d es " + d);
		
		aux = b;
		b = c;
		c = a;
		a = d;
		d = aux;
		
		System.out.println();
		System.out.println("El valor de a es " + a);
		System.out.println("El valor de b es " + b);
		System.out.println("El valor de c es " + c);
		System.out.println("El valor de d es " + d);

	}

}
