package task.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class _06_Task_Multiple_Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Codoid_Selenium_Task" + "\\driver\\chromedriver.exe");
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeoptions);
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		Select se=new Select(driver.findElement(By.id("oldSelectMenu")));
		se.selectByVisibleText("Blue");
		
		
	}

}
