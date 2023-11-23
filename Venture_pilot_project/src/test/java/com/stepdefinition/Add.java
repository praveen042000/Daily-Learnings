package com.stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Add {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = driver.getTitle();
        System.out.println("Page title: " + title);
        System.out.println("URL: " + driver.getCurrentUrl());
Thread.sleep(3000);
        WebElement username = driver.findElement(By.xpath("(//label[text()='Username']/following::input)[1]"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//label[text()='Password']/following::input"));
        password.sendKeys("admin123");
        WebElement loginButton = driver.findElement(By.xpath("(//div[@class='oxd-form-actions orangehrm-login-action']//button)"));
loginButton.click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[3]")).click();
        
        driver.findElement(By.xpath("(//nav[@class='oxd-topbar-body-nav']//li)[5]//span")).click();
        WebElement jav= driver.findElement(By.xpath("(//li[@class='oxd-topbar-body-nav-tab --parent'])[3]"));
        	
				
				
//        driver.findElement(By.xpath("//span[text()='Configure ']")).click();
       
        
        
        
          
        
        
        
        
        
        
//        driver.findElement(By.xpath("//a[.='My Info']")).click();
//        Thread.sleep(3000);
//      WebElement name =  driver.findElement(By.xpath("(//label[text()='Employee Full Name']/following::input)[1]"));
//      Thread.sleep(3000);
//      System.out.println(name.getText());
//name.click(); // To ensure focus on the element
//      // Using Robot to simulate Ctrl + A (select all) and Backspace to clear the text
//      Robot robot = new Robot();
//      robot.keyPress(KeyEvent.VK_CONTROL);
//      robot.keyPress(KeyEvent.VK_A);
//      robot.keyRelease(KeyEvent.VK_A);
//      robot.keyRelease(KeyEvent.VK_CONTROL);
//      robot.keyPress(KeyEvent.VK_BACK_SPACE);
//      robot.keyRelease(KeyEvent.VK_BACK_SPACE);
//      // Entering new text after clearing
//      name.sendKeys("Praveen");
//// driver.findElement(By.xpath("//p[text()=' * Required']/following-sibling::button")).click();
////      driver.navigate().refresh();
//      Thread.sleep(3000);
//      WebElement gettext =  driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 --strong']"));
//      System.out.println(gettext.getText());
//      Thread.sleep(3000);
//   // Scroll vertically by 500 pixels
//      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
////      WebElement value =   driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active']//div)[1]"));
//// value.click();
////      Thread.sleep(3000);
////      value.sendKeys("i");
////      value.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
////      WebElement value=  driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[3]"));
//// value.click();
////      value.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
////      
//      driver.findElement(By.xpath("//h6[text()='Attachments']/following-sibling::button")).click();
//      driver.findElement(By.xpath("(//div[@class='oxd-file-div oxd-file-div--active']//div)")).click();  
//      Thread.sleep(3000);
//      Robot rb = new Robot();
//// copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Downloads\\1234.pdf");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//     // press Contol+V for pasting
//     rb.keyPress(KeyEvent.VK_CONTROL);
//     rb.keyPress(KeyEvent.VK_V);
//    // release Contol+V for pasting,
//    rb.keyRelease(KeyEvent.VK_CONTROL);
//    rb.keyRelease(KeyEvent.VK_V);
//    // for pressing and releasing Enter
//    rb.keyPress(KeyEvent.VK_ENTER);
//    rb.keyRelease(KeyEvent.VK_ENTER);
//    Thread.sleep(10000);
//    
//    driver.findElement(By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")).sendKeys("welcome");
//    Thread.sleep(10000);
//    driver.findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[3]")).click();
//    
//    }    
//   
    
}
}