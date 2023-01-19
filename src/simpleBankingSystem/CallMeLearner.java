package simpleBankingSystem;

import java.util.Scanner;

public class CallMeLearner {
    public static void main(String[] args) {
        sayMyName();
    }

    public static void sayMyName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
    }
}
