
package college.app;
import college.model.Student;
import college.model.InvalidStudentDataException;
public class week7lab {    public static void main(String[] args) {
        String[] marks = {"85", "abc", "150"};
        for (String value : marks) {
           try {
                int mark = Integer.parseInt(value);
               Student s = new Student("Harshit Singh");
              s.setMark(mark);
               System.out.println("Student: " + s);
            }
        catch (NumberFormatException e) {
                System.out.println("Error: Please enter a number");
            }
          catch (InvalidStudentDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
            finally {
            System.out.println("Validation attempt complete");
            }
            System.out.println();       
        }
    }
}
