import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia = "0001-9";
        String nomeCliente;
        float saldo = 20.00f;

        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ao abrir conta voce ganhar 20 Reais");
        System.out.println("Digite 1 para criar conta e 0 para sair");
        int opcao = entrada.nextInt();
        if (opcao == 1) {
            System.out.print("Digite seu nome: ");
            entrada.nextLine();
            nomeCliente = entrada.nextLine();
            numeroConta = random.nextInt(9000) + 1000;
            System.out.println("\nConta Criada");
            System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " +
                    agencia + " conta " + numeroConta + " e seu saldo "+ saldo + " já esta disponivel");
        }
        else if (opcao == 0) {
            System.out.println("Ate logo");
        }

        else {
            System.out.println("Opcao Invalida");
        }

    }
}