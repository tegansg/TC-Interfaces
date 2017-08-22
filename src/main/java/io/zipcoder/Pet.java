package io.zipcoder;
import java.lang.Comparable;
import java.util.Comparator;

public abstract class Pet implements Comparable <Pet> {
	
	private String name;
	
	public Pet(String name)
	{
		this.name = name;
	}
	
	public abstract String speak();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Pet other)
	{
		int i = name.compareToIgnoreCase(other.name) == 0? 
				this.getClass().toString().compareToIgnoreCase(other.getClass().toString())
				: name.compareToIgnoreCase(other.name);
	return i;
	}
	
}

class PetComparator implements Comparator<Pet>
{
	@Override
	public int compare(Pet p1, Pet p2)
	{

		int i = p1.getClass().getSimpleName().compareToIgnoreCase(p2.getClass().getSimpleName()) == 0? 
				p1.getName().compareToIgnoreCase(p2.getName()) : p1.getClass().getSimpleName().compareToIgnoreCase(p2.getClass().getSimpleName());

		return i;
	}
	
}

class Cat extends Pet
{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		
		return "Miaw";
		
	}
	
	
}

class Dog extends Pet
{

	public Dog(String name) 
	{
		super(name);
	}

	@Override
	public String speak() 
	{
		return "Woof";
	}
	
}

class Budgie extends Pet
{

	public Budgie(String name) {
		super(name);
	}

	@Override
	public String speak() {

		return "Hello, hello";
	}
	
}

	
	
	
