package problem1;

import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		Data d = new Data();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Enter number(Q to quit): ");
			String input = sc.nextLine();
			if(input.equals("Q")) {
				System.out.println("Average = " + d.getAverage());
				System.out.println("Maximum = " + d.getMaximum());
				break;
			}
			
			double n = Double.parseDouble(input);
            d.addValue(n);
		}
	}

}
