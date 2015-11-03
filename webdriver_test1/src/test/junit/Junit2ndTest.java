package test.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Junit2ndTest {

	WebDriver driver = new HtmlUnitDriver();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test1() {
//		fail("Not yet implemented");
		System.out.println("testing12");
	}
	
	@Ignore
	@Test
	public void test2() {
//		fail("Not yet implemented");
		System.out.println("testing123");
	}

}
