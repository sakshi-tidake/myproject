public class Calculator {

    // Method for addition
    public int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    // Main method to test the Calculator
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(12, 8));
        System.out.println("Subtraction: " + calc.subtract(12, 8));
        System.out.println("Multiplication: " + calc.multiply(12, 8));
        System.out.println("Division: " + calc.divide(12, 8));
    }
}
