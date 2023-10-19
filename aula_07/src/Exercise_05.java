import java.util.*;
class IdadeInvalidaException extends RuntimeException {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class Exercise_05 {
    public static void main(String[] args) {
        try {
            int idade = pedirIdadeAoUsuario();

            if (idade < 0 || idade > 150) {
                throw new IdadeInvalidaException("Idade inválida. A idade deve estar entre 0 e 150 anos.");
            }

            System.out.println("Idade válida: " + idade);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static int pedirIdadeAoUsuario() {
        System.out.print("Digite sua idade: ");
        Scanner scanner = new Scanner(System.in);

        try {
            int idade = scanner.nextInt();
            return idade;
        } catch (InputMismatchException e) {
            throw new IdadeInvalidaException("Erro: A entrada não é um número inteiro válido.");
        }
    }
}