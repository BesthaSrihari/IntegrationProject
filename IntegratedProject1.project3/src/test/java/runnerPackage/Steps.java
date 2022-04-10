package runnerPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	WebDriver driver;
	@Given("Open browser")
	public void open_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Given("Open Url {string}")
	public void open_Url(String url) {
	    driver.get(url);
	}

	@When("Enter username {string}")
	public void enter_username(String string) {
	    
	}

	@When("Enter password {string}")
	public void enter_password(String string) {
	    
	}

	@When("Print message for successfull signin")
	public void print_message_for_successfull_signin() {
	   System.out.println("log in is successfull");
	}
}