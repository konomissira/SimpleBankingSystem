package simpleBankingSystem;

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number != 1) {
            System.out.println(number + " ");

            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = (number * 3) + 1;
            }
        }
        System.out.println(number + " ");
    }
}
