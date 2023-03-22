package task.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//Write code for handling Frames
public class _04_Handling_Frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Codoid_Selenium_Task" + "\\driver\\chromedriver.exe");
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeoptions);
		driver.get("https://letcode.in/frame");
		// Switching frame using index
		driver.switchTo().frame(0);

		WebElement firstname = driver.findElement(By.name("fname"));
		firstname.sendKeys("Raja");
		WebElement lastname = driver.findElement(By.name("lname"));
		lastname.sendKeys("d");

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rajadurai1998@gmail.com");

		// move to parent frame
		driver.switchTo().parentFrame();
		WebElement lastnam = driver.findElement(By.name("lname"));
		lastnam.sendKeys("Durai");
	}
}