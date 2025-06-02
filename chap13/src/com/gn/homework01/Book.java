package com.gn.homework01;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private String category;
	private int price;
	
	
	
	public Book(){
		
	}
	
	public Book(String title, String author, String category, int price) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setCategory(category);
		this.setPrice(price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return title+"("+author+"), "+category+", "+price;
	}

	@Override
	public int compareTo(Book o) {
		
		return this.title.compareTo(o.title);
	}
}
