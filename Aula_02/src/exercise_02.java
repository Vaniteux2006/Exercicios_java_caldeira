import java.util.Scanner;
public class exercise_02 {
    public static void main(String[] args) {
        System.out.println("Bem vindo a FonseCar, a sua consersionaria de carros. :3  ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int age = scanner.nextInt();
        System.out.println("Digite seu salario");
        int money = scanner.nextInt();
        scanner.close();

        if ( age < 18 || money < 2000) {
            System.out.println("Nao podes comprar um carro");
        } else {
            System.out.println("podes comprar um carro");
        }
        }
    }

// Notas do programador:
// Feito durante o curso Geracao Caldeira :)
// Algumas frases nao tem assunto porque foi feito em macbook, e macbook nao tem suporte a lingua pt br
