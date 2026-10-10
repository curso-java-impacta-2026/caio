package br.com.impacta.cap15;

import java.util.HashMap;

public class ExemploHashCode {
    public static void main(String[] args) {
		Pessoa a = new Pessoa("Rodrigo",23);
		Pessoa b = new Pessoa("Claudio",20);

        System.out.println(a.nome + " é igual a " + b.nome + "? " + (a.hashCode() == b.hashCode()));
		
		a.nome = b.nome; //Nomes iguais, mas objetos diferentes
		
		System.out.println(a.nome + " é igual a " + b.nome + "? " + (a.hashCode() == b.hashCode()));
		
		System.out.println("Antes de jogar o b no a : " + a.hashCode());
		System.out.println("Endereço de memória do objeto : " + a);
		
		a = b; //Objetos iguais
		
		System.out.println(a.nome + " é igual a " + b.nome + "? " + (a.hashCode() == b.hashCode()));
		
		
		System.out.println(a.hashCode());
		System.out.println("Endereço de memória do objeto : " + a);
		
		
		
    }
}
