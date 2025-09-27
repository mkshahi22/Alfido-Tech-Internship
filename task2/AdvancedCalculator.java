
import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorOperations calc = new CalculatorOperations();
        boolean exit = false;

        System.out.println("===== Advanced Calculator Project =====");

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power (a^b)");
            System.out.println("6. Square Root");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            double num1, num2, result;

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter two numbers: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        result = calc.add(num1, num2);
                        System.out.println("Result: " + result);
                    }
                    case 2 -> {
                        System.out.print("Enter two numbers: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        result = calc.subtract(num1, num2);
                        System.out.println("Result: " + result);
                    }
                    case 3 -> {
                        System.out.print("Enter two numbers: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        result = calc.multiply(num1, num2);
                        System.out.println("Result: " + result);
                    }
                    case 4 -> {
                        System.out.print("Enter two numbers: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        result = calc.divide(num1, num2);
                        System.out.println("Result: " + result);
                    }
                    case 5 -> {
                        System.out.print("Enter base and exponent: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        result = calc.power(num1, num2);
                        System.out.println("Result: " + result);
                    }
                    case 6 -> {
                        System.out.print("Enter number: ");
                        num1 = sc.nextDouble();
                        result = calc.sqrt(num1);
                        System.out.println("Result: " + result);
                    }
                    case 7 -> {
                        exit = true;
                        System.out.println("Exiting Advanced Calculator. Goodbye!");
                    }
                    default ->
                        System.out.println("Invalid choice! Please select 1-7.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
