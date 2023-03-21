package nascimento;

import java.util.Scanner;

public class Nascimento {
	
	
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("Digite o Ano em que você nasceu: ");
		int nasc = t.nextInt();
		int idade = 2023 - nasc;
		System.out.println("sua idade é " + idade);
		if (idade>=18) {
			System.out.println("Você é Maior de Idade");
		} else {
			System.out.println("Você é Menor de idade");
		}
	}
}
