package Assignment2.Part3;

import java.util.ArrayList;
import java.util.List;

public class LibraryClass {
	
	List<Book> LibraryBooks = new ArrayList<Book>();
	
	public void addBook(Book bookToAdd)
	{
		boolean duplicateISBN = false;
		for(int i = 0; i < LibraryBooks.size(); i++)
		{
			if(LibraryBooks.get(i).getISBN() == bookToAdd.getISBN())
			{
				duplicateISBN = true;
			}
		}
		if(!duplicateISBN)
		{	
			LibraryBooks.add(bookToAdd);
		}
		else
		{
			System.out.println("Error:A book with this ISBN allready exists!");
		}
	}
	
	public Book getBook(long ISBN)
	{
		for(int i = 0; i < LibraryBooks.size(); i++)
		{
			if(LibraryBooks.get(i).getISBN() == ISBN)
			{
				return LibraryBooks.get(i);
			}
		}
		System.out.println("Book Not Found");
		return(null);		
	}
	
	public Book getBook(String name)
	{
		for(int i = 0; i < LibraryBooks.size(); i++)
		{
			if(LibraryBooks.get(i).getBookName().equals(name))
			{return LibraryBooks.get(i);}
		}
		System.out.println("Book Not Found");
		return(null);
		
	}

}
