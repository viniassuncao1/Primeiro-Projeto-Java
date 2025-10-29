public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";


        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos que os clientes estão curtindo");
        } else {
            System.out.println("Filme retro que vale a pena assitir");
        }

        if (incluidoNoPlano || tipoPlano.equalsIgnoreCase("Plus")) {
            System.out.println("Incluido no plano");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
