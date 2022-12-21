
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.datatype.Duration;
import java.util.concurrent.TimeUnit;

public class SetUp {




    public static WebDriver driver=null;
    //singleton pattern

    public static void initialize(){            //chrome driver setup singeleton element
        if(driver==null){
            WebDriverManager.chromedriver().setup();
             driver=new ChromeDriver();

        }



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.navigate().to("https://store.steampowered.com/");

    }



    public static void quit(){              //method to quit browser
        System.out.println("browser quit");
        driver.quit();
        driver=null;
    }
}
