import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_SignIn {
	@Test
	public void signin() {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://bookcart.azurewebsites.net//");
		WebElement lgbtn= driver.findElement(By.xpath("(//span[contains(text(),'Login')])"));//button[@ng-reflect-router-link='/login']
		//WebElement lgbtn= driver.findElement(By.xpath("(//span[@class='mat-mdc-button-persistent-ripple mdc-button__ripple'])[2]"));
		lgbtn.click();
		 WebElement user = driver.findElement(By.xpath("//input[@formcontrolname='username']"));//input[@id="mat-input-0"]
		user.sendKeys("AaZambare");
		 WebElement pass = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
		pass.sendKeys("Password@123");
		WebElement loginbtn = driver.findElement(By.xpath("//span[text()='Login']"));
		loginbtn.click();
		//WebElement loginbtn = driver.findElement(By.xpath("//button[@fdprocessedid='bnaohn']"));
		// loginbtn.click();
	}
}
