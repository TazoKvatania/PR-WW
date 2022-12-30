import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class PrivacyPolicyPageTest {
    @BeforeSuite
    public void setUp() { //setup for test
        SetUp.initialize();
        PrivacyPolicyPage ppa=new PrivacyPolicyPage();
        ppa.goToPrivacyPolicyPage();    //I am using this method to click on privacy policy , but it does not work in this class
        //SetUp.driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy') and @href='https://store.steampowered.com/privacy_agreement/?snr=1_44_44_']")).click();
    }

    @Test
    public void verifyPrivacyPolicyPageInNewTab(){  //checking if title is matching expected title to know if privacy policy page is opened in new tab
        Assert.assertEquals(SetUp.driver.getTitle(),"Privacy Policy Agreement","Privacy Policy page is not opened or title is wrong");
    }
    @Test
    public void verifyEnglishLangIcon(){
        Assert.assertTrue(PrivacyPolicyPage.englishLanguageIcon.isDisplayed(),"English language icon is not displayed");
    }
    @Test
    public void verifySpanishLangIcon(){
        Assert.assertTrue(PrivacyPolicyPage.spanishLanguageIcon.isDisplayed(),"Spanish language icon is not displayed");
    }
    @Test
    public void verifyItalianLangIcon(){
        Assert.assertTrue(PrivacyPolicyPage.italianLanguageIcon.isDisplayed(),"italian language icon is not displayed");
    }
    @Test
    public void verifyFrenchLangIcon(){
        Assert.assertTrue(PrivacyPolicyPage.frenchLanguageIcon.isDisplayed(),"French language icon is not displayed");
    }
    @Test
    public void verifyGermanLangIcon(){
        Assert.assertTrue(PrivacyPolicyPage.germanLanguageIcon.isDisplayed(),"German language icon is not displayed");
    }
    @Test
    public void verifyRussianLangIcon(){
        Assert.assertTrue(PrivacyPolicyPage.russianLanguageIcon.isDisplayed(),"Russian language icon is not displayed");
    }
    @Test
    public void verifyJapaneseLangIcon(){
        Assert.assertTrue(PrivacyPolicyPage.japaneseLanguageIcon.isDisplayed(),"Japanese language icon is not displayed");
    }
    @Test
    public void verifyPortugueseLangIcon(){
        Assert.assertTrue(PrivacyPolicyPage.portugueseLanguageIcon.isDisplayed(),"Portuguese language icon is not displayed");
    }
    @Test
    public void verifyBrazilianLangIcon(){
        Assert.assertTrue(PrivacyPolicyPage.brazilianLanguageIcon.isDisplayed(),"Brazilian language icon is not displayed");
    }
    @Test
    public void checkRevisionDate(){
      Assert.assertTrue(PrivacyPolicyPage.revisionDateTxt.contains("2022"),"Revision date does not match current year");
    }



   @AfterSuite
   public void tearDown(){ //this method quits browser after testing session
        SetUp.quit();

    }
}
