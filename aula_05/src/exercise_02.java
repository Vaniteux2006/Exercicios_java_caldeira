package aula_05;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class exercise_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numerosAleatorios = new int[10];
        
        for (int i = 0; i < 10; i++) {
            numerosAleatorios[i] = random.nextInt(100); 
        }

        System.out.println("Tente advinhar um dos números gerados (entre 0 e 100):");
        int numeroAdivinhar = scanner.nextInt();

        boolean numeroEncontrado = Arrays.stream(numerosAleatorios).anyMatch(n -> n == numeroAdivinhar);
        //Introduzindo: stream!
        //Descobri por acidente, mas resumindo esse código, ele vai "n" por "n" do array "numeros aleatórios" vendo se tem algum número igual (AnyMatch).
        //E é boolean, então se tiver, returna true, ou false.

        if (numeroEncontrado) {
            System.out.println("Parabéns! Você adivinhou um dos números! Veja: " + Arrays.toString(numerosAleatorios));
        } else {
            System.out.println("Você errou. Os números gerados foram: " + Arrays.toString(numerosAleatorios));
        }
        scanner.close();
    }    
}
