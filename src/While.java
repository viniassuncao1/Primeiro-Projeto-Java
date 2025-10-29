import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaAvaliacao = 0;
        int totalNotas = 0;


        while ( nota != -1){
            System.out.println("Digite sua nota: o -1 para encerrar ");
            nota = leitura.nextDouble();
            if (nota != -1){
                mediaAvaliacao += nota;
                totalNotas++;
            }
        }

        System.out.println("A média das Avaliações é:" + (mediaAvaliacao/totalNotas));
    }
}



