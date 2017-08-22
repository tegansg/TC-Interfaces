package io.zipcoder;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

	Scanner in = new Scanner(System.in);
	private int numberoPets;
	private Pet[] pets;

	
	
	public Application()
	{
		
	}
	
	public Application(Pet[] pets) // Constructor to help tests
	{
		this.pets = pets;
		this.numberoPets = pets.length;
	}
	
	public void numberoPets() 
	{	
		System.out.print("How many pets do you have?");
		this.numberoPets = in.nextInt();
		pets = new Pet[numberoPets];
	}
	

	public void typeoPets() 
	{
		String petType ="";
		String petName;
		
		for (int i = 0; i < numberoPets; i++) {
			System.out.println(String.format("What type of pet is number %d?", i+1));
			petType = in.next();
			
			while (!(petType.equalsIgnoreCase("Dog") || petType.equalsIgnoreCase("Cat") || petType.equalsIgnoreCase("Budgie")))
			{
				System.out.println(String.format("Please choose dog, cat or budgie (case insensitive).\nWhat type of pet is number %d?", i + 1));
				petType = in.next();
			}
			
			System.out.println(String.format("What name does your %s have?", petType));
			petName = in.next();
			
			pets[i] = stringToClass(petType, petName);
		}

		System.out.println("Thank you.");

	}
	
	/** 
	 * @param type - String cat, dog, or budgie (case insensitive)
	 * @param name - Any string
	 * @return a Pet object of subclass Budgie, Dog, or Cat
	 */
	public Pet stringToClass(String type, String name) 
	{
		Pet myPet;
		
		switch (type.toLowerCase()) 
		{
		case "cat":
			myPet = new Cat(name);
			break;

		case "dog":
			myPet = new Dog(name);
			break;

		case "budgie":
			myPet = new Budgie(name);
			break;

		default:
			myPet = null;
		}

		return myPet;
	}

	public String printPets() 
	{
		
		String response = String.format("You have %d pets", numberoPets);
		
		for (int i = 0; i < numberoPets; i++)
		{
			Pet pet = pets[i];
			response += String.format("\na %s called %s", pet.getClass().getSimpleName(), pet.getName());
		}
		//System.out.print(response);
		return response;
	}
	

	public String printPetsSpeaking() 
	{
		String response = String.format("You have %d pets", numberoPets);
		
		for (int i = 0; i < numberoPets; i++) 
		{
			Pet pet = pets[i];
			response += String.format("\nYour %s called %s makes this sound: %s!", pet.getClass().getSimpleName(), pet.getName(), pet.speak());
		}
		
		return response;
	}

	
	public void sortPetsByNameThenType()
	{
		Arrays.sort(pets);		
	}
	
	public void sortPetsByTypeThenName()
	{
		Arrays.sort(pets, new PetComparator());	
	}
	

}
