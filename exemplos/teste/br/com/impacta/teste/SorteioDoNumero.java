package br.com.impacta.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.impacta.cap13.MegasenaUtilitario;

class SorteioDoNumero {

	@Test
	void geracaoDeNumeroPositivo() {
		int numeroMaiorQueZero = MegasenaUtilitario.sortearNumero();
		assertTrue(numeroMaiorQueZero > 0);
	}
	
	@Test
	void geracaoDeNumeroMenorOuIgualASessenta() {
		int numeroMenorIgualSessenta = MegasenaUtilitario.sortearNumero();
		assertTrue(numeroMenorIgualSessenta <= 60);
	}
	
}
