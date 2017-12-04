package ie.lyit.testers;

import ie.lyit.serialize.CustomerSerializer;
import ie.lyit.serialize.Menu;

public class CustomerSerializerTester 
{
	public static void main(String[] args) 
	{
		CustomerSerializer customerSerializer = new CustomerSerializer();
		
		//reads and loads details entered on previous uses of the file
		customerSerializer.readRecordsFromFile();
		
		//new menu
		Menu menuObj = new Menu();
		
		//continuously bring up the menu till the user quits the application
		do
		{
			//displays the menu
			menuObj.display();
			
			//waits for the user to enter which function they would like to do
			menuObj.readOption();
			
			//allows the user to use the methods from CustomerSerializer
			switch(menuObj.getOption())
			{
				case 1:customerSerializer.add();break;
				case 2:customerSerializer.list();break;
				case 3:customerSerializer.view();break;
				case 4:customerSerializer.edit();break;
				case 5:customerSerializer.delete();break;
				case 6:break;
				//if the user enters outside the range of 1-6 this message will appear
				default:System.out.println("INVALID OPTION");
			}
		}while(menuObj.getOption() !=6); //6 quits the program
		
		//details from users previous use of the file are saved to it
		customerSerializer.writeRecordsToFile();
	}

}
