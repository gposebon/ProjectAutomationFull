package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;

	public WebDriver initApplication() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Usuario\\Documents\\Git\\ProjectAutomation\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		} else if (browserName == "firefox") {
			System.out.println("Firefox");
		} else if (browserName == "IE") {
			System.out.println("IE");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
