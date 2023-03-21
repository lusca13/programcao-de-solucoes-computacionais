package equacaosegundograu;

import java.util.Scanner;

public class Equacao {
	
	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
		System.out.print("Digite o Valor de a: ");
		double a = tecla.nextDouble();
		System.out.print("Digite o Valor de b: ");
		double b = tecla.nextDouble();
		System.out.print("Digite o Valor de c: ");
		double c = tecla.nextDouble();
		double delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println("O Resultado de Delta é "+ delta);
		if (delta > 0) {

		double x1 = (-b + Math.sqrt(delta)) / (2*a);
		System.out.println("O Valor de X1 é " + x1);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a );
		System.out.println("O Valor de X2 é " + x2);
		
		}else {
			System.out.println("Não existem Raizes Reais");
		}
	}

}
