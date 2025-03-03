import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        // Atribuição
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        //Aritméticos
        // Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação), / (divisão) e % (modulo ou resto).
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        //ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.
//        String nomeCompleto = "LINGUAGEM" + "JAVA";
//        System.out.println(nomeCompleto);

        // TESTAR EM DEBUG
//        String concatenacao ="?";
//        System.out.println(concatenacao);
//
//        concatenacao = 1+1+1+"1";
//        System.out.println(concatenacao);
//
//        concatenacao = 1+"1"+1+1;
//        System.out.println(concatenacao);
//
//        concatenacao = 1+"1"+1+"1";
//        System.out.println(concatenacao);
//
//        concatenacao = "1"+1+1+1;
//        System.out.println(concatenacao);
//
//        concatenacao = "1"+(1+1+1);
//        System.out.println(concatenacao);

        //Unários
        /*
        Esses operadores são aplicados juntamente com um outro
        operador aritmético. Eles realizam alguns trabalhos básicos
        como incrementar, decrementar, inverter valores numéricos e
        booleanos.

        (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
        (-) Operador unário de valor negativo – nega um número ou expressão aritmética;
        (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
        (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
        (!) Operador unário lógico de negação – nega o valor de uma expressão booleana;
         */
        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        numero = numero * -1;
        //numero = - numero;  testei assim também também ficou positivo
        System.out.println(numero);

        //atribuir
        numero ++; //numero = numero + 1;
        System.out.println(numero);
        System.out.println(++ numero);
        System.out.println(-- numero);
        System.out.println(numero --);
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);
    }
}
