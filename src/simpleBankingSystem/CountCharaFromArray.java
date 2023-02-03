package simpleBankingSystem;

public class CountCharaFromArray {
    public static void main(String[] args) {
        char [] chars = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };
        int counter = 0;
        for (char ch: chars) {
            if (ch == 'a') {
                counter++;
            }
        }
        /*for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                counter++;
            }
        }*/
        System.out.println(counter);
    }
}
