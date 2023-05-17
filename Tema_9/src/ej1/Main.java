package ej1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		{
			TreeSet<Integer> tabla = new TreeSet<Integer>();
			for (int a = 0; a <= 19; a++) {
				tabla.add((int) (Math.random() * 100));
			}
			System.out.println((tabla));
		}
	}
}