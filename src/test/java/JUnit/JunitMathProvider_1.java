package JUnit;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//import Application.MathProvider;

public class JunitMathProvider_1 {
	
	MathProvider provider;
	
	public JunitMathProvider_1(){		 
		provider = new MathProvider();
	}	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");		
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}
	
	@Test
	public void add()
	{
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 20;
		assertEquals(firstNumber + secondNumber, provider.Add(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
    @Test
	public void subtract()
	{
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	    int firstNumber = 10;
	    int secondNumber = 20;
		assertEquals(firstNumber - secondNumber, provider.Substract(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}	
    
    @Test
	public void One()
	{
		System.out.println("One");
	}
    
    @Test
	public void Two()
	{
		System.out.println("Two");
	}    
	
    @Test
	public void Three()
	{
		System.out.println("Three");
	}    
    
    @Test
	public void Four()
	{
		System.out.println("Four");
	}    
}
