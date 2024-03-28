import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC_Test {

	
	@Test(priority=1,enabled=false)
	public void register()
	{
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://bookcart.azurewebsites.net//");
	driver.manage().window().maximize();
	WebElement lgbtn= driver.findElement(By.xpath("(//span[contains(text(),'Login')])"));
	lgbtn.click();
	WebElement Register= driver.findElement(By.xpath("(//span[contains(text(),'Register')])"));
	Register.click();
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement FirstName= driver.findElement(By.xpath("(//input[@formcontrolname='firstname'])"));
	FirstName.sendKeys("Archana");
	WebElement LastName= driver.findElement(By.xpath("//input[@id='mat-input-3']"));
	LastName.sendKeys("Zambare");
	
	WebElement UserName= driver.findElement(By.xpath("//input[@formcontrolname='username']"));
	UserName.sendKeys("AZambare");
	
	WebElement Password= driver.findElement(By.xpath("//input[@id='mat-input-5']"));
	Password.sendKeys("Password@123");
	
	WebElement cnfrmpass= driver.findElement(By.xpath("//input[@id='mat-input-6']"));
	cnfrmpass.sendKeys("Password@123");
	
	//Gender Selection
	java.util.List<WebElement> Gender=driver.findElements(By.xpath("//input[@type='radio']"));
	for(WebElement e:Gender)
	{
		if(e.getAttribute("value").equalsIgnoreCase("Female")) {
			e.click();
		}
	}
	//WebElement RegtrBtn= driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-user-registration[1]/div[1]/mat-card[1]/mat-card-content[1]/form[1]/mat-card-actions[1]/button[1]/span[2]"));
			//Thread.sleep(1000);
			Actions act=new Actions(driver);
			WebElement RegtrBtn= driver.findElement(By.xpath("//span[text()='Register']"));
			act.click(RegtrBtn).perform();
			WebElement logbtn= driver.findElement(By.xpath("(//span[contains(text(),'Login')])"));//button[@ng-reflect-router-link='/login']
			logbtn.click();
			 WebElement user = driver.findElement(By.xpath("//input[@formcontrolname='username']"));//input[@id="mat-input-0"]
			user.sendKeys("AZambare");
			 WebElement pass = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
			pass.sendKeys("password@123");
			WebElement loginbtn = driver.findElement(By.xpath("//span[text()='Login']"));
			loginbtn.click();
			
}
	@Test(enabled=true)
	public void AddToCart()
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://bookcart.azurewebsites.net//");
	
	WebElement lgbtn= driver.findElement(By.xpath("(//span[contains(text(),'Login')])"));//button[@ng-reflect-router-link='/login']
	//WebElement lgbtn= driver.findElement(By.xpath("(//span[@class='mat-mdc-button-persistent-ripple mdc-button__ripple'])[2]"));
	lgbtn.click();
	 WebElement user = driver.findElement(By.xpath("//input[@formcontrolname='username']"));//input[@id="mat-input-0"]
	user.sendKeys("AZambare");
	
	 WebElement pass = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
	pass.sendKeys("Password@123");
	WebElement loginbtn = driver.findElement(By.xpath("//span[text()='Login']"));
	loginbtn.click();
	
	/*WebElement search=driver.findElement(By.xpath("//input[@type='search']"));
	search.sendKeys("");
	search.click();*/
	WebElement Bookitem=driver.findElement(By.xpath("//img[@src='/Upload/9d8f4978-0ef8-42d0-873a-4eb583439237HP2.jpg']"));
	
	Bookitem.click();
	Bookitem.click();
	driver.get("https://bookcart.azurewebsites.net/books/details/2");
	WebElement AddToCart=driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]"));
	AddToCart.click();
	WebElement BItem1=driver.findElement(By.xpath("(//span[contains (text(),'Add to Cart')])[5]"));
	BItem1.click();
	WebElement cartLabel=driver.findElement(By.xpath("//span[@id=\"mat-badge-content-0\"]"));
	Assert.assertEquals(cartLabel,"5");
	
	/*WebElement Add=driver.findElement(By.xpath("//button[@class='mdc-icon-button mat-mdc-icon-button mat-warn mat-mdc-button-base']"));
	Add.click();
	//WebElement BItem2=driver.findElement(By.xpath("(//span[contains(text(),'Add to Cart')])[4]"));
	//BItem2.click();
	//button[@class="mdc-icon-button mat-mdc-icon-button mat-warn mat-mdc-button-base"])[1]-
	
	WebElement bookcart=driver.findElement(By.xpath("//body/app-root[1]/app-nav-bar[1]/mat-toolbar[1]/mat-toolbar-row[1]/div[3]/button[1]/span[4]"));
	bookcart.click();
	WebElement checkout=driver.findElement(By.xpath("//span[contains(text(),' CheckOut')]"));
	checkout.click();*/
	
	//ChromeDriver driver= new ChromeDriver();
	//driver.get("https://bookcart.azurewebsites.net//");
	driver.quit();
	//	
	
}
	
}
