package simpleBankingSystem;

import java.util.Scanner;

/**
 * Write a method with the name sign() that takes an int number
 * and checks whether the number is negative, positive or zero.
 * The method should return -1, 1, or 0.
 */

public class CheckTheNumberSign {
    public static int sign(int number) {
        if (number < 0) {
            return -1;
        } else if (number > 0) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(sign(num));
    }
}
