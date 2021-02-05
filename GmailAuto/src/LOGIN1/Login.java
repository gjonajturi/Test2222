package LOGIN1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gjonaj\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com");
		driver.findElement(By.id("identifierId")).sendKeys("gjonaj.turi");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierNext")).click();
		

	}

}
