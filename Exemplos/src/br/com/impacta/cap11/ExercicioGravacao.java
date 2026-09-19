package br.com.impacta.cap11;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ExercicioGravacao {

	public static void main(String[] args) {
		
		/*Dentro do método main, solicite que o usuário digite uma frase qualquer,
		utilizando o método nextLine() da classe Scanner*/
		
		Scanner scan = new Scanner (System.in);
		
		String fraseQualquer = "";
		
		
		
		PrintWriter writer;
		
		try {
			System.out.println("Digite uma frase qualquer !");
			fraseQualquer = scan.nextLine();
			
			writer = new PrintWriter("C:\\doc1.txt");
			writer.println(fraseQualquer);
			writer.close();
			
			
		} catch(IOException e) {
			System.out.println("Falha ao gravar as informações digitadas");
			
		}
		finally {
			scan.close();
		}
			
			
		
		
		
	}

}
