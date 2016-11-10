package array.controller;

import array.model.Array;
import array.view.HipsterFrame;


public class ArrayController
{
	private int []  numbers;
	private String []words = {"This", "is the ", " second hipster ", "level ", "initialization " , "lists"};
	private Array  [] hipster;
	private HipsterFrame appFrame;
	
	public ArrayController()
	{	
		hipster = new Array[6];
	
		thirdLevelHipster();
		appFrame = new HipsterFrame(this);
	}

	private void thirdLevelHipster()
	{
		numbers = new int [] {0,1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,0};
	}
	
	public void start()
	{
		
		for(int index = 0; index < hipster.length; index++ )
		{
			hipster[index] = new Array ("Hipster # " + index);
		} 
		
		for(Array currentHipster : hipster)
		{
			System.out.print(currentHipster + ", ");
		}
		System.out.println("Next");
		for(String currentWords : words)
		{
			System.out.print(currentWords + ", ");
		}
		System.out.println("Next");
		for(int tempInt : numbers)
		{
			
		}
		
	
	}
	public String[] getWords()
	{
		return words;
	}
	
	public int[] getNumbers()
	{
		return numbers;
	}
	public Array[] getHipster()
	{
		return hipster;
	}
}
