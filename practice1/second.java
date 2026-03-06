package practice1;
import java.util.Scanner;


public class second {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Side: ");

	        double a = in.nextDouble();

	        double area = a * a;
	        double perimeter = 4 * a;
	        double diagonal = a * Math.sqrt(2);

	        System.out.println("Area: " + area);
	        System.out.println("Perimeter: " + perimeter);
	        System.out.println("Diagonal: " + diagonal);
	        in.close();
	}

}
