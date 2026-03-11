package problem1.bpart;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book("Taxi Driver", "Aya", 201, 300);
		b.displayInfo();
		if(b.isLongBook()) {
            System.out.println("This is a long book");
        } else {
            System.out.println("This is not a long book");
        }
	}

}
