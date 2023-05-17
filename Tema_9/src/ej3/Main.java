package ej3;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		{
			TreeSet<String> tabla = new TreeSet<String>(); // Creo Listabla, TreeSet ya se encarga de que los valores no
															// se repitan y se ordenen de forma alfabéticas.
			Scanner all = new Scanner(System.in); // Abro scanner
			System.out.println("Pon una palabra");
			String palabra;
			palabra = all.next();
			while (!palabra.equals("fin")) {
				System.out.println("Pon otra palabra, parará cuando pongas \"fin\" ");
				tabla.add(palabra);
				palabra = all.next();
			}
			System.out.println((tabla));
			all.close();
		}
	}
}