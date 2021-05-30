//package stepDefinitions;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class DealsStepDefinition {
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
//	@Then("^user enter username and password$")
//	public void user_enter_username_and_password(DataTable credentials) throws Throwable {
//
//		List<List<String>> data=credentials.raw();
//		
//		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
//		email.sendKeys(data.get(0).get(0));
//
//		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys(data.get(0).get(1));
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
//	@Then("^user moves to new deal page$")
//	public void user_moves_to_new_deal_page() {
//		
//		Actions a= new Actions(driver);
//		WebElement deals=driver.findElement(By.xpath("//i[@class='money icon']"));
//		WebElement addbutton=driver.findElement(By.xpath("//div[@class='ui fluid container']/div/div[5]/button/i"));
//		a.moveToElement(deals).build().perform();
//		//a.moveToElement(addbutton).click().build().perform();
//		addbutton.click(); 
//	    
//	}
//
//	@Then("^user enters deal details$")
//	public void user_enters_deals_details(DataTable dealdata ) throws InterruptedException {
//		List<List<String>> data=dealdata.raw();
//		 driver.findElement(By.xpath("//input[@name='title']")).sendKeys(data.get(0).get(0));
//		    driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(data.get(0).get(1));
//		    driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(data.get(0).get(2));
//		    driver.findElement(By.xpath("//input[@name='commission']")).sendKeys(data.get(0).get(3));
//		    driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//		    Thread.sleep(8000);
//	    
//	}
//	
//	@Then("^close the browser$")
//	public void close_the_browser() throws Throwable {
//		driver.quit();
//	}
//}
