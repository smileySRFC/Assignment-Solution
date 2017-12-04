package ie.lyit.serialize;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu 
{
	private int option;
	
	//displays the list
	public void display()
	{
		System.out.println("\t1. Add");
		System.out.println("\t2. List");
		System.out.println("\t3. View");
		System.out.println("\t4. Edit");
		System.out.println("\t5. Delete");
		System.out.println("\t6. Quit");

	}
	
	
	public void readOption()
	{
		Scanner kbInt = new Scanner(System.in);
		//waits for user to enter option
	  	  try
	  	  {	  	  
	  	  		System.out.println("\n\tEnter Option [1|2|3|4|5|6]");
	  			  option=kbInt.nextInt();
	  	  }
	  	  //if the option is not an int the catch will be activated
	  	  catch(InputMismatchException IME)
	  	  {
	  		  System.out.println("That is not an integer please enter an integer between 1-6");
	  	  }
	}
	
	public int getOption()
	{
		return option;
	}
}