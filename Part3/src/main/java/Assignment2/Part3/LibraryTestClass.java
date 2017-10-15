package Assignment2.Part3;

import junit.framework.TestCase;

public class LibraryTestClass extends TestCase {
	
	LibraryClass testLibrary;
	Book testBook;

	protected void setUp() throws Exception 
	{
		testLibrary = new LibraryClass();
		testBook = new Book("Alice In Wonderland", 9781533345455L);
	}

	protected void tearDown() throws Exception 
	{
		testLibrary = null;
		testBook = null;
	}
	
	public void testAddBook()
	{
		testLibrary.addBook(testBook);
		assertEquals("Alice In Wonderland", testLibrary.getBook("Alice In Wonderland").getBookName());
		assertEquals(9781533345455L, testLibrary.getBook(9781533345455L).getISBN());
	}

}
