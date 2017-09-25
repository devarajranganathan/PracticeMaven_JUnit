package JUnit;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//import Application.MathProvider;

public class JunitMathProvider_2 {
	
	MathProvider provider;
	
	public JunitMathProvider_2(){		 
		provider = new MathProvider();
	}	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		
		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");		
	}
	
    @Test
	public void multiply()
	{
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	    int firstNumber = 10;
	    int secondNumber = 20;
		assertEquals(firstNumber * secondNumber, provider.Multiply(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}	

}
