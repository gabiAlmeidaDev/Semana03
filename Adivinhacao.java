import java.util.Scanner;
import java.util.Random;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(1000) + 1;
        int palpite;
        int tentativas = 0;
        final int MAX_TENTATIVAS = 10;
        boolean acertou = false;

        System.out.println("|**********************************************************|");
        System.out.println("Vamos ver se consegue adivinhar o número que estou pensando!");
        System.out.println("------------------- Está entre 1 e 1000 -------------------");

        while (tentativas < MAX_TENTATIVAS && !acertou) {
            System.out.print("Digite o número pra vermos se acerta (Tentativa " + (tentativas + 1) + " de " + MAX_TENTATIVAS + "): ");
            palpite = teclado.nextInt();
            tentativas++;

            if (palpite == numeroAleatorio) {
                acertou = true;
                System.out.println("Parabéns! Você acertou! O número era " + numeroAleatorio);
            } else if (palpite > numeroAleatorio) {
                System.out.println("Errou! Tente um número menor.");
            } else {
                System.out.println("Errou! Tente um número maior.");
            }
        }

        if (!acertou) {
            System.out.println("Que pena! Você atingiu o limite de tentativas! O número era: " + numeroAleatorio);
        }

        teclado.close();
    }
}

