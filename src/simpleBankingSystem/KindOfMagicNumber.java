package simpleBankingSystem;

import java.util.Scanner;

public class KindOfMagicNumber {
    public static void main(String[] args) {
        int magic = 0;
        int n = 893939;
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        while (n > 0) {
            n /= 10;
            magic++;
        }
        System.out.println(magic);
    }
}
