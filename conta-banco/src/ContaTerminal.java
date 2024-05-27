import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite sua conta ?");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite sua agência ?");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome ?");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome ?");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite seu saldo ?");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome + " " + sobrenome + " obrigado por criar uma conta em nosso banco, ");
        System.out.println("sua agência é " + agencia + " seu número de conta é " + conta + " e seu saldo " + saldo);
        System.out.println("já está disponível para saque.");

    }
}
