package task.java;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//Write code for handling multiple windows
public class _01_Task_handling_multiple_windows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Codoid_Selenium_Task" + "\\driver\\chromedriver.exe");
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeoptions);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		searchBox.sendKeys("Iphone");
		WebElement click_Btn = driver.findElement(By.xpath("//input[@type='submit']"));
		click_Btn.click();
		WebElement iphone_Img = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/"
				+ "span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		iphone_Img.click();

		// WindowHandling
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		driver.switchTo().window(childwindow);

		WebElement add_To_Cart = driver.findElement(By.id("add-to-cart-button"));
		add_To_Cart.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}

}
