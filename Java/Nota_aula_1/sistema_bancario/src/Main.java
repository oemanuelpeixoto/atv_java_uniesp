import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Cliente destinatario = new Cliente();
        int resp;

        do {
            System.out.println("Menu:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Saldo atual: R$" + cliente.getSaldo());
                    break;
                case 2:
                    System.out.print("Informe o valor a ser depositado: R$");
                    double valorDeposito = sc.nextDouble();
                    cliente.depositar(valorDeposito);
                    System.out.println("Depósito efetuado com sucesso!");
                    break;
                case 3:
                    System.out.print("Informe o valor a ser sacado: R$");
                    double valorSaque = sc.nextDouble();
                    cliente.sacar(valorSaque);
                    break;
                case 4:
                    System.out.print("Informe o valor a ser transferido: R$");
                    double valorTransferencia = sc.nextDouble();
                    System.out.print("Informe a conta de destino: ");
                    int contaDestino = sc.nextInt();
                    cliente.transferir(destinatario, valorTransferencia);
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar nosso sistema bancário.");
                    return; // Sai do programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println("\nPara voltar ao menu digite 0, para sair digite 5");
            resp = sc.nextInt();
        } while (resp == 0);
    }
}