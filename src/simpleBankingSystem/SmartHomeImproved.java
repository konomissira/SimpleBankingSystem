package simpleBankingSystem;

import java.util.Scanner;

public class SmartHomeImproved {
    int password = 76543210;
    String speakersState;
    String lampState;
    String doorState;

    public SmartHomeImproved(int password, String speakersState, String lampState, String doorState) {
        this.password = password;
        this. speakersState = speakersState;
        this.lampState = lampState;
        this.doorState = doorState;
    }

    public static void controlMusic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("on/off?");
        String tumbler = scanner.next();
        if (tumbler.equals("on")) {
            System.out.println("The music is on");
        } else if (tumbler.equals("off")) {
            System.out.println("The music is off");
        } else {
            System.out.println("Invalid operation");
        }
    }

    public static void controlDoor() {
        Scanner scanner = new Scanner(System.in);
        final int password = 76543210;
        System.out.println("Enter password: ");
        int passwordInput = scanner.nextInt();
        if (passwordInput == password) {
            //chooseAction();
        } else {
            System.out.println("Incorrect password!");
        }
    }

    public static void controlLight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("on/off");
        String switchOnOff = scanner.next();
        if (switchOnOff.equals("on")) {
            System.out.println("The light is on");
        } else if (switchOnOff.equals("off")) {
            System.out.println("The light is off");
        } else {
            System.out.println("Invalid operation!");
        }
    }

    public static void main(String[] args) {
        controlLight();
        controlMusic();
        controlDoor();
    }
}
