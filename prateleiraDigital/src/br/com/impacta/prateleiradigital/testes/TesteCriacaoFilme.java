package br.com.impacta.prateleiradigital.testes;

import java.util.Scanner;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class TesteCriacaoFilme {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		FilmeController fc = new FilmeController();

		Filme f = new Filme();

		System.out.println("##### SISTEMA DE CADASTRO DE FILMES #####");

		System.out.println("Insira o título do Filme : ");
		f.setTitulo(scan.next());

		System.out.println("Insira o nome do diretor do Filme : ");
		f.setDiretores(scan.next());

		System.out.println("Insira a nota do Filme : ");
		f.setNota(scan.nextDouble());

		System.out.println("Insira a duração do Filme : ");
		f.setDuracao(scan.nextInt());

		System.out.println("Insira a ano do Filme : ");
		f.setAno(scan.nextInt());

		System.out.println("Insira o gênero do Filme : ");
		f.setGeneros(scan.next());

		System.out.println("Insira número de votos do Filme : ");
		f.setNumVotos(scan.nextInt());

		System.out.println("Insira a URL do Filme : ");
		f.setUrl(scan.next());

		scan.close();

		System.out.println("Título do filme : " + f.getTitulo());
		System.out.println("Diretor : " + f.getDiretores());
		System.out.println("Nota no IMDB : " + f.getNota());
		System.out.println("Duração : " + f.getDuracao());
		System.out.println("Ano lançamento : " + f.getAno());
		System.out.println("Gênero : " + f.getGeneros());
		System.out.println("Qualificação : " + f.getNumVotos());
		System.out.println("Página do Filme : " + f.getUrl());

		// Gravar os dados na base.
		//fc.criarFilme(f);

		//
//		f = fc.criarFilme("Pânico", "Rogério", 5, 180, 2026, "Suspense", 20000, "http://panico.com");
//
//		System.out.println("Título do filme : " + f.getTitulo());

	}

}
