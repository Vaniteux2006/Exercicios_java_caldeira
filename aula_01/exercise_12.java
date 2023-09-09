import java.util.Scanner;

public class exercise_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque sua quantidade em dólares do dinheiro que deseja converter: (Não use centavos)");
        double quantidadeDolares = scanner.nextDouble();

        System.out.println("Escolha a moeda para conversão:");
        System.out.println("1. Reais Brasileiros (BRL)");
        System.out.println("2. Euros (EUR)");
        System.out.println("3. Ienes Japoneses (JPY)");
        System.out.println("4. Yuan Chinês (CNY)");
        System.out.println("5. Peso Argentino (ARS)");
        System.out.println("6. Outro Valor (X)");

        System.out.println("Digite o número da moeda desejada: ");
        int opcao = scanner.nextInt();

        double valorConvertido = 0;

        switch (opcao) {
            case 1:
                valorConvertido = quantidadeDolares * 4.99;
                System.out.println("O valor convertido em Reais Brasileiros (BRL) é: R$ " + valorConvertido);
                break;
            case 2:
                valorConvertido = quantidadeDolares * 0.99;
                System.out.println("O valor convertido em Euros (EUR) é: € " + valorConvertido);
                break;
            case 3:
                valorConvertido = quantidadeDolares * 147.78;
                System.out.println("O valor convertido em Ienes Japoneses (JPY) é: ¥ " + valorConvertido);
                break;
            case 4:
                valorConvertido = quantidadeDolares * 7.34;
                System.out.println("O valor convertido em Yuan Chinês (CNY) é: ¥ " + valorConvertido);
                break;
            case 5:
                valorConvertido = quantidadeDolares * 349.28;
                System.out.println("O valor convertido em Pesos Argentinos (ARS) é: $" + valorConvertido);
                break;
            case 6:
                System.out.println("Digite a taxa de câmio da moeda desejada: (Não use centavos)");
                double cambio = scanner.nextDouble();
                valorConvertido = quantidadeDolares * cambio;
                System.out.println("O valor convertido para sua taxa é: $" + valorConvertido);
                break;
            default:
                System.out.println("X - Opção inválida! - X");
        }
        scanner.close();
    }
}

// Notas de programador:
// Foi difícil também mas dessa vez senti um pouco mais de liberdade em criar algo diferente, colocar mais moedas e quebrar um pouco minha cabeça.
// infelizmente tive que descartar os centavos, o double é estranho.
