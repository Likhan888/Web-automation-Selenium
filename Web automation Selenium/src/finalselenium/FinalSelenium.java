package finalselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinalSelenium {

public static void main(String[]args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",

"C:\\Users\\LIKHAN\\Desktop\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

WebDriver driver= new ChromeDriver(); driver.get("http://demo.openmrs.org/openmrs/" +"/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Admin");
Thread.sleep(3000);
driver.findElement(By.id("password")).sendKeys("Admin123");

Thread.sleep(3000);
driver.findElement(By.id("Inpatient Ward")).click();
Thread.sleep(3000);
driver.findElement(By.id("loginButton")).click();

//driver.close(); if(actual.equalsIgnoreCase(expected))
{
//System.out.println("Test Successfully");
}
{
//System.out.println("Test fail");
}

}}
