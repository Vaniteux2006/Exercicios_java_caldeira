package aula_03;

import java.util.Scanner;
import java.time.LocalTime;
import java.util.Random;

public class exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 's';

        while (continuar == 's') {
            limpaTela();
            System.out.println("Escreva seu nome:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                limpaTela();
                System.out.println("Escreva seu nome:");
                name = scanner.nextLine();
            }

            System.out.println("Escreva seu CPF (Com pontuação: xxx.xxx.xxx-xx):");
            String cpf = scanner.nextLine();

            int identificadorConta = Identificador.gerarIdentificador();

            System.out.println("Escreva seu endereço:");
            String endereco = scanner.nextLine();

            System.out.println("Escreva seu banco:");
            String banco = scanner.nextLine();

            double saldo = 0.0;
            
            contaBanco novaConta = new contaBanco(name, cpf, identificadorConta, banco, endereco, saldo);

            limpaTela();
            novaConta.verificarInformacoes();

            System.out.println("Deseja continuar? s/n");
            char choise = scanner.next().charAt(0);

            if (choise == 's') {
                System.out.println(choise);
            } else {
                continuar = 'n';
            }
        }

        scanner.close();
    }

    private static void limpaTela() {
        try {
            String osName = System.getProperty("os.name").toLowerCase();

            if (osName.contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (osName.contains("mac") || osName.contains("linux")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class contaBanco {
    private String nome;
    private String cpf;
    private int identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalTime horarioAtual;

    public void verificarInformacoes() {
        System.out.println("Nome: " + nome);
        String cpfCensurado = cpf.substring(cpf.length() - 2);
        System.out.println("CPF: XXX.XXX.XXX-" + cpfCensurado);
        System.out.println("ID: " + identificadorConta);
        System.out.println("Banco: " + banco);
        System.out.println("Endereço: " + endereco);
        System.out.println("Horário criado: " + horarioAtual);
        System.out.println("Saldo: R$" + saldo);
    }

    // Construtor da classe
    public contaBanco(String nome, String cpf, int identificadorConta, String banco, String endereco, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horarioAtual = LocalTime.now();
    }

    // Outros métodos da classe podem ser adicionados conforme necessário

    public void saque(double saque) {
        if (this.saldo < saque) {
            System.out.println("Saldo Insuficiente!");
        } else {
            this.saldo = this.saldo - saque;
        }
    }

    public void deposito(double deposito) {
        this.saldo = this.saldo + deposito;
    }

}

class Identificador {
    public static int gerarIdentificador() {
        // Criar uma instância da classe Random
        Random random = new Random();

        // Gerar um número aleatório de 0 a 99999999
        int numeroAleatorio = random.nextInt(100000000);

        return numeroAleatorio;
    }
}
