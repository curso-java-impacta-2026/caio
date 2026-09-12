package br.com.impacta.cap11;

public class ExemploArithmetic {
	
	public static void main(String[] args) {

        try {

            int valorTotal = 25;
            int quantidadePessoas = 0;
            int rateio = valorTotal / quantidadePessoas;

            System.out.println("Valor do rateio: " + rateio);

        } catch (ArithmeticException e) {
            System.out.println("Operação inválida.");
            e.printStackTrace();
        }
        catch (RuntimeException e) {
            System.out.println("Operação inválida.");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Operação inválida.");
            e.printStackTrace();
        }  
    }
}



