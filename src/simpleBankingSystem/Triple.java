package simpleBankingSystem;

import java.util.Arrays;
import java.util.Scanner;

public class Triple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int [] array = new int[size];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if ((i + 2) < array.length && array[i + 1] - array[i] == 1 && array[i + 2] - array[i + 1] == 1) {
                counter++;
            }
        }

        /*for (int i = 0; i < array.length; i++) {
            if ((i + 2) < array.length && array[i] == array[i + 1] - 1 && array[i + 1] == array[i + 2] - 1) {
                counter++;
            }
        }*/

        /*for (int i = 0; i < array.length - 2; i++) {
            if (array[i] - array[i -1] == 1 && array[i +1] - array[i] == 1) {
                counter++;
            }
        }*/



        System.out.println(counter);
    }
}
