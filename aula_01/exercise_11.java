import java.util.Scanner;

public class exercise_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine().toLowerCase(); 
        scanner.close();
        
        int contadorVogais = 0;
        for (int i = 0; i < entrada.length(); i++) {
            char caractere = entrada.charAt(i);
             if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
         }
        System.out.println("O número de vogais na palavra ou frase é: " + contadorVogais);
    }
}

//Notas de programador:
// Por enquanto este foi o código mais complexo e difícil para mim, tive que pedir muita ajuda para resolver ;-;
// Ele passa por caracter a caracter da palavra/frase verificndo se tem vogal ou não, salvando no "contadorVogais"
// Se você entender isso, por favor depois me explique.
