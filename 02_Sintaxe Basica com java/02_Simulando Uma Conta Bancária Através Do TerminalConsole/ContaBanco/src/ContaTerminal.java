import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para nosso Usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número de sua agência");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número de sua conta");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o valor que gostaria de depositar");
        double deposito = scanner.nextDouble();

        double saldo = 0;
        saldo = saldo + deposito;

        //"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque");



        //Exibir a mensagem conta criada
    }
}
