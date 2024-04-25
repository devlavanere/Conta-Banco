import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //Criando classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibindo mensagem para as entradas de dados
        System.out.println("Digite o nome do Cliente");
        String nome = scanner.next();

        System.out.println("Digite o número da Agência");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta");
        int numero = scanner.nextInt();

        System.out.println("Saldo do Cliente");
        double saldo = scanner.nextDouble();

        //Mensagem de conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");


    }

}

