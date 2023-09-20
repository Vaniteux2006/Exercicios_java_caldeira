package aula_03;

import java.util.Scanner;

public class exercise_02 {
    public static void main(String[] args) {
        // Crie uma instância da classe Circulo
        Circulo meuCirculo = new Circulo();
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equals("s") || continuar.equals("S")) {
            System.out.println("Defina um raio:");
            double raio = scanner.nextDouble();
            scanner.nextLine(); // Consumir o caractere de quebra de linha

            // Defina o raio do círculo
            meuCirculo.definirRaio(raio);

            // Calcule a circunferência e a área
            double circunferencia = meuCirculo.calcularCircunferencia();
            double area = meuCirculo.calcularArea();

            // Imprima os resultados
            System.out.println("Circunferência: " + String.format("%.1f", circunferencia) + "m²");
            System.out.println("Área: " + String.format("%.1f", area) + "m²");

            System.out.println("Deseja começar de novo? S/N (Atenção, qualquer coisa que não for 'S' irá desligar o programa.)");
            continuar = scanner.nextLine();
        } 

        scanner.close();
    }
}

class Circulo {
    double raio;

    double calcularCircunferencia() {
        return 2.0 * Math.PI * raio;
    }

    double calcularArea() {
        return Math.PI * raio * raio;
    }

    void definirRaio(double raio) {
        if (raio < 0) {
            System.out.println("Impossível raio negativo. Raio definido para 1");
            raio = 1;
        }
        this.raio = raio;
    }
}
