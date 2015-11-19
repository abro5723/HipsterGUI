package hipster.model;

public class Hipster
{
	private String name;
	private String[] hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String [4];
		this.hipsterBooks = new Book[3];
		
		setupArray();
		setupBooks();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "That's too mainstream!";
		hipsterPhrases[1] = "I liked fedoras before it was cool";
		hipsterPhrases[2] = "Wow, you really get with e trend don't you.";
		hipsterPhrases[3] = "I don' meant to sound like a hipster, but, you really don't know anything about that band.";
	}
	
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		firstBook = new Book();
		firstBook.setAuthor("Neal Stephenson");
		firstBook.setTitle("Diamond Age");
		firstBook.setSubject("Science Fiction");
		firstBook.setPageCount(405);
		firstBook.setPrice(24.99);
		
		secondBook = new Book();
		secondBook.setAuthor("Thomas Begone");
		secondBook.setTitle("I luv ya baby");
		secondBook.setSubject("Romance");
		secondBook.setPageCount(256);
		secondBook.setPrice(30.65);
		
		thirdBook = new Book();
		thirdBook.setAuthor("Idon't Kow");
		thirdBook.setTitle("Animorphs");
		thirdBook.setSubject("Science Fiction");
		thirdBook.setPageCount(132);
		thirdBook.setPrice(15.99);
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
		
	}
	
	public Hipster(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}
	public void setHIpsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}

}
