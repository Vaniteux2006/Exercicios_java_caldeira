import java.util.*;
public class Exercise_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = "Y";
        while (key.equals("Y")) {
            try {
                System.out.print("Digite o primeiro número inteiro: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número inteiro: ");
                int numero2 = scanner.nextInt();

                System.out.println("Você digitou os números: " + numero1 + " e " + numero2);
                key = "n";
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira números inteiros válidos.");
            } finally {
                key = "n";
            }
            scanner.close();
        }
    }
}
