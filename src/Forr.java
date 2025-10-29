import java.util.Scanner;

public class Forr {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaAvaliacao = 0;

        System.out.println("Digite a quantidade de notas: ");
        int numeroNotas = leitura.nextInt();


        for ( int count = 1; count <= numeroNotas ; count++) {
        System.out.println("Digite sua nota: ");
        nota = leitura.nextDouble();
        mediaAvaliacao += nota;
        }

        System.out.println("A média das " + numeroNotas + "Avaliações é:" + (mediaAvaliacao/numeroNotas));
    }
}
