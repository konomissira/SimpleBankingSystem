package simpleBankingSystem;

public class Human {
    String name;
    int age;

    public static void averageWorking() {
        System.out.println("An average human works 40 hours a week");

    }

    public void work() {
        System.out.println(this.name + " Loves working!");
    }

    public void workTogetherWith(Human other) {
        System.out.println(this.name + " loves working with " + other.name + "!");
    }

    public static void main(String [] args) {
        Human.averageWorking();

        Human peter = new Human();
        peter.name = "Peter";
        peter.work();

        Human alice = new Human();
        alice.name = "Alice";
        alice.work();

        peter.workTogetherWith(alice);
    }
}
