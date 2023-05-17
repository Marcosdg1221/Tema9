package ej2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
			int num=210;
			int resultado=1, inverso;
			while (num!=0) {
				inverso=num%10;
				resultado = (num*10) + inverso;
				num/=10;
		}
			System.out.println(resultado);

	}
}