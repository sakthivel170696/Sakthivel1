package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saw1 {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium5\\Driver\\chromedriver.exe");
	
	WebDriver a=new ChromeDriver();
	a.get("https://www.flipkart.com/");
//	a.manage().window().maximize();
//a.manage().timeouts().implicitlyWait(04, TimeUnit.SECONDS);
	a.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(3000);
	
	a.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("realme mobile",Keys.ENTER);
	Thread.sleep(3000);	
	
String wh = a.getWindowHandle();
a.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();	
	a.switchTo().window(wh);
	a.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();	
	a.switchTo().window(wh);
	a.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
	a.switchTo().window(wh);
	a.findElement(By.xpath("(//div[@class='_4rR01T'])[4]")).click();
	a.switchTo().window(wh);
	a.findElement(By.xpath("(//div[@class='_4rR01T'])[5]")).click();
	a.switchTo().window(wh);
	
	Set<String> windowh = a.getWindowHandles();
	for (String abc : windowh) {
		if(!wh.equals(abc)) {
			System.out.println(abc);
			a.switchTo().window(abc);	
		}}
		Thread.sleep(1000);
		 WebElement gettext2 = a.findElement(By.xpath("//div[@class='_4rR01T'])[1]"));
		 String text = gettext2.getText();
		System.out.println(text);
		a.close();	
	
	}
}
