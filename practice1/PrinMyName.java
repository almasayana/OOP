package practice1;
import java.util.Scanner;
public class PrinMyName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Your name: ");
		String name = in.nextLine();
		System.out.println("+--+");
		System.out.println("|" + name + "|" );
		System.out.println("+--+");
		in.close();
	}

}
