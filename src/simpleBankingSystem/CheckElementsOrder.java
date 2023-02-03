package simpleBankingSystem;

public class CheckElementsOrder {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 11, 10, 6, 7};
        boolean broken = false;

        for (int i = 1; i < numbers.length; i++) {
            /*if (numbers[i] < numbers[i -1]) {
                broken = true;
                break;
            }*/
            if (numbers[i] < numbers[i -1]) {
                System.out.println("BROKEN");
            } else {
                System.out.println("OK");
            }
        }
    }
}
