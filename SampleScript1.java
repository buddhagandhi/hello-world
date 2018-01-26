package FireFoxPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleScript1 {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.gmail.com");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[1]/div[1]/div/div[1]/div/div[1]/input")).sendKeys("buddha.gandhi8");	
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/content/span")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div/div/div[1]/div/div[1]/input")).sendKeys("gandhi1@tolstoy");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/div[2]/div[1]/div/content/span")).click();
	}	
}
