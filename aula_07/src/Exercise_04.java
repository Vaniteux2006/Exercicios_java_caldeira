import java.util.*;

interface Calculavel {
    int adicionar(int a, int b);
    int subtrair(int a, int b);
    int multiplicar(int a, int b);
    double dividir(int a, int b) throws ArithmeticException;
}
class Calculadora implements Calculavel {
    @Override
    public int adicionar(int a, int b) {
        return a + b;
    }

    @Override
    public int subtrair(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

    @Override
    public double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        return (double) a / b;
    }
}

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            System.out.print("Escolha a operação (ADICAO, SUBTRACAO, MULTIPLICACAO, DIVISAO): ");
            String operacao = scanner.next().toUpperCase();

            Calculadora calculadora = new Calculadora();

            int resultado = 0;

            switch (operacao) {
                case "ADICAO":
                    resultado = calculadora.adicionar(numero1, numero2);
                    break;
                case "SUBTRACAO":
                    resultado = calculadora.subtrair(numero1, numero2);
                    break;
                case "MULTIPLICACAO":
                    resultado = calculadora.multiplicar(numero1, numero2);
                    break;
                case "DIVISAO":
                    try {
                        double divisao = calculadora.dividir(numero1, numero2);
                        System.out.println("Resultado da divisão: " + divisao);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Operação inválida. Escolha uma operação válida.");
                    break;
            }

            if (!operacao.equals("DIVISAO")) {
                System.out.println("Resultado: " + resultado);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira números inteiros válidos.");
        } finally {
            scanner.close();
        }
    }
}