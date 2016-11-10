package array.model;

public class Array
{
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
}
