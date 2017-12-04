package ie.lyit.testers;
import ie.lyit.hotel.Employee;
import ie.lyit.hotel.Name;
import ie.lyit.hotel.Date;
import java.util.ArrayList;


public class EmployeeTester 
{
	public static void main(String [] args)
	{
		Employee emp1 = new Employee();
		System.out.println(emp1);
		
		emp1.setName(new Name("Mr", "Martin", "Farrell"));
		emp1.setAddress("1234 Faker street");
		emp1.setPhone("87y87583426785346875");
		emp1.setSalary(72);
		emp1.setBDate(new Date(25, 12, 94));
		emp1.setSDate(new Date(2, 10, 17));
		
		System.out.println(emp1);
		
		System.out.println(emp1.calculateWage(50));
		System.out.println(emp1.incrementSalary(15000));
		
		Employee emp2 = new Employee("Mr", "Mumkey", "Jones", "123 Mumk Street", "£42342342342342", 1200, 12, 12, 98, new Date(2, 10, 17));
		System.out.println(emp2);
		
		System.out.println(emp2.calculateWage(80));
		System.out.println(emp2.incrementSalary(12000));
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		   employees.add(new Employee("Ms", "Heavys", "Mom", "22 R Street", "£42342342342342", 12, 6, 6, 86, new Date(2, 10, 17)));
		   employees.add(emp1);
		   employees.add(emp2);
		   employees.trimToSize( );
		   
	   
	}
}
