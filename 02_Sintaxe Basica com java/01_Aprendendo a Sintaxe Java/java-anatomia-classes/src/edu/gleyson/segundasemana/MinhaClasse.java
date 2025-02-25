package edu.gleyson.segundasemana;

public class MinhaClasse {
    public static void main(String[] args) {
//        // Classes começam com maiuscula e variavel com minuscula
//        int ano = 2021;
//        ano = 2022;
//        final String BR = "Brasil"; // ao usar final antes da declaração significa que o valor não vai ser alterado
//
//        // valores de variaveis que são imutavel
//        String PAIS_BRASIL = "Brasil";
//        double PI = 3.14;
//        int ESTADOS_BRASILEIRO = 27;
//        int ANO_2000 = 2000;
//
//        //Declaração de variavel
//        String meuNome = "Gleyson";
//        int anoFabricacao = 2022;
//        boolean verdadeiro = true;

        String primeiroNome = "Gleyson";
        String segundoNome = "Sampaio";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    //Método
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome); // return significa que vou retornar algo
    }
}
