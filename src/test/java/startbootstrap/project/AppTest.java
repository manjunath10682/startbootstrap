package startbootstrap.project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {

@Test
public void test() {
	Reporter.log("Test is successful--Manjunath");
	System.out.println("Manjunatha");	
}

@BeforeMethod
public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:9090/startbootstrap/register.html");
		driver.close();
		
	}
}
