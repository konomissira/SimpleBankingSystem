package simpleBankingSystem;

import java.util.Scanner;

public class HarryPotterHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String house = scanner.nextLine();

        //System.out.println(house);
        switch (house) {
            case "gryffindor" :
                System.out.println("bravery");
                break;
            case "hufflepuff" :
                System.out.println("loyalty");
                break;
            case "slytherin" :
                System.out.println("cunning");
                break;
            case "ravenclaw" :
                System.out.println("intellect");
                break;
            default:
                System.out.println("not a valid house");
        }
    }
}
