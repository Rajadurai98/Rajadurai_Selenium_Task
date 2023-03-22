package task.java;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Write code for taking Screenshot
public class _08_Task_ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Codoid_Selenium_Task" + "\\driver\\chromedriver.exe");
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeoptions);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\User\\eclipse-workspace\\Codoid_Selenium_Task\\snap\\Premium_Goat.png");
		FileHandler.copy(src, des);

	}

}
