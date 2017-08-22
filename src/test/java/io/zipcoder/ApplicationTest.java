package io.zipcoder;
import org.junit.Rule;
import org.junit.Test;

import org.junit.Assert;


public class ApplicationTest 
{

	
	@Test
	public void printPetsTest()
	{
		Pet polly = new Cat("Polly");
		Pet murphy = new Dog("Murphy");
		Pet sally = new Budgie("Sally");
		Pet[] pets = {polly, murphy, sally};
		
		Application app = new Application(pets);
	
		String expected = "You have 3 pets"
						+ "\na Cat called Polly"
						+ "\na Dog called Murphy"
						+ "\na Budgie called Sally";
		
		String actual = app.printPets();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void printPetsSpeakingTest()
	{
		Pet polly = new Cat("Polly");
		Pet murphy = new Dog("Murphy");
		Pet sally = new Budgie("Sally");
		Pet[] pets = {polly, murphy, sally};
		
		Application app = new Application(pets);
	
		String expected = "You have 3 pets"
						+ "\nYour Cat called Polly makes this sound: Miaw!"
						+ "\nYour Dog called Murphy makes this sound: Woof!"
						+ "\nYour Budgie called Sally makes this sound: Hello, hello!";
		
		String actual = app.printPetsSpeaking();
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void sortPetsTest()
	{	
		Pet polly = new Cat("Polly");
		Pet murphy = new Dog("Murphy");
		Pet murphy2 = new Cat("Murphy");
		Pet sally = new Budgie("Sally");
		Pet[] pets = {polly, murphy, murphy2, sally};
		
		Application app = new Application(pets);
		app.sortPetsByNameThenType();
	
		String expected = "You have 4 pets"
						+ "\na Cat called Murphy"
						+ "\na Dog called Murphy"
						+ "\na Cat called Polly"
						+ "\na Budgie called Sally";
		
		String actual = app.printPets();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void sortPetsCompartatorTest()
	{
		Pet polly = new Cat("Polly");
		Pet murphy = new Dog("Murphy");
		Pet murphy2 = new Cat("Murphy");
		Pet sally = new Budgie("Sally");
		Pet[] pets = {murphy, murphy2, polly, sally};
		
		Application app = new Application(pets);
		app.sortPetsByTypeThenName();
	
		String expected = "You have 4 pets"
						+ "\na Budgie called Sally"
						+ "\na Cat called Murphy"
						+ "\na Cat called Polly"
						+ "\na Dog called Murphy";
		
		String actual = app.printPets();
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void stringToClassTest()
	{

		Application app = new Application();
		
		Pet expected = new Cat("Polly");		
		Pet actual = app.stringToClass("CAT", "Polly");
		
		Assert.assertEquals(expected.getClass(), actual.getClass());
		Assert.assertEquals(expected.getName(), actual.getName());
	}
}