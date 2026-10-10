package br.com.impacta.cap13;

import java.util.Random;

public class MegasenaUtilitario {
	
	public static int sortearNumero() {
		
		Random sorteador = new Random();
		int numero = sorteador.nextInt();
		
		while(numero <= 0 || numero > 60) {
			numero = sorteador.nextInt();
		}
		
		if(numero > 50) {
			return 0;
		}
		
		return numero;
	}

}
