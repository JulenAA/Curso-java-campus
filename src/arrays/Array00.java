package arrays;

public class Array00 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Declarar un array
		String[] alumnos;
		String profesores[];

		// Crear el array
		alumnos = new String[4];

		// Declaración y creación
		double[] numeros = new double[20];
		int[] numerosEnteros = { 1, 2, 3 };

		System.out.println(alumnos.length);

		alumnos[0] = "Miriam";
		alumnos[1] = "Maria";
		alumnos[2] = "Naia";
		alumnos[3] = "Iñigo";

		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
	}
}
