import java.util.Scanner;

public class exercise_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        scanner.close();

        if (idade < 16) {
            System.out.println("Você não pode votar.");
        } else if (idade >= 16 && idade <= 17) {
            System.out.println("Seu voto é facultativo.");
        } else if (idade >= 65) {
            System.out.println("Seu voto é facultativo.");
        } else {
            System.out.println("Seu voto é obrigatório.");
        }
    }
}

//Notas de programador:
// Memórias de quando programava em JavaScript... se bem que não mudou muito
