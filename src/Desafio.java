import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Liga o input

        System.out.println("-------------JOGO DA ADIVINAÇÃO-------------");
        int numeroAleatorio = new Random().nextInt(100); //
        int palpite = 0;
        int count = 0;


        while (palpite != numeroAleatorio){
            if (count < 5){
                System.out.println("Digite seu palpite: ");
                palpite = input.nextInt();
                count++;

                if (palpite == numeroAleatorio){
                    System.out.println("Parabens voce acertou!");
                    break;
                }
                else if (palpite < numeroAleatorio){
                    System.out.println("O numero aleatorio é um numero maior");
                }
                else if (palpite > numeroAleatorio){
                    System.out.println("O numero aleatorio é um numero menor");
                }
            } else {
                System.out.println("Numero maximos de tentativas o numero aleatorio era: " + numeroAleatorio);
                break;
            }

        }
        input.close();
    }
}

