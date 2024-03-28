
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchChrome {
@Test
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		//List <WebElement> Elements=driver.findElements(By.xpath("//*[text()='Work from home essentials']//parent::div//following-sibling::div//span"));
		//System.out.println("Total WebElements:"+Elements.size());
		//for(WebElement e1:Elements) {
		//	System.out.println("WebElements:"+e1.getText());
		//}
		
		/*List <WebElement> Elements=driver.findElements(By.xpath("//div[@id='s-refinements']//div[1]//ul[1]//li"));
		System.out.println("Total WebElements:"+Elements.size());
		for(WebElement e1:Elements) {
		System.out.println("WebElements:"+e1.getText());
		}*/
		
		
		//driver.close();
		
	}

}
