package aula_02;
import java.util.Scanner;

public class exercise_05 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma palavra ou frase: ");
            String entrada = scanner.nextLine();
            scanner.close();
    
            int comprimento = entrada.length();
    
            if (comprimento % 2 == 0) {
                // Se o comprimento da string for par
                String primeiraMetade = entrada.substring(0, comprimento / 2);
                System.out.println("A primeira metade é: " + primeiraMetade);
            } else {
                // Se o comprimento da string for ímpar
                String primeiraMetade = entrada.substring(0, (comprimento / 2) + 1);
                System.out.println("A primeira metade é: " + primeiraMetade);
            }
    }
}
