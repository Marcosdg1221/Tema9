package ej4;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		{
			Scanner all = new Scanner(System.in); // Abro scanner

			TreeMap<Integer, Integer> numeros = new TreeMap();
			TreeMap<Integer, Integer> estrellas = new TreeMap();

			int n;
			String opc;
			System.out.println("Querí seguir?");
			opc = all.next();

			while (opc.equals("s")) {
				System.out.println("Pon 5 nºs");
				for (int a = 5; a <= 5; a++) {
					System.out.println("Pon el número " + a + " para esa posición de estrella en el euromillón");
					n = all.nextInt();
					if (numeros.containsKey(numeros)) {
						numeros.put(n, 1);
					} else {
						numeros.put(all.nextInt(), 1);
					}
				}
			}
			for (int a = 1; a <= 2; a++) { // Pone los nºs de las estrellas, que al ser dos, el for es bastante overkill
											// ahora que lo pienso...
				System.out.println("Pon el número " + a + " para esa posición de estrella en el euromillón");
				estrellas.put(all.nextInt(), 1);
			}

			all.close();
		}
	}
}