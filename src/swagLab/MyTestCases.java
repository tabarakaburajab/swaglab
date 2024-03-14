package swagLab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {

	WebDriver driver= new ChromeDriver();	
@BeforeTest 	
public void Setup() throws InterruptedException {
	
	String myURL="https://www.saucedemo.com/";
	
	driver.get(myURL);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	}

@Test
public void Login() throws InterruptedException {
	
	WebElement standard_user= driver.findElement(By.id("user-name"));
	standard_user.sendKeys("standard_user");
	 WebElement password= driver.findElement(By.id("password"));// this is for the first page in w0ebsite
	 password.sendKeys("secret_sauce");	
	WebElement login_button=driver.findElement(By.id("login-button"));
    login_button.click();	
	WebElement firstItemAddToCartButton= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));//لازم تيجي بعد صفحة login
	                                                              // لانه هاي الصفحة مافي اضافة للسلة فلازم اعمل تسجيل دخول بعدين بعكتبها
	firstItemAddToCartButton.click();

	
	
	
	
	//driver.get("https://www.google.jo/?hl=ar");
	//Thread.sleep(2000);
    //System.out.println(driver.getTitle());
	//driver.navigate().back();
	//Thread.sleep(2000);
	//driver.navigate().forward();

	
}

@AfterTest
public void AfterTesting() {
	
	
	
}

	
	
	
	
	
	
	
	
	
}
