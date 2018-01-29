package CucumberFramework.StepFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	WebDriver driver;
	
	
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alper\\eclipse-workspace\\CucumberFramework\\src\\test\\java\\CucumberFramework\\Resources\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
	}
	
	@Given("^User navigate to stackoverflow\\.com\\.$")
	public void user_navigate_to_stackoverflow_com() throws Throwable {

	}

	@And("^User click on the login button on Home Page\\.$")
	public void user_click_on_the_login_button_on_Home_Page() throws Throwable {

	}

	@And("^User enters valid User Name\\.$")
	public void user_enters_valid_User_Name() throws Throwable {

	}

	@And("^User enters valid password\\.$")
	public void user_enters_valid_password() throws Throwable {

	}

	@When("^User clicks on the login button\\.$")
	public void user_clicks_on_the_login_button() throws Throwable {

	}

	@Then("^User should be taken to successful login page\\.$")
	public void user_should_be_taken_to_successful_login_page() throws Throwable {

	}
	
}
