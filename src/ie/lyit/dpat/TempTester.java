package ie.lyit.dpat;
import ie.lyit.serialize.Menu;
import java.util.*;


public class TempTester {

	public static void main(String[] args) 
	{
		int choice;
		Scanner keyboardIn = new Scanner(System.in);
		do
		{
			System.out.println("Please choose a type of customer \n1: Standard Customer \n2: VIP Customer \n0: Quit");
			choice = keyboardIn.nextInt();
			
			if(choice == 1)
			{
				TemplateCustomer cus = new StandardCustomer();
				Menu menuObj = new Menu();
				cus.readRecordsFromFile();
				
				do
				{
					//displays the menu
					menuObj.display();
					
					//waits for the user to enter which function they would like to do
					menuObj.readOption();
					
					//allows the user to use the methods from StandardCustomer
					switch(menuObj.getOption())
					{
						case 1:cus.add();break;
						case 2:cus.list();break;
						case 3:cus.view();break;
						case 4:cus.edit();break;
						case 5:cus.delete();break;
						case 6:break;
						//if the user enters outside the range of 1-6 this message will appear
						default:System.out.println("INVALID OPTION");
					}
				}while(menuObj.getOption() !=6); //6 quits the program
				
				cus.writeRecordsToFile();

			}
			
			if(choice == 2)
			{
				TemplateCustomer cus = new VIPCustomer();
				Menu menuObj = new Menu();
				cus.readRecordsFromFile();
				
				do
				{
					//displays the menu
					menuObj.display();
					
					//waits for the user to enter which function they would like to do
					menuObj.readOption();
					
					//allows the user to use the methods from VIPCustomer
					switch(menuObj.getOption())
					{
						case 1:cus.add();break;
						case 2:cus.list();break;
						case 3:cus.view();break;
						case 4:cus.edit();break;
						case 5:cus.delete();break;
						case 6:break;
						//if the user enters outside the range of 1-6 this message will appear
						default:System.out.println("INVALID OPTION");
					}
				}while(menuObj.getOption() !=6); //6 quits the program
				
				cus.writeRecordsToFile();

			}
	
		}while(choice == 1 || choice == 2);
	}
}
