package HomeworkSeven;

public class Main {
    public static void main(String[] args) {
        ComplexCalculator calculator = new ComplexCalculator();
        ComplexNumber c1 = new ComplexNumber(3.0, 5.0);
        ComplexNumber c2 = new ComplexNumber(24.0, 70.0);

        ComplexNumber sum = calculator.calculate("+", c1, c2);
        ComplexNumber sub = calculator.calculate("-", c1, c2);
        ComplexNumber multiply = calculator.calculate("*", c1, c2);
        ComplexNumber division = calculator.calculate("/", c1, c2);

        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);
        System.out.println("Multiply " + multiply);
        System.out.println("Division " + division);
        }
    }

