import java.util.Scanner;

public class BitMaskUtility {

    static boolean isBitSet(int n, int p) {
        return (n & (1 << p)) != 0;
    }

    static int setBit(int n, int p) {
        return n | (1 << p);
    }

    static int clearBit(int n, int p) {
        return n & ~(1 << p);
    }

    static int toggleBit(int n, int p) {
        return n ^ (1 << p);
    }

    static String toBinary32(int n) {
        String s = Integer.toBinaryString(n);

        while (s.length() < 32)
            s = "0" + s;

        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Check");
        System.out.println("2. Set");
        System.out.println("3. Clear");
        System.out.println("4. Toggle");

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter position (0-31): ");
        int p = sc.nextInt();

        if (p < 0 || p > 31) {
            System.out.println("Invalid position");
            return;
        }

        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        System.out.println("Before: " + n);
        System.out.println(toBinary32(n));

        if (ch == 1) {
            System.out.println("Bit is set: " + isBitSet(n, p));
        } 
        else if (ch == 2) {
            n = setBit(n, p);
        } 
        else if (ch == 3) {
            n = clearBit(n, p);
        } 
        else if (ch == 4) {
            n = toggleBit(n, p);
        } 
        else {
            System.out.println("Invalid choice");
            return;
        }

        if (ch != 1) {
            System.out.println("After: " + n);
            System.out.println(toBinary32(n));
        }

        sc.close();
    }
}
