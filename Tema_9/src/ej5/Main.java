package ej5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		{

			Scanner all = new Scanner(System.in); // Abro scanner

			HashMap<Integer, String> Listado = new HashMap<Integer, String>();

			int opcion = -1;
			while (opcion != 0) {
				System.out.println("1; Alta producto" + "\n" + "2; Baja producto" + "\n" + "3; Listar existencias"
						+ "/n" + "4 ; Listar existencias" + "/n" + "0 ; Salir");
				System.out.println("Elige opcion con el nº");
				opcion = all.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Pon presio y nombre");
					Listado.put(all.nextInt(), all.next());
					all.nextLine();
					break;
				case 2:
					System.out.println("Pon presio y nombre");
					Listado.remove(Listado);
					break;
				case 3:
					System.out.println(Listado);
					break;
				case 4:
					System.out.println(Listado);
					break;
				case 0:
					break;
				}
				all.close();
			}
		}
	}
}
