import college.model.InvalidStudentDataException;
import college.model.Student;
public class Week7Lab {
public static void main(String[] args) {
    Student student = new Student("  Alice  ");
    String[] marks = {"85", "abc", "125"};
    for (String value : marks) {
        try {
            System.out.println("Trying mark: " + value);
            int mark = Integer.parseInt(value);
            student.setMark(mark);
            System.out.println("Valid mark: " + student);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + value + "' is not a valid number.");
        } catch (InvalidStudentDataException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Validation attempt complete");
            System.out.println();
        }
    }
}
}
