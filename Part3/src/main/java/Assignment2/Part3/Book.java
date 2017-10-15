package Assignment2.Part3;

public class Book {
	private String BookName;
	private long ISBN;
	
	public Book(String Name, long ISBN)
	{
		this.BookName = Name;
		this.ISBN = ISBN;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

}
