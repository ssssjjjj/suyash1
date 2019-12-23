package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class background_feature 
 
{   
	InternetExplorerDriver driver;
	
	@Given("john launched chrome browser")
	public void john_launched_chrome_browser() 
	{
		 System.setProperty("webdriver.ie.driver","C:\\Suyash\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();
		  
	}

	@Given("provided test me site url")
	public void provided_test_me_site_url() 
	{
		  driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("he clicks on login")
	public void he_clicks_on_login() 
	{
		  driver.findElement(By.linkText("SignIn")).click();
	}

	@Then("he shall be able to provide credentials")
	public void he_shall_be_able_to_provide_credentials() 
	{
		  driver.findElement(By.name("userName")).sendKeys("Lalitha");
		  driver.findElement(By.id("password")).sendKeys("Password123");
		  driver.findElement(By.name("Login")).click();
	}
	
	@When("he clicks on register link")
	public void he_clicks_on_register_link() 
	{
	      
	}

	@Then("he shall be able to provide registration details")
	public void he_shall_be_able_to_provide_registration_details() 
	{
	    
	}

	@When("he clicks on cart")
	public void he_clicks_on_cart() 
	{
	    
	}

	@Then("he shall be able to view his cart")
	public void he_shall_be_able_to_view_his_cart() 
	{
	    
	}

}
