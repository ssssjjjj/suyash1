package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumber_demowebshop 
{   
	WebDriver driver;
	
	@Given("user is on the demo web shop home page")
	public void user_is_on_the_demo_web_shop_home_page() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		  System.setProperty("webdriver.chrome.driver","C:\\Suyash\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.findElement(By.linkText("Log in")).click();
		
	}

	@When("i provide valid {string} and {string}")
	public void i_provide_valid_and( String login, String password) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		  driver.findElement(By.id("Email")).sendKeys(login);
		  driver.findElement(By.id("Password")).sendKeys(password);
		  driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	}

	@Then("the relevent login username is displayed")
	public void the_relevent_login_username_is_displayed() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		System.out.println("-----------------------------------");
		System.out.println("login successful");
		System.out.println("-----------------------------------");
		
	}
}
