package simpleBankingSystem;

public class ComplexNumber {
    double real;
    double image;

    public void add(ComplexNumber complexNumber) {
        this.real = this.real + complexNumber.real;
        this.image = this.image + complexNumber.image;
    }

    public void subtract(ComplexNumber complexNumber) {
        this.real = this.real + complexNumber.real;
        this.image = this.image + complexNumber.image;
    }

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber();
        complexNumber.real = 10;
        complexNumber.image = 4;

        ComplexNumber anotherComplexNumber = new ComplexNumber();
        anotherComplexNumber.real = 6;
        anotherComplexNumber.image = 6;

        complexNumber.add(anotherComplexNumber);
    }
}
