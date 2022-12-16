
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;


public class Main {
    public static void main(String[] args) {
        System.setProperty("driver.chrome.webdriver","C:\\Users\\User\\Desktop\\chromedriver.exe"); //setup for webdriver
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://store.steampowered.com/"); //navigating to destination website(store.steampowered.com)
        WebElement button=driver.findElement(By.xpath("//a[@class='global_action_link']")); //creating webelement for login button
        button.click();
        WebElement login_username=driver.findElement(By.xpath("//input[@type='text' and @class='newlogindialog_TextInput_2eKVn']")); //creating webelement for username field
        login_username.sendKeys("someRandomString");
        WebElement login_password=driver.findElement(By.xpath("//input[@type='password' and @class='newlogindialog_TextInput_2eKVn']")); //creating webelement for password field
        login_password.sendKeys("otherRandomString");
        WebElement button1=driver.findElement(By.xpath("//button[@class='newlogindialog_SubmitButton_2QgFE']")); //creating webelement for sign up button
        button1.click();
        String expectedMessage="Please check your password and account name and try again.";
        WebElement message=driver.findElement(By.xpath("//div[@class='newlogindialog_FormError_1Mcy9']")); //creating webelement for output message after invalid sign up
        String actualMessage=message.getText();
        Assert.assertEquals(expectedMessage,actualMessage,"Message is incorrect"); //comparing expected and actual message
    }


}