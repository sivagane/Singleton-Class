

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DriverTest  {
WebDriver d;

@BeforeMethod
public void setup() {
	DriverInit driverInstance = DriverInit.getInstance();
	d = driverInstance.openbrowser();
}

@Test
public void test() {
	d.get("https://www.google.co.in/");
	d.findElement(By.xpath("//input[@name='q']")).sendKeys("Greenstechnologys");
	d.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
	
	}

}
