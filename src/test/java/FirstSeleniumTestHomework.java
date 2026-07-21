import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTestHomework {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        //driver.navigate().to("https://www.youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        //driver.navigate().refresh();
    }
    //test "Register new User"

@Test
    public void firstTest(){
    System.out.println("Youtube opened");
    }
    //after-> tearDown
    @AfterMethod(enabled = false)
    public void tearDown(){
       // driver.quit();
        driver.close();//closes only current tub in a browser
    }
}
