package demoforumgrp.MavenDemo;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class RemoveConsecutiveDuplicateTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	private RemoveDuplicateElementMain removeDuplicate;
	
    public RemoveConsecutiveDuplicateTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static TestSuite suite()
    {
        return new TestSuite( RemoveConsecutiveDuplicateTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    @Before
	public void init()
	{
		System.out.println("Test Started");
		removeDuplicate=new RemoveDuplicateElementMain();
	}
	
	@After
	public void afterTest()
	{
		System.out.println("Test Finished");
		System.out.println("---------------");
	}
	
	@Test
	public void removeDuplicateTest1()
	{
		int[] array = new int[] { 1, 1, 2, 2, 2, 1, 1, 1 };
		int[] resultArray = removeDuplicate.removeDuplicateElement(array);		
		assertArrayEquals(new int[] {1, 2, 1,0,0,0,0,0}, resultArray);
	}
	@Test
	public void removeDuplicateTest2()
	{
		int[] array = new int[] { 1, 1, 1, 1 };
		int[] resultArray = removeDuplicate.removeDuplicateElement(array);		
		assertArrayEquals(new int[] {1, 0, 0, 0}, resultArray);
	}
	
	@Test
	public void removeDuplicateTest3()
	{
		int[] array = new int[0];
		int[] resultArray = removeDuplicate.removeDuplicateElement(array);		
		assertArrayEquals(new int[0], resultArray);
	}
	
	@Test
	public void removeDuplicateTest4()
	{
		int[] array = new int[]{1,2,3,4};
		int[] resultArray = removeDuplicate.removeDuplicateElement(array);		
		assertArrayEquals(new int[]{1,2,3,4}, resultArray);
	}	
}
