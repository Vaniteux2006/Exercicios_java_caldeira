import java.util.Scanner;

public class exercise_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite seu salário mensal em reais: ");
        double salario = scanner.nextDouble();
        scanner.close();
    
        if (idade >= 18 && salario >= 2000.0) {
            System.out.println("Você pode comprar um carro.");
        } else {
            System.out.println("Você não pode comprar um carro.");
        }
    }
}

//Notas de programador:
// Se ver um erro, não toque, é uma característica não documentada :P

