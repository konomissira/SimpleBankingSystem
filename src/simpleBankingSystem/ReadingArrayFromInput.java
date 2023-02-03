package simpleBankingSystem;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingArrayFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] myArray = new int[length];
        //System.out.println(Arrays.toString(myArray));
        for (int i = 0; i <= myArray.length; i++) {
            myArray[i] = scanner.nextInt();
            System.out.println(Arrays.toString(myArray));
        }
    }
}
