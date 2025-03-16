import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class VerifyLoginPage {
@Test
public void login() {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://demowebshop.tricentis.com/login");
driver.findElement(By.id("Email")).sendKeys("sowmya");
driver.findElement(By.id("Password")).sendKeys("123456");
driver.findElement(By.xpath("//input[@value='Log in']")).click();

ExtentSparkReporter spark=


}
}