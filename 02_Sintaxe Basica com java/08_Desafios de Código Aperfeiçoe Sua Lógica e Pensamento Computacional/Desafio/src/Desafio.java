

/*
Faça um programa que calcule e imprima o salário a ser
transferido para um funcionário. Para realizar o cálculo receba o valor bruto do salário
e o adicional dos benefícios.

O salário a ser transferido é calculado da seguinte maneira... e aqui tem uma fórmula
de cálculo do salário. Legal. Para calcular o percentual do imposto, que é um dos
elementos que tem aqui na fórmula, segue as alíquotas. Então, aqui a gente tem
alíquotas diferentes de acordo com o salário do funcionário.

Então, se ele ganhar até R$ 1100.00, é 5.00%. Se ele ganhar de R$ 1101.01 até R$
2500.00 é 10.00%, e maior que R$ 2500.00 é 15.00% de alíquota. Então, a gente tem
já informações relevantes aqui sobre o nosso desafio. Então, a gente está entendendo
o contexto, o domínio do nosso problema, que a gente costuma chamar, e agora, a
gente vai entender qual vai ser a entrada.

 */

//Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
//- new Scanner(System.in): crie um leito de Entradas, com métodos úteis com prefixo "next";
//- System.out.println: imprime um texto de Saída (Output) e pulando uma linha.


import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //Lê os valores de Entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);

        System.out.println("Digite o valor de Salario:");
        float valorSalario = leitorDeEntradas.nextFloat();

        System.out.println("Digite o valor do Beneficio:");
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <=  1100){
            //Atribiu a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <=  2500.00) {
            valorImposto = 0.10F * valorSalario;
        } else {
            valorImposto = 0.15F * valorSalario;
        }
        //TODO Criar as demais condições para as aliquotas de 10.00% a 15.00%.

        //Calcule e imprima a Saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto * valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}
