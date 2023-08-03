package simplilearn.testsComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testscenario2 {
	public static WebDriver driver;

	@Test()
	public void test1() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/medicare/");
		Thread.sleep(5000);	
	}
	@Test
	public void testScenario() throws InterruptedException {
		 
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.findElement(By.id("username")).sendKeys("potdar7@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Datta@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@id='listProducts']/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[2]/span[1]")).click();
	String product =driver.findElement(By.xpath("//div[@class=\"col-sm-10\"]/h4")).getText();
		System.out.println(product);
		
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//input[@id='cardNumber']")).sendKeys("342347633249");
		driver.findElement(By.xpath("//input[@id='expityMonth']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@id='expityYear']")).sendKeys("2030");
		driver.findElement(By.xpath("//input[@id='cvCode']")).sendKeys("223");
		driver.findElement(By.xpath("//a[@role='button']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-lg btn-warning']")).click();
		
	}
	@Test
	public void testScenario2() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/medicare/");
		Thread.sleep(5000);	
		
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.findElement(By.id("username")).sendKeys("potdar7@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Datta@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@id='listProducts']/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[2]/span[1]")).click();
	String product =driver.findElement(By.xpath("//div[@class=\"col-sm-10\"]/h4")).getText();
		System.out.println(product);
		
		driver.findElement(By.xpath("//a[@class='btn btn-warning']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[6]/a[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//input[@id='cardNumber']")).sendKeys("342347633249");
		driver.findElement(By.xpath("//input[@id='expityMonth']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@id='expityYear']")).sendKeys("2030");
		driver.findElement(By.xpath("//input[@id='cvCode']")).sendKeys("223");
		driver.findElement(By.xpath("//a[@role='button']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-lg btn-warning']")).click();
		
		
	
		
	}
	
	
	
	
	
}
