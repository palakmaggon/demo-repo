package com.browserstack;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocalTest extends BrowserStackRemoteTest {

	 public void invokeBrowser() {
         
         try {
                 System.setProperty("webdriver.chrome.driver", "C:\\Users\\GPCTAdmin\\SW\\chromedriver_win32");
                 driver = new ChromeDriver();
                 driver.manage().deleteAllCookies();
                 //maximize the window size
                 driver.manage().window().maximize();
                
                 driver.get("https://www.amazon.com");
                 driver.findElement(By.cssSelector("#nav-signin-tooltip .nav-action-inner")).click();
                 driver.findElement(By.id("ap_email")).sendKeys("9910696411");
                 driver.findElement(By.cssSelector(".a-button-inner > #continue")).click();
                 driver.findElement(By.id("ap_password")).click();
                 driver.findElement(By.id("ap_password")).sendKeys("Palak@123");
                 driver.findElement(By.id("signInSubmit")).click();
                
         } 
         
         catch (Exception e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
         }
 }
	
	
    @Test
    public void test() throws Exception {
    invokeBrowser();

    Assert.assertTrue(true);
    }
}
