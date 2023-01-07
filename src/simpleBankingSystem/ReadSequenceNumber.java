package simpleBankingSystem;

import java.util.Scanner;

public class ReadSequenceNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNextInt()) {
            int element = scanner.nextInt();
            sum += element;
        }
        System.out.println(sum);
    }
}
