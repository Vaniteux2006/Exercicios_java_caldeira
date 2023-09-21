import java.util.Scanner;
import static java.util.Arrays.stream;

public class exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("good morning my dear user, please put some numbers here, like 5 numbers. i will do some magic if don't care:");

        double[] list = new double[5];

        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println("the sum of all numbers that you put is " + stream(list).sum());
        System.out.println("the average is " + stream(list).average().getAsDouble());

        scanner.close();
    }
}


