package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
//        analisarCandidato(1900.0);
//        analisarCandidato(2200.0);
//        analisarCandidato(2000.0);
//        selecaoCandidatos();
//        imprimirSelecionados();

        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        }while (continuarTentando && tentativasRealizadas<3);

        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        }else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas);
        }
    }


    //MÉTODO AUXILIAR PARA O CASE 4
    static boolean atender(){
        return new Random().nextInt(3)==1; //ESTOU SIMULANDO ATRAVÉS DE UMA ESPRESSÃO RANDOMICA UMA LIGAÇÃO SE O VALOR ENTRE 1 E 3 FOR IGUAL A 1 ELE ATENDEU, DOU CONTRARIO NÃO FOI ATENDIDO E VAI FICAR TENTANDO
    }

    //CASE 3
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº" + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println(" ");
        System.out.println("Forma abreviada de interação for each");

        for (String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }


    //CASE 2
    static void selecaoCandidatos(){

        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0; // INDICE PARA O ARRAY
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){ // candidatosSelecionados < 5 && candidatosAtual MENOR QUE MINHA LISTA. CASO NÃO ADICIONE ESTA CONDIÇÃO "&& candidatosAtual < candidatos.length", ENTÃO PODE QUE NÃO TERMINE DE SELECIONAR OS CANDIDATOS, POIS PASSE POR TODOS OS 10 CANDIDATOS NO ARRAY E ASSIM VEM ERRO, LEMBRE-SE QUE "valorPretendido()" ADCIONA UMA CONDIÇÃO DE ALAÓTERIEDADE AOS SALARIOS DOS CANDIDATOS
            String candidato = candidatos[candidatosAtual]; //CRIANDO UMA VARIAVEL QUE PARA ESTANCIAR O ARRAY E ESTABELECER candidatosAtual COM INDICE
            double salarioPretendido = valorPretendido(); //CRIANDO UMA VARIAVEL QUE PARA ESTANCIAR valorPretendido

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido );
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    //CASE 2
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200); //VALOR ALEATÓRIO ENTRE R$1800 E R$2200
    }

    //CASE 1
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase==salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
