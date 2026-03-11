package problem1.cpart;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<TaxiDriver> drivers = new HashSet<>();

		drivers.add(new TaxiDeluxe("Kim Do-gi", 1, "Revenge"));
	    drivers.add(new TaxiDeluxe("Kim Do-gi", 1, "Revenge"));
	    drivers.add(new TaxiDeluxe("Ahn Go-eun", 2, "Hacking support"));
	    
	    System.out.println("Number of drivers in set: " + drivers.size());
	    
	    for (TaxiDriver d : drivers) {
            System.out.println(d);
        }
	}

}
