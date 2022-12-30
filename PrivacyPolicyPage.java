import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//page object patern
public class PrivacyPolicyPage {
     static WebElement element=null;
    static WebDriverWait wait=new WebDriverWait(SetUp.driver, Duration.ofSeconds(20));


    static WebElement PrivacyPolicypage(WebDriver driver){
           element=SetUp.driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy') and @href='https://store.steampowered.com/privacy_agreement/?snr=1_44_44_']"));
           return element;
    }
    static WebElement waitBeforeVisible(WebElement element1) throws InterruptedException {
            return wait.until(ExpectedConditions.visibilityOf(element1));
    }

    //page title
    public void getPageTitle(WebDriver driver){
         String pageTitle= SetUp.driver.getTitle();  //privacy policy page title
    }

    //language icons for translating page
     static WebElement engLanguageIcon(WebDriver driver){
        element=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/shared/images/responsive/logo_valve_footer.png']"));
        return element;
    }
     static WebElement spanishLanguageIcon(WebDriver driver){
        element=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/spanish.gif']"));
        return element;
    }
     static WebElement frenchLanguageIcon(WebDriver driver){
        element=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/french.gif']"));
        return element;
    }
     static WebElement germanLanguageIcon(WebDriver driver){
        element=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/german.gif']"));
        return element;
    }
     static WebElement italianLanguageIcon(WebDriver driver){
        element=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/italian.gif']"));
        return element;
    }
     static WebElement russianLanguageIcon(WebDriver driver){
        element=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/russian.gif']"));
        return element;
    }
     static WebElement japaneseLanguageIcon(WebDriver driver){
        element=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/japanese.gif']"));

        return element;
    }
    static WebElement portugueseLanguageIcon(WebDriver driver){
        element=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/portuguese.gif']"));
        return element;
    }


    static WebElement brazilianLanguageIcon(WebDriver driver){
        element=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/brazilian.gif']"));
        return element;
    }

   // static String revisionDateTxt=SetUp.driver.findElement(By.xpath("//i[text()='Revision Date: February 16, 2022']")).toString();

}