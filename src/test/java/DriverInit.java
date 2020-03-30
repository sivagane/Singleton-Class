import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {
	
	private static DriverInit driverInstance=null;
	public WebDriver d;
	private DriverInit() {
		
	}
	public WebDriver openbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Singleton\\div\\chromedriver.exe");
		d=new ChromeDriver();
		return d;
		}
	public static DriverInit getInstance() {
		if(driverInstance==null) 
			driverInstance=new DriverInit();
			return driverInstance;
	}
}
