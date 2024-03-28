import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_AddToCartVarifyQuantityAndTotalPrice {


	@Test
	public void AddToCart() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://bookcart.azurewebsites.net//");
		driver.manage().window().maximize();

		WebElement Book1=driver.findElement(By.xpath("(//span[@class='mdc-button__label'])[5]"));
		Book1.click();
		Book1.click();

		WebElement Book2=driver.findElement(By.xpath("(//span[@class='mdc-button__label'])[6]"));
		Book2.click();
		Book2.click();

		WebElement Book3=driver.findElement(By.xpath("(//span[@class='mdc-button__label'])[7]"));
		Book3.click();
		Thread.sleep(5000);
		WebElement ShoppingCart=driver.findElement(By.xpath("//button[@ng-reflect-router-link='/shopping-cart']"));
		ShoppingCart.click();


		WebElement cartLabel=driver.findElement(By.xpath("//span[@class='mat-badge-content mat-badge-active']"));
		String totalItems=cartLabel.getText();
		System.out.println("TotalItemsInCart: "+totalItems);
		Assert.assertEquals(totalItems,"5");
		
		String TotalPriceOfCart=driver.findElement(By.xpath("//mat-card[1]/mat-card-content[2]/td[5]/strong")).getText();
		//String TotalPriceOfCart=driver.findElement(By.cssSelector("body.mat-typography:nth-child(2) div.container app-shoppingcart.ng-star-inserted:nth-child(2) mat-card.mat-mdc-card.mdc-card.my-4 mat-card-content.mat-mdc-card-content.ng-star-inserted:nth-child(3) td.mat-mdc-cell.mdc-data-table__cell.cdk-cell.cdk-column-action.mat-column-action:nth-child(5) > strong:nth-child(1)")).getText();
		System.out.println("TotalPrice   :"+TotalPriceOfCart);
		Assert.assertEquals(TotalPriceOfCart,"₹1,217.00");

		//driver.quit();	

	}

}


