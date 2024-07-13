public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme:Top Gun:Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluindoNoPlano = true ;
        double notaDoFilme = 8.1;
        //Media calculada por 3 pessoas
        double media = (9.8 + 8.2 + 6.5)/3;
        System.out.println("Media: " + media);
        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80.
                Muitoo bomm!
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) media /2;
        System.out.println(classificacao);

    }
}