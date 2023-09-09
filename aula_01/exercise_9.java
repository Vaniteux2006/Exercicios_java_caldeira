import java.util.Scanner;

public class exercise_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        scanner.close();
        
        int anoAtual = 2023;
        int idade = anoAtual - anoNascimento;
        System.out.println("Você tem " + idade + " anos.");
    }
}

//Notas de programador:
//Algum dia pretendo criar um calculador de idade a partir de datas, contando dia, mês e ano, mas acho que seria desnecessáriamente complexo