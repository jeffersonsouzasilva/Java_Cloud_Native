public class Comentarios {
    public static void main(String[] args) {
        //Ola eu um comentario em uma única linha

        /* Olá,
         * Eu sou um comentario
         * que posso ser mais detalhadod
         * quando necessário
         */
    }
    /**
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um comentário
     * a nível de documentação.
     * Que incrível !!!
     */

//    public void metodo(){
//
//    }


    /**
     *
     * @param n
     * @param x
     * @param m
     * @return
     */


    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }





}
