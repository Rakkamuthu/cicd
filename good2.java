package going;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class good2 {

	@Test
	public void second() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']")).click();
		
		String title2=driver.getTitle();
		Assert.assertEquals(title2, "orangeHrm");
		
		
		
	
	}
	
	
	
	
	
	
}
