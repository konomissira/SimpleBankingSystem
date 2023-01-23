package simpleBankingSystem;

import java.util.Scanner;

public class SmartHomeSystem {
    int password;
    String speakersState;
    String lampState;
    String doorState;
    public SmartHomeSystem(String speakersState, String lampState, String doorState, int password) {
        this.speakersState = speakersState;
        this.lampState = lampState;
        this.doorState = doorState;
        this.password = password;
    }

    public String getLampState() {
        return lampState;
    }

    public String getDoorState() {
        return doorState;
    }

    public String getSpeakersState(String etat) {
        return etat;
    }

    public void setSpeakersState(String speakersState) {
        this.speakersState = speakersState;
    }

    public static int checkPassword(int password) {
            return password;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartHomeSystem smartHomeSystem = new SmartHomeSystem("speaker", "lamp", "door", 76543210 );
        System.out.println("Enter password: ");
        int passwordInput = scanner.nextInt();
        if (passwordInput != checkPassword(76543210)) {
            System.out.println("Incorrect password!!!");
        } else {
            System.out.println("Choose the object: 1 - speakers, 2 - lamp, 3 - door");
            String action = scanner.next();

            switch (action) {
                case "1" :
                    switch (smartHomeSystem.getSpeakersState("on")) {
                        case "on" :
                            System.out.println("on");
                        case "off" :
                            System.out.println("off");
                        default:
                            //...
                    }
                    break;
                case "2" :
                    System.out.println("What about lights????");
                    break;
                case "3" :
                    System.out.println("What about the door???");
                default:
                    System.out.println("Thanks");
            }
        }
    }
}
