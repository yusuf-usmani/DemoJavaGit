import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalTest {
	Cal c = new Cal();
	
	@AfterAll
	public static void tearDownAfterClass()
	{
		System.out.println("After All");
	}
	
	@BeforeAll
	public static void tearDownBeforeClass()
	{
		System.out.println("Before All");
	}
	
	@BeforeEach
	public  void tearDownBeforeEach()
	{
		System.out.println("Before each");
	}
	
	@AfterEach
	public  void tearDownAfterEach()
	{
		System.out.println("After each");
	}
	
	
	@Test
	//@Disabled
	void TestAdd()
	{
		int expRes = 8;
		int actualRes = c.add(4, 4);
		Assert.assertEquals(actualRes, expRes);
			
	}
	
	@Test
	@DisplayName("TestFun")
	void TestNull()
	{
		int actualRes = c.add(4, 4);
		Assert.assertEquals(actualRes, 8);
			
	}
	
	@Test
	void testFalse()
	{
		assertFalse(2==1);
		assertFalse("5 > 9",5>9);
	}
	
	@Test
	void AssertAll()
	{
		String n1 = "Yusuf";
		String n2 = "Jon";
		assertAll("AssertALL", ()->assertEquals(n1,"Yusuf"), ()->assertEquals(n2,"Jon"));
		
	}
	
	@Test
	void AssumeTrue()
	{
		LocalDateTime dt =  LocalDateTime.now();
		assumeTrue(dt.getDayOfWeek().getValue()==4);
		System.out.print("do task");
		
	}
}
