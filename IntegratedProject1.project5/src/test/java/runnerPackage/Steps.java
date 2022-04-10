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
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Given("Open Url {string}")
	public void open_Url(String url) {
	        driver.get(url);
	}

	@When("View Statement")
	public void view_Statement() {
		Boolean viewstmt=driver.findElement(By.xpath("//a[contains(@class,'btn btn-link')]//span")).isSelected();
		System.out.println("It is selected:  "+viewstmt);
	}

	@When("print message if it is working or not")
	public void print_message_if_it_is_working_or_not() {
	    System.out.println("It is not navigating to view statment");
	}

}
