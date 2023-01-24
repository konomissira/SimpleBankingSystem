package simpleBankingSystem;

import java.util.Scanner;

public class SimpleCalculator {
    public static void subtractTwoNumbers(long a, long b) {
        long num1 = a;
        long num2 = b;
        long result = num1 - num2;
        System.out.println(result);
    }

    public static void sumTwoNumbers(long a, long b) {
        long num1 = a;
        long num2 = b;
        long result = num1 + num2;
        System.out.println(result);
    }

    public static void divideTwoNumbers(long a, long b) {
        long num1 = a;
        long num2 = b;
        long result;
        if (num2 == 0) {
            System.out.println("Division by 0!");
        } else {
            result = num1 / num2;
            System.out.println(result);
        }
    }

    public static void multiplyTwoNumbers(long a, long b) {
        long num1 = a;
        long num2 = b;
        long result = num1 * num2;
        System.out.println(result);
    }

    public static void power(long n, long p) {
        long number = n;
        long power = p;
        long result = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                result *= number;
            }
            power /= 2;
            number *= number;
        }
        System.out.println(result);
    }
}