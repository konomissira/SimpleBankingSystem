package simpleBankingSystem;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumArrayGreaterThanValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int [] myArray = new int[arraySize];
        int sum = 0;

        for (int i = 0; i < arraySize; i++) {
            myArray[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        for (int i = 0; i < myArray.length; i++) {
           if (myArray[i] > n) {
               sum = sum + myArray[i];
           }
        }
        System.out.println(sum);
    }
}
