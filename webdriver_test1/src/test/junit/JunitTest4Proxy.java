package test.junit;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class JunitTest4Proxy {

	
//	 firefox = require('selenium-webdriver/firefox');
//	var binary = new firefox.Binary('/my/firefox/install/dir/firefox-bin');
//	var options = new firefox.Options().setBinary(binary);
	
//	private ProfilesIni allProfiles = new ProfilesIni();
//	private FirefoxProfile profile = allProfiles.getProfile("WebDriver");	
////	private File pathToBinary = new File("D:\\Program\\Mozilla Firefox\\firefox.exe");
//	File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
////	profile.addAdditionalPreference("network.proxy.http","localhost");
////	profile.addAdditionalPreference("network.proxy.http_port","3128");
//	
//	private FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	
//	WebDriver driver = new FirefoxDriver(ffBinary,profile);
	private WebDriver driver;	

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		  //Set proxy IP and port. Here localhost Is proxy IP and 8080 Is Port number.
		  //You can change both values as per your requirement.
		  String PROXY = "127.0.0.1:1080";
		  //Bellow given syntaxes will set browser proxy settings using DesiredCapabilities.
		  Proxy proxy = new Proxy();
		  proxy.setHttpProxy(PROXY).setFtpProxy(PROXY).setSslProxy(PROXY)
		    .setSocksProxy(PROXY);
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability(CapabilityType.PROXY, proxy);
		  //Use Capabilities when launch browser driver Instance.
		  driver = new FirefoxDriver(cap);
		
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
