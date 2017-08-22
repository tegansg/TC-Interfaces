package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

public class PetTest 

{
	@Test
	public void catSpeakTest()
	{
		Pet cat = new Cat("Horatio");
		cat.speak();
		
		String expected = "Miaw";
		String actual = cat.speak();
		
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void dogSpeakTest()
	{
		Pet dog = new Dog("Jake");
		
		String expected = "Woof";
		String actual = dog.speak();
		
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void budgieSpeakTest()
	{
		Pet budgie = new Budgie("Raxacoricofallapatorius");
		
		String expected = "Hello, hello";
		String actual = budgie.speak();
		
		
		Assert.assertEquals(expected, actual);
	}
	
	
	
	
	
}
