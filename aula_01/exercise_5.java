import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora (0-23): ");
        int hora = scanner.nextInt();

        System.out.println("Digite os minutos (0-59): ");
        int minuto = scanner.nextInt();

        System.out.println("Digite os segundos (0-59): ");
        int segundo = scanner.nextInt();

        scanner.close();
        

        int segundosDesdeMeiaNoite = hora * 3600 + minuto * 60 + segundo;
        int segundosParaMeiaNoite = 24 * 3600 - segundosDesdeMeiaNoite;

        System.out.println("Segundos passados desde a meia-noite: " + segundosDesdeMeiaNoite + " segundos");
        System.out.println("Segundos que faltam para a meia-noite: " + segundosParaMeiaNoite + " segundos");
    }
}

//Notas de programador:
// queria fazer algo mais complexo, mas tenho que seguir o enunciado
    
