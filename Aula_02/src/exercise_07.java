package aula_02;
import java.util.Scanner;

public class exercise_07 {
    public static void main(String[] args) {
        int numeroDeInimigos = 300000; // Número fixo de inimigos

        Scanner scanner = new Scanner(System.in);
        int palpite;

        System.out.println("Leônidas: ESPARTANOS! VOCÊS SABEM QUANTOS INIMIGOS ENFRENTAREMOS?!");
        System.out.println("(Digite seu palpite, um número inteiro de preferência:)");

        do {
            palpite = scanner.nextInt();

            if (palpite < numeroDeInimigos) {
                System.out.println("Leônidas: Um pouco mais!");
            } else if (palpite > numeroDeInimigos) {
                System.out.println("Leônidas: Um pouco menos!");
            } else {
                System.out.println("Leônidas: Exatamente! Enfrentaremos exatamente " + numeroDeInimigos + " inimigos!");
            }
        } while (palpite != numeroDeInimigos);

        scanner.close();
    }
}
