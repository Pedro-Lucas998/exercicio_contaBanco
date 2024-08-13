import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta");
        int numeroConta = input.nextInt();
        System.out.println("Agora, digite o número da agência");
        String numeroAgencia = input.next();
        System.out.println("Digite o seu nome");
        String nomeCliente = input.nextLine();
        System.out.println("digite o seu saldo");
        double saldoCliente = input.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, ");
        System.out.println("sua agência é " + numeroAgencia + ", conta " + numeroConta);
        System.out.println("e seu saldo " + saldoCliente + " já está disponível para saque.");
    }
}
