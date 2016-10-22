package de.mop.example.mockito.onlyTesting;

//import junit.runner.*;

import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import org.testng.annotations.*;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

@Test
public class WTFTest {
	@DataProvider
	public static Object[][] foo() {
	      return new Object[][] {{1, 2}, {2, 3}, {100, 101}, {545454, 545455}, {-40, -39}};
	}
	
	/**
	 * 
	 * @param in
	 * @param expected
	 */
	@Test(dataProvider="foo")
	public void testAddOne(Integer in, Integer expected)
	{
		WTF wtf = new WTF();
		
		Adder a = mock(Adder.class);
		when(a.addOne(in)).thenReturn(expected);
		
		wtf.setAdder(a);
		assertEquals(wtf.increase(in), expected);
	}
	
}
