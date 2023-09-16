package aula_02;

import java.util.Scanner;

public class exercise_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String entrada = scanner.nextLine();
        scanner.close();

        String reversa = "";

        for (int i = entrada.length() - 1; i >= 0; i--) {
            reversa += entrada.charAt(i);
        }

        System.out.println("Seu nome ao contrário é: " + reversa);
    }
    
}
