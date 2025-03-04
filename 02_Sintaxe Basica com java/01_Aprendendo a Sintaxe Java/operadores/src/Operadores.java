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

        //Ternário
        int a, b;
        a = 5;
        b = 6;

//        String resultadoExerOperaTernario = "";
//        if(a==b) {
//            resultadoExerOperaTernario = "verdadeiro";
//        }else {
//            resultadoExerOperaTernario = "falso";
//        }
        String resultadoExerOperaTernario = a==b ? "verdadeiro":"falso"; // O significado desta linha é a mesma que acima

        System.out.println(resultadoExerOperaTernario);

        //Relacionais
//        String nomeUm = "Jefferson";
//        String nomeDois = "Jefferson";
//        System.out.println(nomeUm == nomeDois);

        String nomeUm = "Jefferson";
        String nomeDois =new String("Jefferson") ;
        System.out.println(nomeUm.equals(nomeDois));


        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");

        /*
        Comparações avançadas
        Quando se refere a comparação de conteúdos na linguagem, devemos ter um certo domínio de como o Java trata o armazenamento deste valores na memória.

        Quando estiver mais familiarizado com linguagem, recomendamos se aprofundar no conceito de espaço em memória Stack versus Heap.

        Vamos a alguns exemplos para ilustrar:

        Valor e referência: Precisamos entender que em Java tudo é objeto, logo objetos diferentes podem ter as mesmas características, mas lembrando, são objetos diferentes.
         */

        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");

        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true

        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??

        /*
        == versus equals: Existe uma relevância forte em realizar comparações com == e equals na qual precisamos ter uma compreensão de quais as regras seguidas pela linguagem **** , exemplo:
         */
        int numeros1 = 130;
        int numeros2 = 130;
        System.out.println(numero1 == numero2); //true

        String numerosi1 = "130";
        String numerosi2 = new String("130");
        System.out.println(numerosi1 == numerosi2); //false

        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals

        System.out.println(numerosi1.equals(numerosi2));

        //Lógico
        /*
        Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.
            && Operador Lógico "E"
            || Operador Lógico "OU"
         */
        boolean condicao1=true;
        boolean condicao2=false;
        if(condicao1 && condicao2) {
            System.out.print("Os dois valores precisam ser verdadeiros");
        }

        if(condicao1 || condicao2){
            System.out.print("Um dos valores precisa ser verdadeiro");
        }

        if(condicao1 && (7 > 4)) {
            System.out.print("Os dois valores precisam ser verdadeiros");
        }
        System.out.println("fim");

    }
}
