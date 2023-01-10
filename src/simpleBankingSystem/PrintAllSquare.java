package simpleBankingSystem;

import java.util.Scanner;

public class PrintAllSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1;i <= n; i++) {
            int square = i * i;
            //System.out.println(square);
            if (square <= n) {
                System.out.println(square);
            }
        }
    }
}
