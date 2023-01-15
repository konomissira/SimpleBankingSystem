package simpleBankingSystem;

public class SimpleBreakSample {
    public static void main(String[] args) {
        int i = 10;
        while (true) {
            i--;
            if (i == 0) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
