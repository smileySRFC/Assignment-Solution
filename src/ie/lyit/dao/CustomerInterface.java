package ie.lyit.dao;
import ie.lyit.hotel.Customer;



public interface CustomerInterface
{
	//menu options
	public void add();
	public void list();
	public Customer view();
	public void delete();
	public void edit();
	public void writeRecordsToFile();
	public void readRecordsFromFile();	
}