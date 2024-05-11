import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o Número da Conta: ");
        while (!scanner.hasNextInt()){
            System.out.println("Número inválido! Digite novamente: ");
            scanner.next();
            
        }
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o Nome do Cliente: ");
        String nomeDoCliente = scanner.nextLine();

        System.out.print("Digite o Saldo:");
        while (!scanner.hasNextBigDecimal()) {
            System.out.println("Saldo inválido! Digite novamente: ");
            scanner.next();
        }
        BigDecimal saldo = scanner.nextBigDecimal();
        scanner.nextLine();  

        DadosBancarios dadosBancarios = new DadosBancarios(numeroDaConta, agencia, nomeDoCliente, saldo);

        System.out.printf("Olá, %s! Obrigado(a) por criar uma conta em nosso banco. " + "Sua agência é: %s, a conta:  %d e seu saldo é de: %.2f. Inclusive já está disponível para saque.%n",
            dadosBancarios.getNomeDoCliente(), dadosBancarios.getAgencia(), dadosBancarios.getNumeroDaConta(), dadosBancarios.getSaldo());
    }
}
