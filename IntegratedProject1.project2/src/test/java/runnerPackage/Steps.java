package runnerPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	WebDriver driver;
	@BeforeTest
	@Given("Open browser")
	public void open_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
@Test
	@Given("Open Url {string}")
	public void open_Url(String url) {
		driver.get(url);
	    
	}

	@When("Enter username {string}")
	public void enter_username(String username) {
		driver.findElement(By.name("username")).sendKeys(username);
	}

	@When("Enter password {string}")
	public void enter_password(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	    
	}
@AfterTest
	@When("Print message for accepting username and password")
	public void print_message_for_accepting_username_and_password() {
	    System.out.println("Successfully taking the username and password");
	}

}
