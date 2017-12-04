package ie.lyit.dpat;
import ie.lyit.hotel.Customer;

public abstract class TemplateCustomer 
{
	abstract void add();
	abstract void list();
	abstract Customer view();
	abstract void delete();
	abstract void edit();
	abstract void readRecordsFromFile();
	abstract void writeRecordsToFile();

	public final void cus()
	{
		//add customers
		add();
		
		//list customers
		list();
		
		//view specific customer
		view();
		
		//delete specific customer
		delete();
		
		//read previous version of file
		readRecordsFromFile();
		
		//save new information on file
		writeRecordsToFile();
		
		//edit specific customer
		edit();
	}
	
}
