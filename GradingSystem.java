
import java.util.Scanner;

public class GradingSystem {

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        String Grade = classifyMarks(marks);

        System.out.print("Enter your grade: " + Grade);

        input.close();
    }

    public String classifyMarks(int marks) {
        if (marks < 0 || marks > 100) {
            return "Invalid choice";
        } else if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

    