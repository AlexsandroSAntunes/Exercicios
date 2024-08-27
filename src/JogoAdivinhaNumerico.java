import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhaNumerico {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        //Gerar um número aleatori de 1 a 100
        int numeroAleatorio = random.nextInt(100)+ 1;
        int tentativas = 0;
        int palpite = 0;

        System.out.println("bem-vindo ao jogo de advinhação!Tente advinhar o número.");

        //laço para continuar ate que o jogador acerte o número
        while (palpite != numeroAleatorio){
            System.out.println("digite seu palpite:");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio ){
                System.out.println("o número é maior");
            }
           else if (palpite > numeroAleatorio ){
                System.out.println("o número é menor");
            }
            else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }

        }
        scanner.close();
    }
}
