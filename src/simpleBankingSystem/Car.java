package simpleBankingSystem;

public class Car {
    int yearModel;
    String make;
    int speed;

    public Car(int yearModel, String make, int speed) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = speed;
    }

    public void accelerate() {
        this.speed += 5;
        System.out.println(this.speed);
    }

    public void brake() {
        if (this.speed > 5) {
            this.speed -= 5;
        } else {
            this.speed = 0;
        }

        System.out.println(this.speed);
    }

    public static void main(String[] args) {
        Car car = new Car(2005, "Peugeot", 50);
        Car car1 = new Car(2001, "Golf Polo", 90);

        System.out.println();

        System.out.println("En ville");
        car.accelerate();
        car.brake();

        System.out.println();

        System.out.println("Route departementale");
        car1.accelerate();
        car1.brake();
    }
}
