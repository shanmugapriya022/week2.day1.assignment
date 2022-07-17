package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		System.getProperty("Webdriver.Chromedriver");
		System.out.println("property");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement Logout=driver.findElement(By.className("decorativeSubmit"));
		String attribute=Logout.getAttribute("value");
		System.out.println(attribute);
		if (attribute.equals("Logout"))
		{
			System.out.println("successfully logged in");
		}
		}
	}

