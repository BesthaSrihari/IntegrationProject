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

@When("click on facebook logo")
public void click_on_facebook_logo() {
	driver.findElement(By.xpath("//li[@class='facebook']//a[1]")).click();
}

@When("print message if it is navigate to facebook page")
public void print_message_if_it_is_navigate_to_facebook_page() {
    System.out.println("It is navigating to facebook page");
}
}