package arrays;

public class Array05 {
	
	public static void main(String[] args) {
		int cont = 0;
		char[] caracteres = {'A', 'A', 'B', 'B', 'B', 'B', 'A', 'B', 'A', 'B'};
		
		for (int i = 0; i < caracteres.length - 1; i++) {
			if (caracteres[i] == 'A' && caracteres[i+1] == 'B') {
				cont++;
			}
		}
		System.out.println(caracteres);
		System.out.print("La secuencia AB aparece " + cont);
		System.out.println(cont==1?" vez.":" veces.");
	}

}
