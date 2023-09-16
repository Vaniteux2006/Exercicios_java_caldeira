package aula_02;

import java.util.Scanner;

public class exercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 's';

        while (continuar == 's') {
            System.out.println("Escolha a operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            int escolha = scanner.nextInt();

            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            double resultado = 0.0;

            switch (escolha) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("Deseja continuar (s/n)? ");
            continuar = scanner.next().charAt(0);

            if (continuar != 's' && continuar != 'n') {
                System.out.println("Opção inválida. Encerrando o programa.");
                continuar = 'n';
            }
        }

        System.out.println("Obrigado pela escolha :P.");
        scanner.close();
    }
}
