import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu filme preferido: ");
        String filme = leitura.nextLine();
        System.out.print("Digite o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();
        System.out.print("Digite sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println("Filme: " + filme);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Avaliação: " + avaliacao);

        leitura.close();
    }
}
