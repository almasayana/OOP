package problem1.bpart;

public class Book extends LibraryItem {
	private int numberOfPages;
	public Book(String title, String author, int year, int pages) {
		super(title, author, year);
		this.setNumberOfPages(pages);
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	public void displayInfo() {
        System.out.println("Book: " + super.getTitle() + " by " + super.getAuthor());
    }
	
	public boolean isLongBook() {
        return numberOfPages > 400;
    }
}
