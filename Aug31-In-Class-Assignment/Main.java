// Code for http://www1.udel.edu/CIS/275/tharvey/18F/lectures/iterators.pdf

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		// Step 2
		Collection<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido"));
		dogs.add(new Dog("Spot"));
		dogs.add(new Dog("Lucy"));
		
		// Step 3 (Is this possible?)
		
		// Step 4
		for(Dog d : dogs)
		{
			if(d.name.equals("Spot"))
			{
				System.out.println(d);
			}
		}
		
		// Step 5
		/*
		 *  Create an Iterator over the dogs. Write a for loop over your Iterator. Try each of the following, and
			comment each one out after you try it. Note the effects/exceptions in your comments. Hint: don’t
			do this in Eclipse.
				• Inside the for loop, if the dog’s name is Spot, add a new dog to the Collection inside the loop.
				• Inside the for loop, if the dog’s name is Spot, add a new dog to the Iterator inside the loop.
				• Inside the for loop, if the dog’s name is Spot, remove Spot from the Collection inside the loop.
				• Inside the for loop, if the dog’s name is Spot, remove Spot from the Iterator inside the loop.
		 */
		Dog doggo = new Dog("Doggo");
		for (Iterator<Dog> iterator = dogs.iterator(); iterator.hasNext();) 
		{
			
			if(iterator.next().name.equals("Spot"))
			{
				// 5a - Concurrent modification exception
				// dogs.add(doggo);
				
				// 5b - How to do this?
				// iterator.add()
				
				// 5c - Concurrent modification exception
				// dogs.remove(iterator.next());
				
				// 5d - How to do this?
				// 
			}
			
	        System.out.println(iterator.next());
        }
		
	}
}