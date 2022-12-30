import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://store.steampowered.com/");

    }



    public static void quit(){              //method to quit browser
        System.out.println("browser quit");
        driver.quit();
        driver=null;
    }
}
