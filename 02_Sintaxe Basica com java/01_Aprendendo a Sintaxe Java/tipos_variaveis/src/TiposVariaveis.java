public class TiposVariaveis {
    public static void main(String[] args) {
        //Os oito tipos primitivos em Java são: int, byte, short, long, float, double, boolean e char
        /*
        FAMILIA   - TIPO PRIMITIVO - WRAPPER CLASS - TAMANHO
        LÓGICA    -     boolean    -    Boolean    -  1 bit
        LITERAIS  -       char     -   Character   - 1 byte
                  -      String    -    String     - 1 byte/cada
        INTEIROS  -       byte     -     Byte      - 1 byte
                  -       short    -     Short     - 2 bytes
                  -        int     -    Integer    - 4 bytes
                  -       long     -      Long     - 8 bytes
        REAIS     -       float    -     Float     - 4 bytes
                  -      double    -     Double    - 8 bytes
         */
        String meuNome = "Jefferson";


        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal;
        short numeroCurto2 = (short) numeroNormal; // isso se chama de Cast, quando que apresenta um novo tipo para uma variavel com maior quantidade de espaço para uma menor java precisa que especifique que ciente

        int numero = 5;

        numero = 10;
        System.out.println(numero);

        /*
        Em Java,Constantes são representados pela palavra reservada -- final --, seguida do tipo.
        Por convenção, Constantes são sempre escritas em CAIXA ALTA
        Compreendemos que para declarar uma variável como uma constante, utilizamos a palavra -- final --, mas por convenção, esta variável deverá ser escrita toda em caixa alta.
         */
        final double VALOR_DE_PI = 3.14; // assim garanto que valor não vai ser alterado
    }
}