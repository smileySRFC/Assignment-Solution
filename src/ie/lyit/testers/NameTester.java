package ie.lyit.testers;
import ie.lyit.hotel.Name;
import java.util.ArrayList;

public class NameTester 
{
	public static void main(String [ ]args)
	{
		//create a name object
		Name personA = new Name();
		
		//display personA details
		System.out.println(personA);
		
		personA.setTitle("Mr");
		personA.setFName("Homer");
		personA.setSName("Simpson");
		
		//Display personA updated details
		System.out.println(personA);
		
		//Create and give details to personB
		Name personB = new Name("Mr", "Marge", "Simpson");
		
		//Display personB details
		System.out.println(personB);
		
		//Check if personA is equal to personB
		if(personA.equals(personB))
			System.out.println(personA +" is the same as " +personB);
		else
			System.out.println(personA +" is not the same as " +personB);
		
		if(personA.isFemale()) // or if(personA.isFemale() == true)
			System.out.println(personA +" is female");
		else
			System.out.println(personA +" is not female");
		
		if(personB.isFemale()) // or if(personB.isFemale() == true)
			System.out.println(personB +" is female");
		else
			System.out.println(personB +" is not female");
		
		ArrayList<Name> names = new ArrayList<Name>();
		names.add(new Name("Mr", "Bart", "Simpson"));
		names.add(personA);
		names.add(personB);
		
		for(Name tempName:names)
			System.out.println(tempName);
		
		if(nameSearch(personA, names))
			System.out.println("FOUND!");
		else
			System.out.println("NOT FOUND!");	
	}
	
	public static boolean nameSearch(Name nameSearch, ArrayList<Name> listOfNames)
	{
		return listOfNames.contains(nameSearch);
	}
}
