package simpleBankingSystem;

import java.util.Arrays;

public class SwapFirstAndLastElements {
    public static void swapFirstAndLastElements(int[] nums) { // nums is an array
        if (nums.length < 1) {
            return; // it returns nothing, i.e. just exits the method
        }

        int temp = nums[nums.length - 1]; // save the last element in a temporary local variable
        nums[nums.length - 1] = nums[0];  // now, the last element becomes the first
        nums[0] = temp;                   // now, the first element becomes the former last
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 }; // numbers

        System.out.println(Arrays.toString(numbers)); // before swapping

        swapFirstAndLastElements(numbers); // swapping

        System.out.println(Arrays.toString(numbers)); // after swapping
    }
}
