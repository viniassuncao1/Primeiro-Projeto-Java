import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme preferido: ");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento: ");
        int  anoDeLancamento = leitura.nextInt();
/*        System.out.println(filme);
        System.out.println(anoDeLancamento);*/
        System.out.println("Digite sua nota: ");
        double nota = leitura.nextDouble();
        System.out.println(String.format("Seu filme preferido é %s e o ano de lançamento dele é: %d, e a nota que você deu é: %.2f", filme, anoDeLancamento, nota));


    }


}
