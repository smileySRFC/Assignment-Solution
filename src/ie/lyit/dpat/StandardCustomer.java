package ie.lyit.dpat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import ie.lyit.hotel.Customer;

public class StandardCustomer extends TemplateCustomer
{
	
	private ArrayList<Customer> customers;
	final String FILENAME = "standardcus.bin";
	
	public StandardCustomer()
	{
		customers = new ArrayList<Customer>();
	}
	
	@Override
	void add() 
	{
		Customer customer = new Customer();
		// Read its details
		customer.read();	
		// And add it to the customer ArrayList
		customers.add(customer);
	}

	@Override
	void list() 
	{
		for(Customer tmpCustomer:customers)
		{
			System.out.println(tmpCustomer);
		}
	}

	@Override
	Customer view() 
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

	@Override
	void delete() 
	{
		Customer tmpCustomer = view();
		if(tmpCustomer != null)
		{
			customers.remove(tmpCustomer);
		}
	}

	@Override
	void readRecordsFromFile() 
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

	@Override
	void writeRecordsToFile() 
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

	@Override
	void edit() 
	{
		Customer tmpCustomer = view();
		if(tmpCustomer != null)
		{
			int index=customers.indexOf(tmpCustomer);
			tmpCustomer.read();
			customers.set(index, tmpCustomer);
		}
	}

}
