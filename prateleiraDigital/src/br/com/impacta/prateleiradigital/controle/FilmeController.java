package br.com.impacta.prateleiradigital.controle;

import br.com.impacta.prateleiradigital.negocio.Filme;

import br.com.impacta.prateleiradigital.persistencia.FilmeDAO;


/**
 * @author Caio
 * @version 1.0
 * @since 2026
 */

public class FilmeController {
	

	/**
	 * 
	 * @param titulo - O titulo do filme que sera trabalhado durante o processo.
	 * @param diretores - Os diretores do filme em questão.
	 * @param nota - A nota do filme no site do IMDB.
	 * @param duracao - A duração do filme em minutos.
	 * @param ano - O ano de lançamento do filme no padrão YYYY.
	 * @param generos - O genero do filme tratado como : [AÇÃO,COMEDIA,DRAMA,ETC;]
	 * @param numDeVotos - A quantidade de votos positivos na plataforma do IMDB.
	 * @param url - A url direta da pagina do filme na plataforma do IMDB.
	 * @return Filme - Um objeto completo contendo todas as informações sobre o filme.
	 */
	public Filme criarFilme(String titulo, String diretores, double nota, int duracao, int ano, String generos,
			int numDeVotos, String url) {

		Filme filme = new Filme(titulo, diretores, nota, duracao, ano, generos, numDeVotos, url);

		System.out.println("Filme criado com sucesso!");

		return filme;

	}
	
	/**
	 * 
	 * @param filme - Um objeto que foi preenchido com todas as informações sobre o filme .
	 * @return Filme - Um objeto completo contendo todas as informações sobre o filme.
	 */

	public Filme criarFilme(Filme filme) {

		FilmeDAO fd = new FilmeDAO();

		if (fd.insert(filme)) {
			System.out.println("Filme criado com SUCESSO!");
			return filme;
		}

		System.out.println("Ocorreu um erro ao tentar criar o FILME!");
		return null;

	}

}
