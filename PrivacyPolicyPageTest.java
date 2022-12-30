import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class PrivacyPolicyPageTest {
    @BeforeSuite
    void setUp(){
        SetUp.initialize();
        PrivacyPolicyPage.PrivacyPolicypage(SetUp.driver).click();

    }
    @Test
    void PrivacyPolicyPageIsOpened() throws InterruptedException {
        PrivacyPolicyPage.waitBeforeVisible(PrivacyPolicyPage.PrivacyPolicypage(SetUp.driver));
        String actualTitle=SetUp.driver.getTitle();
        String expectedTitle="Privacy Policy Page";
        Assert.assertEquals(expectedTitle,actualTitle,"Privacy Policy Page is not opened in new tab");
    }





    @Test
    void EnglishLangIconIsDisplayed() throws InterruptedException {
        PrivacyPolicyPage.waitBeforeVisible(PrivacyPolicyPage.engLanguageIcon(SetUp.driver));
        Assert.assertTrue(PrivacyPolicyPage.engLanguageIcon(SetUp.driver).isDisplayed(),"English language icon is not displayed");
    }
    @Test
    void SpanishLangIconIsDisplayed() throws InterruptedException {
        PrivacyPolicyPage.waitBeforeVisible(PrivacyPolicyPage.spanishLanguageIcon(SetUp.driver));
        Assert.assertTrue(PrivacyPolicyPage.spanishLanguageIcon(SetUp.driver).isDisplayed(),"English language icon is not displayed");
    }
    @Test
    void FrenchLangIconIsDisplayed() throws InterruptedException {
        PrivacyPolicyPage.waitBeforeVisible(PrivacyPolicyPage.frenchLanguageIcon(SetUp.driver));
        Assert.assertTrue(PrivacyPolicyPage.frenchLanguageIcon(SetUp.driver).isDisplayed(),"English language icon is not displayed");
    }
    @Test
    void italianLangIconIsDisplayed() throws InterruptedException {
        PrivacyPolicyPage.waitBeforeVisible(PrivacyPolicyPage.italianLanguageIcon(SetUp.driver));
        Assert.assertTrue(PrivacyPolicyPage.italianLanguageIcon(SetUp.driver).isDisplayed(),"English language icon is not displayed");
    }
    @Test
    void GermanLangIconIsDisplayed() throws InterruptedException {
        PrivacyPolicyPage.waitBeforeVisible(PrivacyPolicyPage.germanLanguageIcon(SetUp.driver));
        Assert.assertTrue(PrivacyPolicyPage.germanLanguageIcon(SetUp.driver).isDisplayed(),"English language icon is not displayed");
    }
    @Test
    void RussianLangIconIsDisplayed() throws InterruptedException {
        PrivacyPolicyPage.waitBeforeVisible(PrivacyPolicyPage.russianLanguageIcon(SetUp.driver));
        Assert.assertTrue(PrivacyPolicyPage.russianLanguageIcon(SetUp.driver).isDisplayed(),"English language icon is not displayed");
    }
    @Test
    void JapaneseLangIconIsDisplayed() throws InterruptedException {
        PrivacyPolicyPage.waitBeforeVisible(PrivacyPolicyPage.japaneseLanguageIcon(SetUp.driver));
        Assert.assertTrue(PrivacyPolicyPage.japaneseLanguageIcon(SetUp.driver).isDisplayed(),"English language icon is not displayed");
    }
    @Test
    void PortugueseLangIconIsDisplayed() throws InterruptedException {
        PrivacyPolicyPage.waitBeforeVisible(PrivacyPolicyPage.portugueseLanguageIcon(SetUp.driver));
        Assert.assertTrue(PrivacyPolicyPage.portugueseLanguageIcon(SetUp.driver).isDisplayed(),"English language icon is not displayed");
    }
    @Test
    void brazilianLangIconIsDisplayed() throws InterruptedException {
        PrivacyPolicyPage.waitBeforeVisible(PrivacyPolicyPage.brazilianLanguageIcon(SetUp.driver));
        Assert.assertTrue(PrivacyPolicyPage.brazilianLanguageIcon(SetUp.driver).isDisplayed(),"English language icon is not displayed");
    }
   @AfterSuite
    void tearDown(){
      SetUp.quit();
    }
}
