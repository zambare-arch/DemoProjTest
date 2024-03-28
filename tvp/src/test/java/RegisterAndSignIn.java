import java.time.Duration;
import java.util.List;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterAndSignIn {
	@Test
	public void register() throws InterruptedException
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
		UserName.sendKeys("AaZambare");

		WebElement Password= driver.findElement(By.xpath("//input[@id='mat-input-5']"));
		Password.sendKeys("Password@123");

		WebElement cnfrmpass= driver.findElement(By.xpath("//input[@id='mat-input-6']"));
		cnfrmpass.sendKeys("Password@123");
		Thread.sleep(1000);
		//Gender Selection
		/*List<WebElement> Gender=driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement e:Gender)
		{
			if(e.getAttribute("value").equalsIgnoreCase("Female")) {
				e.click();
			}
		}*/
		
		WebElement Male=driver.findElement(By.xpath("//mat-radio-button[@id='mat-radio-2']"));
		Male.click();
		WebElement Female=driver.findElement(By.xpath("//input[@value='Female']"));
		Female.click();
		
		//WebElement RegtrBtn= driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-user-registration[1]/div[1]/mat-card[1]/mat-card-content[1]/form[1]/mat-card-actions[1]/button[1]/span[2]"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		WebElement RegtrBtn= driver.findElement(By.xpath("//span[text()='Register']"));
		act.click(RegtrBtn).perform();
		WebElement logbtn= driver.findElement(By.xpath("(//span[contains(text(),'Login')])"));//button[@ng-reflect-router-link='/login']
		logbtn.click();
		WebElement user = driver.findElement(By.xpath("//input[@formcontrolname='username']"));//input[@id="mat-input-0"]
		user.sendKeys("AZambare");
		WebElement pass = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
		pass.sendKeys("Password@123");
		WebElement loginbtn = driver.findElement(By.xpath("//span[text()='Login']"));
		loginbtn.click();

	}

}
