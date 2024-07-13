import java.util.Random;
import java.util.Scanner;

public class NumeroRandom {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
         int numero= new Random().nextInt(10);
         int valor=-1;
         int tentativa = 0;
        while (numero != valor) {
            System.out.println("Advinhe o valor sorteado:");
            valor = leitura.nextInt();
            tentativa++;
            if (numero != valor){
                System.out.println("Tente novamente!");
            }else {
                System.out.println("Parabens você Acetou!");
                break;
            }
        }
        System.out.println("Tentativas: "+tentativa);
        leitura.close();
    }
}
