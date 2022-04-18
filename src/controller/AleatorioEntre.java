package controller;

public class AleatorioEntre {
	
	static int aleatorioEntre(int inicio, int fim) {
			
			fim = fim-inicio;
			fim++;
	
			int tempo = (int)((Math.random()*fim)+inicio);
			
			return tempo;
		}

}
