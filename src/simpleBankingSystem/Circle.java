package simpleBankingSystem;

public class Circle {
    double radius;

    public double getLength() {
        return Math.PI * 2 * radius;
    }

    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getLength();
    }
}
