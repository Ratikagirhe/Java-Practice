import java.util.Scanner;

public class SimpleCalculator {

    static int add(int number1, int number2) {
        return number1 + number2;
    }

    static int sub(int number1, int number2) {
        if (number2 > number1) {
            System.out.println("Cannot subtract " + number2 + " from " + number1);
        }
        return number1 - number2;
    }

    static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    static int divide(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Cannot divide by 0");
            return 0; // Returning 0 in case of division by 0
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        String operation;
        int firstNumber;
        int secondNumber;
        String again;

        do {
            System.out.println("Enter an operation (+, -, *, /): ");
            operation = scanner.next();

            System.out.println("Enter the first number: ");
            firstNumber = scanner.nextInt();

            System.out.println("Enter the second number: ");
            secondNumber = scanner.nextInt();

            switch (operation.trim()) {
                case "+":
                    result = add(firstNumber, secondNumber);
                    break;
                case "-":
                    result = sub(firstNumber, secondNumber);
                    break;
                case "*":
                    result = multiply(firstNumber, secondNumber);
                    break;
                case "/":
                    result = divide(firstNumber, secondNumber);
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }

            String showResult = String.format("Result is: %d %s %d = %d", firstNumber, operation, secondNumber, result);
            System.out.println(showResult);

            System.out.println("Would you like to perform another calculation? (y/n)");
            again = scanner.next();

        } while (again.equals("y"));

        scanner.close();
    }
}
