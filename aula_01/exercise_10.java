import java.util.Scanner;

public class exercise_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma temperatura em °C: ");
        double celsius = scanner.nextDouble();
        scanner.close();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Esta temperatura em graus Fahrenheit é " + fahrenheit + "°F");
    }
}

//Notas de programdor:
//não sei nem se pode usar o Scanner, mas agora não vivo sem '^'