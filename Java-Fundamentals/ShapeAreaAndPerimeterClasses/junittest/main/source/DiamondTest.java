package main.source;
import main.source.Diamond;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DiamondTest {

	public DiamondTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("Setup for test complete.");
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("Test complete!");
	}

	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}
	
	/**
	 * Test getArea method, of class Diamond.
	 */
	@Test
	public void testGetArea() {
		Diamond theDiamond = new Diamond(3, 4, 5);
		
	 	double expArea = 20.0;
		double actArea = theDiamond.getArea();
		
		assertEquals("Area test", expArea, actArea, .01);
	}
	
	/**
	 * Test getPerimeter method, of class Diamond.
	 */
	@Test
	public void testGetPerimeter() {
		Diamond theDiamond = new Diamond(3, 4, 5);
		
		double expPerim = 12.0;
		double actPerim = theDiamond.getPerimeter();
		
		assertEquals("Perimeter test", expPerim, actPerim, .01);
	}
	
	@Test
	public void testInitialValues() {
		Diamond theDiamond = new Diamond(0.0, 0.0, 0.0);
		
		double expArea = 0.0;
		double actArea = theDiamond.getArea();
		
		assertEquals("Area test", expArea, actArea, .01);
		
		double expPerim = 0.0;
		double actPerim = theDiamond.getPerimeter();
		
		assertEquals("Perimeter test", expPerim, actPerim, .01);	
	}
	
	@Test
	public void testInitialValueSide() {
		Diamond theDiamond = new Diamond(0, 4, 5);
		
	 	double expArea = 20.0;
		double actArea = theDiamond.getArea();
		
		assertEquals("Area test", expArea, actArea, .01);
		
		double expPerim = 0.0;
		double actPerim = theDiamond.getPerimeter();
		
		assertEquals("Perimeter test", expPerim, actPerim, .01);
	}
	
	@Test
	public void testInitialValueHeight() {
		Diamond theDiamond = new Diamond(3, 4, 0);
		
	 	double expArea = 0.0;
		double actArea = theDiamond.getArea();
		
		assertEquals("Area test", expArea, actArea, .01);
		
		double expPerim = 12.0;
		double actPerim = theDiamond.getPerimeter();
		
		assertEquals("Perimeter test", expPerim, actPerim, .01);
	}
	
	@Test
	public void testInitialValueBreadth() {
		Diamond theDiamond = new Diamond(3, 0, 5);
		
	 	double expArea = 0.0;
		double actArea = theDiamond.getArea();
		
		assertEquals("Area test", expArea, actArea, .01);
		
		double expPerim = 12.0;
		double actPerim = theDiamond.getPerimeter();
		
		assertEquals("Perimeter test", expPerim, actPerim, .01);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetAreaNegativeValueHeight() {
		Diamond theDiamond = new Diamond(3, 4, -5);
		
		double actArea = theDiamond.getArea();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetAreaNegativeValueBreadth() {
		Diamond theDiamond = new Diamond(3, -4, 5);
		
		double actArea = theDiamond.getArea();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPerimeterNegativeValueSide() {
		Diamond theDiamond = new Diamond(-3, 4, 5);
		
		double actPerim = theDiamond.getPerimeter();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetAreaNaNHeight() {
		Diamond theDiamond = new Diamond(3, 4, Double.NaN);
		
		double actArea = theDiamond.getArea();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetAreaNaNBreadth() {
		Diamond theDiamond = new Diamond(3, Double.NaN, 5);
		
		double actArea = theDiamond.getArea();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPerimeterNaNSide() {
		Diamond theDiamond = new Diamond(Double.NaN, 4, 5);
		
		double actPerim = theDiamond.getPerimeter();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetAreaPositiveInfinityHeight() {
		Diamond theDiamond = new Diamond(3, 4, Double.POSITIVE_INFINITY);
		
		double actArea = theDiamond.getArea();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetAreaPositiveInfinityBreadth() {
		Diamond theDiamond = new Diamond(3, Double.POSITIVE_INFINITY, 5);
		
		double actArea = theDiamond.getArea();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetAreaNegativeInfinityHeight() {
		Diamond theDiamond = new Diamond(3, 4, Double.NEGATIVE_INFINITY);
		
		double actArea = theDiamond.getArea();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetAreaNegativeInfinityBreadth() {
		Diamond theDiamond = new Diamond(3, Double.NEGATIVE_INFINITY, 5);
		
		double actArea = theDiamond.getArea();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPerimeterPositiveInfinitySide() {
		Diamond theDiamond = new Diamond(Double.POSITIVE_INFINITY, 4, 5);
		
		double actPerim = theDiamond.getPerimeter();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPerimeterNegativeInfinitySide() {
		Diamond theDiamond = new Diamond(Double.NEGATIVE_INFINITY, 4, 5);
		
		double actPerim = theDiamond.getPerimeter();	
	}
}
