package parouimpar;

import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
		System.out.print("Digite um Número: ");
		int valor = tecla.nextInt();
		if (valor%2==0) {
			System.out.println("O Número digitado é Par");
		} else {
			System.out.println("O Número digitado é Ímpar");

		}

	}
}
