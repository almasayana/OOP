package practice1;
import java.util.Scanner;


public class fourth	 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println("Enter a: ");
	     double a = in.nextDouble();
	     
	     System.out.println("Enter b: ");
	     double b = in.nextDouble();
	     
	     System.out.print("Enter c: ");
	     double c = in.nextDouble();
	     
	     double discriminant = b * b - 4 * a * c;

	        if (discriminant < 0) {
	            System.out.println("Error: Discriminant is negative. No real roots.");
	        }
	        else if (discriminant == 0){
	        	double x = -b/2*a;
	        	System.out.println(x);
	        }else {
	            double sqrtD = Math.sqrt(discriminant);
	            double x1 = (-b + sqrtD) / (2 * a);
	            double x2 = (-b - sqrtD) / (2 * a);

	            System.out.println("Root 1: " + x1);
	            System.out.println("Root 2: " + x2);
	        }
	     

	     in.close();
	}

}
