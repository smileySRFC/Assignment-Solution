package ie.lyit.testers;
import ie.lyit.hotel.Date;
import java.util.Scanner;

public class YearTester 
{
	public static void main(String [] args)
	{
	
		Scanner keyboard = new Scanner(System.in);
		Date dateA = new Date(3, 3, 1994);
	
		System.out.println(dateA);
		
		int setD = 40, setM = 13, setY = 1231;
		boolean goodInput=false;
	
		do
		{
			try
			{
				dateA.setDay(setD);
				dateA.setMonth(setM);
				dateA.setYear(setY);
				goodInput = true;
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("Incorrect Day, month, or year");
			
				System.out.println("Please enter the day");
				setD = keyboard.nextInt();
				System.out.println("Please enter the month");
				setM = keyboard.nextInt();
				System.out.println("Please enter the year");
				setY = keyboard.nextInt();
			}
		}while(!goodInput);
		System.out.println(dateA);
	
		Date dateB = new Date(25, 12, 1995);
	
		System.out.println(dateB);
		
		if(dateA.equals(dateB))
			System.out.println(dateA + " is the same as " +dateB);
		else
			System.out.println(dateA + " is not the same as " +dateB);

	}
}
