package ej5;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner all = new Scanner(System.in); // Abro scanner

		double precio;
		String nombre;
		Main producto;

		HashMap<Double, String> Listado = new HashMap<Double, String>();

		int opcion = -1;
		while (opcion != 0) {
			System.out.println("1; Alta producto" + "\n" + "2; Baja producto" + "\n" + "3; Listar existencias" + "\n"
					+ "4; Listar existencias" + "\n" + "0; Salir");
			System.out.println("Elige opcion con el nº");
			opcion = all.nextInt();
			all.nextLine();
			switch (opcion) {
			case 1:// Pido nombre y precio de producto, creo nuevo objeto si no existe y no hago
					// nada si sí.
				System.out.println("Pon precio del producto");
				precio = all.nextDouble();
				System.out.println("Pon nombre del producto");
				nombre = all.next();
				all.nextLine();
				if (Listado.containsKey(nombre)) {
					System.out.println("Ese producto ya existe");
				} else {
					Listado.put(precio, nombre);
					System.out.println("Producto añadido");
					producto = new Main(precio, nombre);
				}
				break;
			case 2: //Lo mismo que arriba pero al revés y eliminando
				System.out.println("Pon nombre del producto que quieres eliminar");
				nombre = all.next();
				System.out.println("Pon precio de ese producto");
				precio = all.nextDouble();
				producto = new Main(precio, nombre);
				if (!Listado.containsKey(producto)) {
					System.out.println("Ese producto no existe");
					Listado.remove(producto);
				} else {
					Listado.remove(producto);
					System.out.println("Producto eliminado");
				}
				break;
			case 3:
				System.out.println(Listado);
				break;
			case 4: // En el documento no hay 3, supongo que haré lo mismo con el tres y el cuatro
					// xD
				System.out.println(Listado);
				break;
			case 0:
				break;
			default:
				System.out.println("Opción inválida");
			}
		}
		all.close();
	}

	public Main(double precio, String nombre) {
	}

}
