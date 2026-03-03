package projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Applicationnavigation {

	public static void main(String[] args) {
		
		String name = "rahulshettyacademy";
		String password = "Learning@830$3mK2";
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='user']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
		WebElement dropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select values = new Select(dropdown);
		values.selectByVisibleText("Consultant");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.id("signInBtn")).click();
		
			
		
		
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
