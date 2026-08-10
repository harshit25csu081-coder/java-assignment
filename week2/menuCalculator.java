import java.util.Scanner;

public class MenuCalculator {

    static void printMenu() {
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
    }

    static int readChoice(Scanner input) {
        int choice;

        do {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice < 0 || choice > 4) {
                System.out.println("Invalid choice");
            }

        } while (choice < 0 || choice > 4);

        return choice;
    }

    static double calculate(int choice, double first, double second) {

        switch (choice) {
            case 1:
                return first + second;

            case 2:
                return first - second;

            case 3:
                return first * second;

            case 4:
                return first / second;

            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = readChoice(input);

            if (choice != 0) {
                System.out.print("Enter first number: ");
                double first = input.nextDouble();

                System.out.print("Enter second number: ");
                double second = input.nextDouble();

                if (choice == 4 && second == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    double result = calculate(choice, first, second);
                    System.out.println("Result = " + result);
                }
            }

        } while (choice != 0);

        System.out.println("Calculator ended.");
        input.close();
    }
}
