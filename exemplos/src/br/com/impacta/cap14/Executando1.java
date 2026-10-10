package br.com.impacta.cap14;

import java.util.function.Consumer;

public class Executando1 {

    public static void main(String[] args) {

        ExemploFuncional1 funcao = (n, i, s) -> System.out.println(
            "Parabéns " + n.toUpperCase() +
            " pelos seus " + i +
            " anos de vida. Seu novo salário é: " + s);
        
        funcao.exibeDados("Manuel", 45, 5500.15);
        
        FinancialUtils.calculaJuros(0, 0);
        
        Consumer<String> msg = txt -> System.out.println("Essa é a msg:"+txt);
        
        msg.accept("Oi zente!");
        
        
    }
}
