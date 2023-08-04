package simplilearn.testsComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {
	public static WebDriver driver;
	
	@Test()
	public void test1() throws InterruptedException
	{	ChromeOptions opt=new ChromeOptions();
	   opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/medicare/");
		Thread.sleep(5000);	
	}
	
	@Test ()
	public void test2() {
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Datta");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Potdar");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("potdar85@gmail.com");
		driver.findElement(By.xpath("//input[@id='contactNumber']")).sendKeys("7066401400");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Datta@123");
		
		driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Datta@123");
		driver.findElement(By.xpath("//input[@id='role1']")).click();
		driver.findElement(By.xpath("//button[@name='_eventId_billing']")).click();
		
		driver.findElement(By.xpath("//input[@id='addressLineOne']")).sendKeys("Adarsh nagar");
		driver.findElement(By.xpath("//input[@id='addressLineTwo']")).sendKeys("sahyadri colony");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("pune");
		
		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("401015");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//button[@name='_eventId_confirm']")).click();
		
		String name =driver.findElement(By.xpath("//div[@class=\"panel-body\"]/div/h3/strong")).getText();
		
		System.out.println("Name = "+name);
		
		driver.findElement(By.xpath("//div[@class='text-center']/a")).click();
	String welcome  =	driver.findElement(By.xpath("//div[@class=\"text-center\"]/h1")).getText();
		
		System.out.println("welcome text = "+ welcome);
		
		driver.findElement(By.xpath("//div[@class=\"text-center\"]/div/a")).click();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("potdar85@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Datta@123");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
	String dashboardaName=	driver.findElement(By.xpath("//li[@id=\"userModel\"]/a")).getText();
		System.out.println("DashboardName is = "+dashboardaName);
	}
	

}
