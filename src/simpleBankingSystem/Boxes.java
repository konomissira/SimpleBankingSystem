package simpleBankingSystem;

import java.util.*;

public class Boxes {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 =  scanner.nextInt();
        int z1 = scanner.nextInt();

        int [] Box1 =  {x1, y1, z1};

        Arrays.sort(Box1);
        x1 = Box1[0];
        y1 = Box1[1];
        z1 = Box1[2];

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int z2 = scanner.nextInt();

        int [] Box2 = {x2, y2, z2};

        Arrays.sort(Box2);
        x2 = Box2[0];
        y2 = Box2[1];
        z2 = Box2[2];

        if (x1 < x2 && y1 < y2 && z1 < z2) {
            System.out.println("Box1 < Box2");
        } else if (x1 > x2 && y1 > y2 && z1 > z2) {
            System.out.println("Box1 > Box2");
        } else {
            System.out.println("Incompatible");
        }
    }
}
