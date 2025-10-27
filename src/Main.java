public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick  ");

        int ano = 2022;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = false;
        double otaFilme = 8.11111;

        // Media calculada pelas 3 notas do filme topgun
        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme: Top Gun
                Filme de aventura com galã dos anos 80
                Muito Bom!
                Ano de Lançamento
                """ + ano ;
        System.out.println(sinopse);

        int clasificacao;
        clasificacao = (int) (media/2); // Converte o double para int
        System.out.println(clasificacao );

    }
}
