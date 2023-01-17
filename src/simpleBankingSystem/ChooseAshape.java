package simpleBankingSystem;

import java.util.Scanner;

public class ChooseAshape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 – square");
        System.out.println("2 – circle");
        System.out.println("3 – triangle");
        System.out.println("4 – rhombus");

        System.out.println("Choose a shape by typing the number corresponding to the shape");

        int shapeNumber = scanner.nextInt();
        switch (shapeNumber) {
            case 1 :
                System.out.println("You have chosen a square");
                break;
            case 2 :
                System.out.println("You have chosen a circle");
                break;
            case 3 :
                System.out.println("You have chosen a triangle");
                break;
            case 4 :
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
        }
    }
}
