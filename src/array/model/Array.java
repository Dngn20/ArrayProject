package array.model;

public class Array
{
	private int hipsterRank;
	private String name;
	public Array(String name) 
	{
		this.name = name;
	}
	
	public String toString()
	{
		String description = "My name is " + name;
		
		return description;
	}

	public void calculateHipsterRank()
	{
		hipsterRank = (int) (Math.random() * 10);
	}
	
	public void calculateHipsterRank(int scale)
	{
		hipsterRank = (int) (Math.random() * scale);
		
	}

	public void calculateHipsterRank(int scale, int shift)
	{
		hipsterRank = (int) (Math.random() * scale) + shift;
	}
	
	public int getHipsterRank()
	{
		return hipsterRank;
	}
}
