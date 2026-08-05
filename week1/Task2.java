import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));
        System.out.println("Quotient = " + (a / b));
        System.out.println("Remainder = " + (a % b));

        input.close();
    }
}