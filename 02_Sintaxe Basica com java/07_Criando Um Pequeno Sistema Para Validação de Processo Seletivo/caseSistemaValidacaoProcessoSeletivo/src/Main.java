/*
Vamos explorar alguns outros cenários com fluxo condicionais,
 repetições e expecionais.

CASE 1: Vamos imaginar que em um processo seletivo existe o
 valor base salarial de R$2.000,00 e o salário pretentido pelo
 candidato. Vamos elaborar um controle de fluxo onde:

 - Se o valor salario base for maior que valor salario pretentido,
 imprima: LIGAR PARA O CANDIDATO;

 - Senão Se o valor salario base for igual ao valor salario pretentido,
 imprima: LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA;

 - Senão imprima: AGUARDANDO RESULTADO DEMAIS CANDIDATOS

CASE 2: Foi solicitado que nosso sistema garanta que diante das inumeras
 candidaturas sejam selecionados apenas no máximo 5 candidatos para entrevista
 onde o salário pretendido seja menor ou igual ao salário base.

// Método que simula o valor pretendido
import java.util.concurrent.ThreadLocalRandom;
static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
}

CASE 3: Agora é hora imprimir a lista dos candidatos selecionados
 para disponibilizar para o RH entrar em contato.

CASE 4: O RH deverá realizar uma ligação com o máximo 03 tentativas
 para cada candidato selecionado e caso o candidato atenda, deve-se imprimir:

 - "CONSEGUIMOS CONTATO COM [CANDIDATO] APÓS [TENTATIVA]
    TENTATIVAS(S)"

 - do contrário imprima:"NÃO CONSEGUIMOS CONTATO COM O
   [CANDIDATO]"




 */


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}