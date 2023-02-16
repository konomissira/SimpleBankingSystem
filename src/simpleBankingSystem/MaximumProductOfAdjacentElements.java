package simpleBankingSystem;

import java.util.*;

public class MaximumProductOfAdjacentElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int [] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int maxProduct = array[0] * array[1];

        for (int i = 0; i < length - 1; i++) {
            int product = array[i] * array[i + 1];
            if (product > maxProduct) {
                maxProduct = product;
            }
            i++;
        }
        System.out.println(maxProduct);
    }
}
