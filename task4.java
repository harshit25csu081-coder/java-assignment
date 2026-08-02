import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        double i = p * r * t / 100;
        double a = p + i;

        System.out.println("Simple Interest = " + i);
        System.out.println("Final Amount = " + a);
    }
}