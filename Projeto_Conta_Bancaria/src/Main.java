import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String cliente = "nicollas";
        String conta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;
        double valor = 0;
        System.out.println("**********************");
        System.out.println("Dados Do Cliente:");
        System.out.println("Nome do Cliente:" + cliente);
        System.out.println("Tipo de conta:" + conta);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("**********************");
        String menu = """
                Digite:
                1)Consultar saldo
                2)Para receber saldo
                3)Tranferir saldo
                4)Para sair
                """;
        while (opcao != 4) {
            System.out.print(menu);
            opcao = leitura.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Seu saldo: R$" + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que vai receber: R$");
                    valor = leitura.nextDouble();
                    saldo += valor;
                    break;
                    case 3:
                        System.out.println("Seu saldo: R$" + saldo);
                        System.out.println("Digite o valor que vai transferir: R$");
                        valor = leitura.nextDouble();
                        if (valor <= saldo){
                            saldo -= valor;
                        }else {
                            System.out.println("Valor insuficiente!");
                        }
                        break;
                        case 4:
                            System.out.println("Saindo...");
                            break;
            }
        }
    }
}