package br.com.impacta.cap11;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String fraseQualquer = "";
		
		PrintWriter writer;

		try {
		
			System.out.println("Digite uma frase qualquer!!");
			fraseQualquer = scan.nextLine();
			
			writer = new PrintWriter("C:\\sala205\\alexandre\\doc1.txt");
			writer.println(fraseQualquer);
			writer.close();
			
		} catch (IOException e) {
			 System.out.println("Falha ao gravar as informações digitadas");
		}finally {
			scan.close();
		}
		

	}

}
