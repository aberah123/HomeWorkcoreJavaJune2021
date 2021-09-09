package hw10Q2selenium;
/*Create a package "hw10Q2selenium" inside the Selenium project and execute the remaining. Read the question very carefully. Create a class and give a name. choose a website (from the project list, you can use multiple website to show below messages, just create different class) and try to use the below methods. get(), maximize(), click(), isDisplayed(), isEnabled(), isSelected(), navigate(), sendKeys(). Also use all types of locator which are unique (1 of 1).*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cvs {
   WebDriver driver;
   @BeforeTest
   public void beforeTest() throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Aberah\\eclipse-workspace\\HomeWorkCoreJavaJune2021\\driver\\chromedriver.exe");
	   driver = new ChromeDriver();
	   Thread.sleep(3000);
   }
   @Test(priority = 1)
   public void getMethod() throws InterruptedException {
	driver.get("https://www.cvs.com");
	Thread.sleep(3000);
}
   @Test(priority = 2)
   public void getMaximizeMethod() throws InterruptedException {
	  driver.manage().window().maximize();
	  Thread.sleep(3000); 
   }
   @Test(priority = 3)
   public void getClickMethod() throws InterruptedException {
	   driver.findElement(By.xpath("//a[text()='Shop']")).click();
	   Thread.sleep(2000); 
   }
   @Test(priority = 4)
   public void isDisplayed() throws InterruptedException {
	   driver.findElement(By.xpath("(//a[text()='New arrivals'])[1]")).isDisplayed();
	   Thread.sleep(2000);
}
   @Test(priority = 5)
   public void isEnabled() throws InterruptedException {
	   driver.findElement(By.xpath("(//a[@class='addvbtn-full btn-black-outline colorBlack mbottom24'])[1]")).isEnabled();
	   Thread.sleep(3000);  
}
   @Test(priority = 6)
   public void isSelected() throws InterruptedException {
	   driver.findElement(By.xpath("(//a[@class='addvbtn-full btn-black-outline colorBlack mbottom24'])[3]")).isSelected();
	   Thread.sleep(3000);
   }
   @Test(priority = 7)
   public void navigateMethod() throws InterruptedException {
	   driver.navigate().to("https://www.pfizer.com");
	   Thread.sleep(2000);
   }
   @Test(priority = 8)
   public void sendKeyMethod() throws InterruptedException {
	   driver.findElement(By.id("edit-keys")).sendKeys("Pfizer");
	   Thread.sleep(3000);
   }
   
   
   @AfterTest
   public void afterTest() {
	 driver.close();  
   
}
   
}


