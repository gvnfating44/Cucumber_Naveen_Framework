//package stepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class LoginStepDefinition {
//
//	WebDriver driver;
//
//	// crm password : govindukd
//
//	@Given("^User is already on Login Page$")
//	public void user_is_already_on_Login_Page() throws Throwable {
//
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\rohan\\Downloads\\govind\\Newdriver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://ui.cogmento.com/");
//	}
//
//	@When("^title of login page is Cogmento CRM$")
//	public void title_of_login_page_is_Cogmento_CRM() throws Throwable {
//		String actualtitle = driver.getTitle();
//		System.out.println(actualtitle);
//		String expectedtitle = "Cogmento CRM";
//		Assert.assertEquals(expectedtitle, actualtitle);
//
//	}
//
//	@Then("^user enter \"(.*)\" and \"(.*)\"$")
//	public void user_enter_username_and_password(String username, String passsword) throws Throwable {
//
//		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
//		email.sendKeys(username);
//
//		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys(passsword);
//
//	}
//
//	@Then("^user click on login button$")
//	public void user_click_on_login_button() throws Throwable {
//
//		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() throws Throwable {
//		boolean veryfyhomepage = driver.findElement(By.xpath("//span[@class='user-display']")).isDisplayed();
//		System.out.println(veryfyhomepage);
//		Assert.assertTrue(veryfyhomepage);
//	}
//	
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() {
//		
//		Actions a= new Actions(driver);
//		WebElement contacts=driver.findElement(By.xpath("//a[@href='/contacts']"));
//		WebElement addbutton=driver.findElement(By.xpath("//div[@id='main-nav']/div[3]/button"));
//		a.moveToElement(contacts).build().perform();
//		//a.moveToElement(addbutton).click().build().perform();
//		addbutton.click(); 
//	    
//	}
//
//	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_contact_details_and_and(String firstname, String lastname, String position) throws InterruptedException {
//		
//		 driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
//		    driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
//		    driver.findElement(By.xpath("//input[@name='position']")).sendKeys(position);
//		    driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
//		    Thread.sleep(8000);
//	    
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() throws Throwable {
//		driver.quit();
//	}
//}
