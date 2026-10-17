package br.com.impacta.prateleiradigital.testes;

import java.util.List;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class TesteFilme {
	
	public static void main(String[] args) {
//		testeSetAnoValido();
	//	testeSetAnoNegativo();
		//testeSetDuracaoValida();
	//	testeSetDuracaoNegativa();
//		testeSetNumVotosValido();
	//	testeSetNumVotosNegativo();
//		testeSetNotasValidas();
	//	testeSetNotaMaiorQueMaxima();
//		testeSetNotaMenorQueMinima();
		
		FilmeController fc = new FilmeController();
		
		//chama o metodo de listagem dos filmes
		
	//	fc.listagemDeFilmes().forEach(filme -> System.out.println(" Nome do filme : " + filme.getTitulo()));
		
		List<Filme> listaFilmes = fc.listagemDeFilmes();
		
		for(Filme filme : listaFilmes) {
			System.out.println(" Nome do filme : " + filme.getTitulo());
			
		}
		
		Filme filme = fc.listagemDeFilme(0);
		System.out.println("Nome do filme : " + filme.getTitulo());
		
		filme = new Filme();
		
		filme.setAno(1982);
		filme.setDiretores("Steven Spilberg");
		filme.setDuracao(200);
		filme.setGeneros("Ficção");
		filme.setNota(10);
		filme.setNumVotos(1000);
		filme.setTitulo("ET");
		filme.setUrl("Https://imdb.com/ET");
		
		
		fc.cadastroDeFilme(filme);
		
		System.out.println(" Filme Adicionado : " + filme.getTitulo());
		
		
	}

	private static void testeSetNotaMenorQueMinima() {
		Filme f = new Filme();
		double nota = Filme.NOTA_MINIMA - 1;
		
		try {
			f.setNota(nota);
			System.out.println("testeSetNotaMenorQueMinima : FALHOU!");
		} catch (Exception e) {
			System.out.println("testeSetNotaMenorQueMinima : PASSOU!");
			System.out.println("MENSAGEM:" + e.getMessage());
		} 

	}

	private static void testeSetNotaMaiorQueMaxima() {
		Filme f = new Filme();
		double nota = Filme.NOTA_MAXIMA + 1;
		
		try {
			f.setNota(nota);
			System.out.println("testeSetNotaMaiorQueMaxima : FALHOU!");
		} catch (Exception e) {
			System.out.println("testeSetNotaMaiorQueMaxima : PASSOU!");
			System.out.println("MENSAGEM:" + e.getMessage());
		} 

	}

	private static void testeSetNotasValidas() {
		Filme f = new Filme();
		double nota = 10.0;
		
		f.setNota(nota);
		
		if(f.getNota() == 10.0){
			System.out.println("testeSetNotasValidas 1 : PASSOU!");
		}else{
			System.out.println("testeSetNotasValidas 1 : FALHOU!");
		}
		
		nota = 0.0;
		f.setNota(nota);
		
		if(f.getNota() == 0.0){
			System.out.println("testeSetNotasValidas 2 : PASSOU!");
		}else{
			System.out.println("testeSetNotasValidas 2 : FALHOU!");
		}
		
		nota = 5.5;
		f.setNota(nota);
		
		if(f.getNota() == 5.5){
			System.out.println("testeSetNotasValidas 3 : PASSOU!");
		}else{
			System.out.println("testeSetNotasValidas 3 : FALHOU!");
		}
		
		
	}

	private static void testeSetNumVotosNegativo() {
		Filme f = new Filme();
		int votos = -1;
		
		try {
			f.setNumVotos(votos);
			System.out.println("testeSetNumVotosNegativo : FALHOU!");
		} catch (Exception e) {
			System.out.println("testeSetNumVotosNegativo : PASSOU!");
			System.out.println("MENSAGEM:" + e.getMessage());
		} 
	}

	private static void testeSetNumVotosValido() {
		Filme f = new Filme();
		int votos = 500;
		
		f.setNumVotos(votos);
		
		if(f.getNumVotos() == 500){
			System.out.println("testeSetNumVotosValido : PASSOU!");
		}else{
			System.out.println("testeSetNumVotosValido : FALHOU!");
		}
	}

	private static void testeSetDuracaoNegativa() {

		Filme f = new Filme();
		int duracao = -1;
		
		try {
			f.setDuracao(duracao);
			System.out.println("testeSetDuracaoNegativa : FALHOU!");
		} catch (Exception e) {
			System.out.println("testeSetDuracaoNegativa : PASSOU!");
			System.out.println("MENSAGEM:" + e.getMessage());
		} 

	}

	private static void testeSetDuracaoValida() {

		Filme f = new Filme();
		int duracao = 1;
		
		f.setDuracao(duracao);
		
		if(f.getDuracao() == 1){
			System.out.println("testeSetDuracaoValida : PASSOU!");
		}else{
			System.out.println("testeSetDuracaoValida : FALHOU!");
		}
	}

	private static void testeSetAnoNegativo() {
		Filme f = new Filme();
		int ano = -1;
		
		try {
			f.setAno(ano);
			System.out.println("testeSetAnoNegativo : FALHOU!");
		} catch (Exception e) {
			System.out.println("testeSetAnoNegativo : PASSOU!");
			System.out.println("MENSAGEM:" + e.getMessage());
		} 
		
	}

	private static void testeSetAnoValido() {
		Filme f = new Filme();
		int ano = 1;
		
		f.setAno(ano);
		
		if(f.getAno() == 1){
			System.out.println("testeSetAnoValido : PASSOU!");
		}else{
			System.out.println("testeSetAnoValido : FALHOU!");
		}
	}
	
}