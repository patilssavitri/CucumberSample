package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;

public class OrangeHRMSteps {
	WebDriver driver;
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		//System.setProperty("webdriver.chrome.driver", "C://Users//shwetha//Desktop//savitrip//MyWork//chromedriver_win32/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
	}

	@When("I open orange hrm homepage")
	public void i_open_orange_hrm_homepage() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
	}

	@Then("I verify that logo present on page")
	public void i_verify_that_logo_present_on_page() {
		boolean status=driver.findElement(By.xpath("//*[@id='divLogo']/img")).isDisplayed();
		Assert.assertEquals(true, status);
		
	}

	@And("Close browser")
	public void close_browser() {
		driver.quit();
	}

}
