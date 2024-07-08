public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluindoNoPlano = true ;
        double media = (9.8 + 8.2 + 6.5)/3;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluindoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve Pagar a locação");
        }
    }
}
