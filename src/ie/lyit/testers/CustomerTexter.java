package ie.lyit.testers;
import ie.lyit.hotel.Customer;
import ie.lyit.hotel.Name;

public class CustomerTexter
{
	public static void main(String [] args)
	{
		Customer cus1 = new Customer();
		System.out.println(cus1);
		
		cus1.setName(new Name("Mr", "Martin", "Farrell" ));
		cus1.setAddress("123 Fake Steet ,Letterkenny");
		cus1.setPhone("931274928364987");
		cus1.setEmail("skdlhfjksdf@skdjaf.com");
		
		System.out.println(cus1);
		
		Customer cus2 = new Customer("Ms","Lisa","Simpson","The Green,Ennis","085 0987654","lisa.simpson@gmail.com");
		System.out.println(cus2);
		
		if(cus1.equals(cus2))
		{
			System.out.println(cus1 +" is the same as " +cus2);
			
		}
		else
		{
			System.out.println(cus1 +" is not the same as " +cus2);
		}
		
		if(cus1.getName().isFemale())
		{
			System.out.println(cus1 +" is female");
		}
		else
		{
			System.out.println(cus1 +" is not female");
		}
		
		if(cus2.getName().isFemale())
		{
			System.out.println(cus2 +" is female");
		}
		else
		{
			System.out.println(cus2 +" is not female");
		}

	}
}
