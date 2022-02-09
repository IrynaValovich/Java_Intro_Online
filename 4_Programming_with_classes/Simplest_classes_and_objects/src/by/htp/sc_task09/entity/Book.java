package by.htp.sc_task09.entity;

public final class Book {	
	
	private int id;
	private final String title;
	private final String author;
	private final String publisher;
	private final int year;
	private int pages;
	private int price;
	private String typeOfBinding;
	
	private Book(Builder builder) {
		this.id = builder.id;
		this.title = builder.title;
		this.author = builder.author;
		this.publisher = builder.publisher;
		this.year = builder.year;
		this.pages = builder.pages;
		this.price = builder.price;
		this.typeOfBinding = builder.typeOfBinding;		
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getYear() {
		return year;
	}

	public int getPages() {
		return pages;
	}

	public int getPrice() {
		return price;
	}

	public String getTypeOfBinding() {
		return typeOfBinding;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setTypeOfBinding(String typeOfBinding) {
		this.typeOfBinding = typeOfBinding;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + id;
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (id != other.id)
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + String.format(" id-> %d| title-> %-31s| author-> %-16s| publisher-> %-9s|"
				+ " year: %-5d| pages: %-4d| price: %-4d | binding: %s",
				getId(), getTitle(), getAuthor(), getPublisher(), getYear(), getPages(), getPrice(), getTypeOfBinding());
	}
	
	public static class Builder {
		private static int ID;
		private int lastYear = 2022;
		private int id;
		private final String title;
		private final String author;
		private final String publisher;
		private final int year;
		private int pages;
		private int price;
		private String typeOfBinding;
		
		public Builder(final String title, final String author, final String publisher, final int year) {
			this.id = ID++;
			this.title = title;
			this.author = author;
			this.publisher = publisher;
			this.year = year;
			if (this.title == null || this.author == null || this.publisher == null) {
				throw new IllegalArgumentException("Входные параметры не позволяют создать книгу");
			}
			if (this.year > lastYear) {
				throw new IllegalArgumentException("Поле год имеет некорректное значение");
			}
		}
		
		public Builder appendPages(int pages) {
			this.pages = pages;
			return this;
		}
		
		public Builder appendPrice(int price) {
			this.price = price;
			return this;
		}
		
		public Builder appendTypeOfBinding(String typeOfBinding) {
			this.typeOfBinding = typeOfBinding;
			return this;
		}
		
		public Book getBook() {
			return new Book(this);
		}		
	}
}
