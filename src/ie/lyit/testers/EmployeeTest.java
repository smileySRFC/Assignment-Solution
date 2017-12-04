package ie.lyit.testers;
import ie.lyit.hotel.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest 
{
	private Employee e1;

	@Before
	public void setUp() throws Exception 
	{
		e1 = new Employee("Mr", "Mumkey", "Jones", "123 Mumk Street", "£42342342342342", 1200, 12, 12, 2016, new Date(1, 1, 2017));
	}

	@Test
	public void testGetDateProbationEnds() 
	{
		assertEquals(e1.getDateProbationEnds(20), new Date(21,1,2017));
		assertEquals(e1.getDateProbationEnds(50), new Date(20, 2, 2017));

	}

}
