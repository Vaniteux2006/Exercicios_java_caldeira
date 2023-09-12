import java.util.Scanner;

public class exercise_01 {
    private static boolean ehPrimo(int number) {
        if (number == 0 || number == 1) {
            return false;
        }

        for (int j = 2; j < number; j++) {
            if (number % j == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Bem vindo ao listador de Numeros Primo!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para comecar um intervalo");
        int startNumero = scanner.nextInt();

        System.out.println("Agora digite um numero para encerrar o intervalo");
        int finalNumero = scanner.nextInt();
        scanner.close();

        for (int i = startNumero; i < finalNumero; i++) {
            if (ehPrimo(i) == true) {
                System.out.println(i + " eh primo");
            }
        }

    }

}
// Notas do programador:
// Feito durante o curso Geracao Caldeira :)
// consegui resumir um codigo mais complexo que vi aq