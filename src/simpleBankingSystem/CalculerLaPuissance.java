package simpleBankingSystem;

import java.util.Scanner;

public class CalculerLaPuissance {

    public static void main(String[] args) {
        faireLaPuissance();
    }

    public static void faireLaPuissance () {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Type two integers.");
        double x = scanner.nextInt();
        double y = scanner.nextInt();
        double power = Math.pow(x, y);
        System.out.println(power);
    }
}
