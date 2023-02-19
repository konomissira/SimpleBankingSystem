package simpleBankingSystem;

public class Patient {
    String name;
    int age;
    float height;

    public Patient(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String toString() {
        return name + " has " + age + " , and is height is " + height;
    }

    public static void main(String [] args) {
        /**
         * Let's go further and create some instance of the class using the constructor
         */

        Patient patient1 = new Patient("Trey", 35, 185);
        Patient patient2 = new Patient("Artenis", 28, 165);

        System.out.println(patient1);
        System.out.println(patient2);
    }
}
