package ie.lyit.serialize;
import ie.lyit.hotel.Customer;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class CustomerSerializer 
{
	
	//creating file to store customer info
	final String FILENAME = "customer.bin";
	
	private ArrayList<Customer> customers;

	
	public CustomerSerializer()
	{
		customers = new ArrayList<Customer>();
	}
	
	//adds new customer to the arraylist
	//uses the read method from the Customer class to get the customers information
	public void add()
	{
		Customer customer = new Customer();
		// Read its details
		customer.read();	
		// And add it to the customer ArrayList
		customers.add(customer);
	}
	
	//lists out every customer in the arraylist
	public void list()
	{
		for(Customer tmpCustomer:customers)
		{
			System.out.println(tmpCustomer);
		}
	}
	//asks the user to select which customer to view using their customer number
	//displays that specific customer
	public Customer view()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("ENTER NUMBER OF CUSTOMER : ");
		int cusNum = keyboard.nextInt();
		
		for(Customer tmpCustomer:customers)
		{
			if(tmpCustomer.getNum() == cusNum)
			{
				System.out.println(tmpCustomer);
				return tmpCustomer;
			}
		}
		return null;
	}
	
	//asks the user for the customer number
	//deletes the customer from the database
	public void delete()
	{
		Customer tmpCustomer = view();
		if(tmpCustomer != null)
		{
			customers.remove(tmpCustomer);
		}
	}
	//asks the user for the customer number
	//allows the user to edit customer details
	public void edit()
	{
		Customer tmpCustomer = view();
		if(tmpCustomer != null)
		{
			int index=customers.indexOf(tmpCustomer);
			tmpCustomer.read();
			customers.set(index, tmpCustomer);
		}
	}
	
	//writing customer information to the customer.bin file
	public void writeRecordsToFile()
	{
		try
		{
			FileOutputStream fileStream = new FileOutputStream(FILENAME);
			
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			
			os.writeObject(customers);
			
			os.close();
		}
		catch(FileNotFoundException fNFE)
		{
			System.out.println("Cannot create file to store customers");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	//reads customer records from the previous time the file was in use
	public void readRecordsFromFile()
	{
		try
		{
			FileInputStream fis = new FileInputStream(FILENAME);
			
			ObjectInputStream is = new ObjectInputStream(fis);
			
			customers = (ArrayList<Customer>)is.readObject();

			
			is.close();
		}
		catch(FileNotFoundException fNFE)
		{
			System.out.println("Cannot find customers in file");			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
}
