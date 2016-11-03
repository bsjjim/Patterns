package com.patterns.test.iterator;

public class BookShelf implements Aggregate {
	
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	
	public Book getBookAt(int index) {
		return books[index];		
	}
	
	public void appendBook(String book) {
		books[last] = new Book(book);
		last++;
	}
	
	public int getLength() {
		return books.length;
	}	
	
	@Override
	public Iterator iterator(){
		return new BookShelfIterator(this);
	}

}
