package test.junit;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class JunitTest {

	
//	 firefox = require('selenium-webdriver/firefox');
//	var binary = new firefox.Binary('/my/firefox/install/dir/firefox-bin');
//	var options = new firefox.Options().setBinary(binary);
	
	private ProfilesIni allProfiles = new ProfilesIni();
	private FirefoxProfile profile = allProfiles.getProfile("WebDriver");	
	private File pathToBinary = new File("D:\\Program\\Mozilla Firefox\\firefox.exe");
//	File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//	profile.addAdditionalPreference("network.proxy.http","localhost");
//	profile.addAdditionalPreference("network.proxy.http_port","3128");
	
	private FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	
//	WebDriver driver = new FirefoxDriver(ffBinary,profile);
	private WebDriver driver = new HtmlUnitDriver();		

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.quit();
		
	}

}
