package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    private Properties properties;
    private String browserName;
    private  String url;

    public static WebDriver webDriver;

    @BeforeClass
    public void setUp() {
        try {
            properties = new Properties();
            properties.load(BaseTest.class.getClassLoader().getResourceAsStream("config.properties"));
            browserName = properties.getProperty("browser");

            if (browserName.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                FirefoxOptions options = new FirefoxOptions();
                WebDriver driver = new FirefoxDriver(options);
            } else {
                webDriver = null;
            }

            if (webDriver != null) {
                url = properties.getProperty("url");
                System.out.println("URL is taken from config file");
                webDriver.get(url);
                webDriver.manage().window().maximize();
                webDriver.manage().deleteAllCookies();
                webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
                webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @AfterClass
    public void closeDriver() {
        webDriver.quit();
    }

    public static void main(String[] args) {

    }
}
