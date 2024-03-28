import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchAndAddToCart {
	
	
	@Test
	public void AddToCart() throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://bookcart.azurewebsites.net//");
	driver.manage().window().maximize();
	/*WebElement search=driver.findElement(By.xpath("//input[@type='search']"));
	search.sendKeys("");
	search.click();*/
	//WebElement Book1=driver.findElement(By.xpath("//button[@class='mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base']"));
	//WebElement Book1=driver.findElement(By.xpath("//button[@fdprocessedid='w8cc9kn']"));
		
		//LogIn();
	WebElement Book1=driver.findElement(By.xpath("(//span[@class='mdc-button__label'])[5]"));
	Book1.click();
	Book1.click();
	//WebElement Book2=driver.findElement(By.xpath("//button[@fdprocessedid='d86m1e']"));
	WebElement Book2=driver.findElement(By.xpath("(//span[@class='mdc-button__label'])[6]"));
	Book2.click();
	Book2.click();
	//WebElement Book3=driver.findElement(By.xpath("//button[@fdprocessedid='zn887']"));
	WebElement Book3=driver.findElement(By.xpath("(//span[@class='mdc-button__label'])[7]"));
	Book3.click();
	Thread.sleep(5000);
	WebElement ShoppingCart=driver.findElement(By.xpath("//button[@ng-reflect-router-link='/shopping-cart']"));
	ShoppingCart.click();
	
	//driver.get("https://bookcart.azurewebsites.net/shopping-cart");
	
	WebElement cartLabel=driver.findElement(By.xpath("//span[@class='mat-badge-content mat-badge-active']"));
	String totalItems=cartLabel.getText();
	System.out.println("cartLabel"+totalItems);
	Assert.assertEquals(totalItems,"5");
	
	//Thread.sleep(1000);
	//WebElement cart =driver.findElement(By.xpath("(//mat-icon[@class='mat-icon notranslate mat-badge mat-badge-warn material-icons mat-ligature-font mat-icon-no-color mat-badge-overlap mat-badge-above mat-badge-after mat-badge-medium'])[1]"));
	//cart.click();
	
	//WebElement qty=driver.findElement(By.xpath("//mat-icon[@class="mat-icon notranslate mat-badge mat-badge-warn material-icons mat-ligature-font mat-icon-no-color mat-badge-overlap mat-badge-above mat-badge-after mat-badge-medium"]"));
	
	//String cartLabel=driver.findElement(By.xpath("//span[@id='mat-badge-content-0']")).getText();
	
	
	
	//WebElement checkout=driver.findElement(By.xpath("//span[contains(text(),'CheckOut')]"));
	//checkout.click();
	
	//String TotalPriceOfCart=driver.findElement(By.xpath("(//td[@class='mat-mdc-cell mdc-data-table__cell cdk-cell cdk-column-action mat-column-action\'])[5]")).getText();
	String TotalPriceOfCart=driver.findElement(By.cssSelector("body.mat-typography:nth-child(2) div.container app-shoppingcart.ng-star-inserted:nth-child(2) mat-card.mat-mdc-card.mdc-card.my-4 mat-card-content.mat-mdc-card-content.ng-star-inserted:nth-child(3) td.mat-mdc-cell.mdc-data-table__cell.cdk-cell.cdk-column-action.mat-column-action:nth-child(5) > strong:nth-child(1)")).getText();
	Assert.assertEquals(TotalPriceOfCart,"₹1,217.00");
	//WebElement Bookitem=driver.findElement(By.xpath("//img[@src='/Upload/9d8f4978-0ef8-42d0-873a-4eb583439237HP2.jpg']"));
	//Bookitem.click();
	//driver.get("https://bookcart.azurewebsites.net/books/details/2");
	//WebElement AddToCart=driver.findElement(By.xpath("//span[contains(text(), 'Add to Cart')]"));
	//AddToCart.click();
	//(//button[@class="mdc-icon-button mat-mdc-icon-button mat-warn mat-mdc-button-base"])[2]+
	//button[@class="mdc-icon-button mat-mdc-icon-button mat-warn mat-mdc-button-base"])[1]-
	
	//WebElement bookcart=driver.findElement(By.xpath("//button[@fdprocessedid='tg721']"));
	//bookcart.click();
	//WebElement checkout=driver.findElement(By.xpath("//span[contains(text(),'CheckOut')]"));
	//checkout.click();
	//driver.quit();	
	
}

}
