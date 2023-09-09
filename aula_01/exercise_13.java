import java.util.Scanner;

public class exercise_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro entre 1 a 20 e saiba seu fatorial:");
        long numero = scanner.nextInt();
        scanner.close();

        // Verifique se o número é não negativo
        if (numero < 0 || numero > 20) {
            System.out.println("O fatorial não pode ser menor que 0 porque não faz sentido calcular o fatorial de números negativos e não pode ser maior que 20 devido a limitação do Java");
        } else {
            // Calcule o fatorial do número
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            // Exiba o resultado
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}

//Notas do programador:
//Acabou o café :(
//nem usando o long o java conseguia computar valores maior que 21!, e foi uma dorzinha de cabeça pra conseguir viu