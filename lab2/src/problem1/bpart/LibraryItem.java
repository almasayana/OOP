package problem1.bpart;

public abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;
	
	public LibraryItem(String title, String author, int publicationYear){
		this.setTitle(title);
		this.setAuthor(author);
		this.setPublicationYear(publicationYear);
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	@Override
	public String toString() {
	return "Title's name: " + title + ", author: " + author + ", publication year: " + publicationYear;
	}
	
}
