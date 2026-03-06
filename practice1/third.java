package practice1;
import java.util.Scanner;

public class third {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        double a = in.nextDouble();

        if (a > 100 || a < 0) {
            System.out.println("Invalid grade");
        } else if (a >= 94.5) {
            System.out.println("Your grade is A");
        } else if (a >= 89.5) {
            System.out.println("Your grade is A-");
        } else if (a >= 84.5) {
            System.out.println("Your grade is B+");
        } else if (a >= 79.5) {
            System.out.println("Your grade is B");
        } else if (a >= 74.5) {
            System.out.println("Your grade is B-");
        } else if (a >= 69.5) {
            System.out.println("Your grade is C+");
        } else if (a >= 64.5) {
            System.out.println("Your grade is C");
        } else if (a >= 59.5) {
            System.out.println("Your grade is C-");
        } else if (a >= 54.5) {
            System.out.println("Your grade is D+");
        } else if (a >= 49.5) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }

        in.close();
    }
}
