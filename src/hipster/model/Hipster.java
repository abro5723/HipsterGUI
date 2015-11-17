package hipster.model;

public class Hipster
{
	private String name;
	private String[] hipsterPhrases;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String [4];
		
		setupArray();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "That's too mainstream!";
		hipsterPhrases[1] = "I liked fedoras before it was cool";
		hipsterPhrases[2] = "Wow, you really get with e trend don't you.";
		hipsterPhrases[3] = "I don' meant to sound like a hipster, but, you really don't know anything about that band.";
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
