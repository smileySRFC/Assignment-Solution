package ie.lyit.dao;
import ie.lyit.serialize.Menu;

public class DAOTester 
{
	public static void main(String [] args)
	{
		CustomerInterface dao = new CustomerDAOImp1();
		
		dao.readRecordsFromFile();
		Menu menuObj = new Menu();

		
		do
		{
			//displays the menu
			menuObj.display();
			
			//waits for the user to enter which function they would like to do
			menuObj.readOption();
			
			//allows the user to use the methods from CustomerInterface
			switch(menuObj.getOption())
			{
				case 1:dao.add();break;
				case 2:dao.list();break;
				case 3:dao.view();break;
				case 4:dao.edit();break;
				case 5:dao.delete();break;
				case 6:break;
				//if the user enters outside the range of 1-6 this message will appear
				default:System.out.println("INVALID OPTION");
			}
		}while(menuObj.getOption() !=6); //6 quits the program
		
		dao.writeRecordsToFile();

	}
}
