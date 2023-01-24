package simpleBankingSystem;

import java.util.Scanner;

public class FullNameMaker {
    public static String createFullName(String firstName, String lastName) {
        String myFirstName = firstName;
        String myLastName = lastName;
        String myFullName = myFirstName + " " + myLastName;

        return myFullName;
    }

    public static void main(String[] args) {
        /*System.out.println(createFullName("John", "Lennon"));
        System.out.println(createFullName("Mike", "Child"));
        System.out.println(createFullName("Georges", "Obakama"));*/

        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String surname1 = scanner.nextLine();

        System.out.println(createFullName(name1, surname1));

    }
}
