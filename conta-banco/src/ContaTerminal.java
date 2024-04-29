import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Double saldo = 237.48;

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        
        System.out.println("Digite seu primeiro nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Olá "+nomeCliente+" "+sobrenomeCliente+", obrigado por criar uma conta em nosso banco, " +
        "sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
 

    }
}
