import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//page object patern
public class PrivacyPolicyPage {
    //method for going in privacy policy section
    public void goToPrivacyPolicyPage(){ //method to click on privacy policy
        SetUp.driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy') and @href='https://store.steampowered.com/privacy_agreement/?snr=1_44_44_']")).click();
    }
    //page title
    public static String pageTitle=SetUp.driver.getTitle();  //privacy policy page title
    //language icons for translating page
    static WebElement englishLanguageIcon=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/shared/images/responsive/logo_valve_footer.png']"));
    static WebElement spanishLanguageIcon=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/spanish.gif']"));
    static WebElement frenchLanguageIcon=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/french.gif']"));
    static WebElement germanLanguageIcon=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/german.gif']"));
    static WebElement italianLanguageIcon=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/italian.gif']"));
    static WebElement russianLanguageIcon=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/russian.gif']"));
    static WebElement japaneseLanguageIcon=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/japanese.gif']"));
    static WebElement portugueseLanguageIcon=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/portuguese.gif']"));
    static WebElement brazilianLanguageIcon=SetUp.driver.findElement(By.xpath("//img[@src='https://store.cloudflare.steamstatic.com/public/images/languageflags/brazilian.gif']"));
    //revision
    static String revisionDateTxt=SetUp.driver.findElement(By.xpath("//i[text()='Revision Date: February 16, 2022']")).toString();

}
