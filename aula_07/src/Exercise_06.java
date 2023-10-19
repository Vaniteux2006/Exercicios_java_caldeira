import java.util.Scanner;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Você não pode sacar mais do que o saldo disponível.");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo inicial da conta bancária: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial);

        System.out.print("Digite o valor que deseja sacar: ");
        double valorSaque = scanner.nextDouble();

        try {
            conta.sacar(valorSaque);
            System.out.println("Saque de " + valorSaque + " realizado com sucesso.");
            System.out.println("Saldo restante: " + conta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}