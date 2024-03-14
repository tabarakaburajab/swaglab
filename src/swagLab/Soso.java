package swagLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Soso {

	WebDriver driver=new ChromeDriver();
	
@BeforeTest
	
  public void BeforeTesting() {
	driver.get("http://127.0.0.1:5500/course.html?soso=");
	driver.switchTo().alert().accept();
	driver.manage().window().maximize();
	
}
	

public void loginTest() throws InterruptedException {
	
//	driver.findElement(By.name("soso")).click();
	WebElement email= driver.findElement(By.xpath("/html/body/form/input[1]"));
	WebElement password=driver.findElement(By.xpath("/html/body/form/input[2]"));
	WebElement Login=driver.findElement(By.name("soso"));
	Thread.sleep(2000);
	email.sendKeys("tabarak233@com");
	Thread.sleep(2000);
    password.sendKeys("12345toto");	
    Thread.sleep(2000);
     Login.click();

	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
