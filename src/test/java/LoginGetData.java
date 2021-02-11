import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginGetData {

	public static void main(String[] args) throws IOException {
		
     LoginData d = new LoginData();
     ArrayList data=d.getData("test");
     
  
     
    // System.out.println(data.get(0));
     //System.out.println(data.get(1));
     
     CharSequence cs=(CharSequence) data.get(1);
     String username = cs.toString();
     
     CharSequence cs1=(CharSequence) data.get(2);
     String password=cs1.toString();
     
    // System.out.println(data.get(2));
     System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://google.com");
     driver.get("https://github.com/login");
     driver.findElement(By.id("login_field")).sendKeys(username);
     driver.findElement(By.id("password")).sendKeys(password);
     driver.findElement(By.xpath("//input[@value='Sign in']")).click();
     driver.findElement(By.xpath("//summary[@aria-label='View profile and more']//span[@class='dropdown-caret']")).click();
    Actions a = new Actions(driver);
     a.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Sign out')]"))).click();
     
	}

}
