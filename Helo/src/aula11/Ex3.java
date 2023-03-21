package aula11;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cc = 0;
		while (cc<10) {
			cc++;
			if(cc == 2 || cc == 3 || cc == 4 ) {
			continue;	// MANDOU OCULTAR 2 3 4 COM CONTINUE 
			}
			if (cc == 7) {
				break;// MESMO NAO TERMINADO O LAÇO, ELE VAI EXUCUTAR UM BREAK INDO PRO FINAL DO PROGRAMA
			}
			System.out.println("Cambalhota"+ cc);
		}
	}

}
