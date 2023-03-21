package aula11;

public class EquantoEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cc = 0;
		while (cc<10) {
			cc++;
			if (cc == 5 || cc == 7 || cc == 9) {
				continue; //QUANDO UTILIZA CONITNUE INTERROMPE O LOOPING E RETORNA PARA O ENQUANTO
			}
			System.out.println("Cambalhota"+ cc);
		}// ENQUANTO FINALIZA AQUI.
	}

}
