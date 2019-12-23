package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumber_first 
{   
	WebDriver driver;
	
	@Given("user is on the test me app home page")
	public void user_is_on_the_test_me_app_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		  System.setProperty("webdriver.chrome.driver","C:\\Suyash\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.findElement(By.linkText("SignIn")).click();
		
	}

	@When("the user gives valid login and valid password")
	public void the_user_gives_valid_login_and_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		  
		  driver.findElement(By.name("userName")).sendKeys("Lalitha1");
		  driver.findElement(By.id("password")).sendKeys("sssssss");
		  driver.findElement(By.className("btn")).submit();
		
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		System.out.println("-----------------------------------");
		System.out.println("login successful");
		System.out.println("-----------------------------------");
		
	}

}
