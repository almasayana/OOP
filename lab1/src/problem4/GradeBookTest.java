package problem4;

import practice2.Student;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course("CS101 OOP", "Intro", 3, "None");
        GradeBook gradeBook = new GradeBook(course);

        Student[] students = {
            new Student("Student A"),
            new Student("Student B"),
            new Student("Student C"),
            new Student("Student D"),
            new Student("Student E"),
            new Student("Student F"),
            new Student("Student G"),
            new Student("Student H"),
            new Student("Student I"),
            new Student("Student J"),
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input grades (0-100) or 'Q' to quit:");

        for (Student s : students) {
            System.out.print(s.getName() + ": ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            int grade = Integer.parseInt(input);
            gradeBook.addStudentGrade(s, grade);
        }

        System.out.println();
        gradeBook.displayGradeReport();
        
        scanner.close();
    }
}