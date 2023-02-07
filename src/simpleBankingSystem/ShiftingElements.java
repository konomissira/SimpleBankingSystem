package simpleBankingSystem;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        numbers[0] = scanner.nextInt();

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
