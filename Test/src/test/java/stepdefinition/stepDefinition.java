package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	
	
	 public static WebDriver driver;
	 public static WebElement element;
     public static Actions action;

@Given("^user is  on homepage$")
public void user_is_on_homepage(){
	System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
}

@When("^user navigates to Login Page$")
public void user_navigates_to_Login_Page() {
	action = new Actions(driver);
	element = driver.findElement(By.xpath("//a[@id=\"nav-link-yourAccount\"]"));
	action.moveToElement(element);
	element.click();
}

@When("^user enters username and Password$")
public void user_enters_username_and_Password(){
	driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("shariya777@gmail.com");
	driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("9941426105");
	driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	
}

@Then("^success message is displayed$")
public void success_message_is_displayed() {
	System.out.println("Hello....4");
}

}
