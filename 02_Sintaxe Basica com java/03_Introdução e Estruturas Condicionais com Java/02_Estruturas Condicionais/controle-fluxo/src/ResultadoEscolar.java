public class ResultadoEscolar {
    public static void main(String[] args) {
        //Condicionais Composta
        /*
        int nota = 9;

        if(nota >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        */

        //Condicionais encadeadas
        /*
        int nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
        */

        //Condição ternária
        /*
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
         */

        int nota = 6;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
