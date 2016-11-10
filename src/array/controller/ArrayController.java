package array.controller;

import array.model.Array;


public class ArrayController
{
	private int []  numbers;
	private String []words = {"This", "is the ", " second hipster ", "level ", "initialization " , "lists"};
	private Array  [] hipster;
	
	public ArrayController()
	{
		numbers = new int [20];
		words = new String [4];
		hipster = new Array[6];
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
	
}
