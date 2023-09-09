import java.util.Scanner;
import java.text.DecimalFormat;

public class exercise_4 {
    public static void main(String[] args) {
        double salarioMinimo = 1320.0; 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();
        scanner.close();
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
        DecimalFormat df = new DecimalFormat("#.##");

        String resultadoFormatado = df.format(quantidadeSalariosMinimos);
        System.out.println("O usuário ganha aproximadamente " + resultadoFormatado + " salários mínimos.");
    }
}

// Notas de programador:
// Maior descoberta que tive agora foi esses "import", vejo que vou usar muito o Scanner para fazer "joguinhos" nos terminais, diferente desse decimal q juro que vai ser a última vez.
// pode ser meio desinteressante apenas colocar valores prontos e rezar para que dê certo só em 1 caso;