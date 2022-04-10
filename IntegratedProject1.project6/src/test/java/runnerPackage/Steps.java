package runnerPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	@When("Click on Forgot Password")
	public void click_on_Forgot_Password() {
		driver.findElement(By.className("float-left")).click();
	}

	@When("Check the Forgotpassword is working or not")
	public void check_the_Forgotpassword_is_working_or_not() {
		Boolean b=driver.findElement(By.className("float-left")).isSelected();
		System.out.println("button is selected:"+b);
		
	}

}
