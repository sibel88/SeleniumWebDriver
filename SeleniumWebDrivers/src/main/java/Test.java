import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) {
        // Set Driver for Browsers
        System.setProperty("webdriver.chrome.driver","/path/to/chromedriver.exe");// ChromeDriver
        // System.setProperty("webdriver.gecko.driver","/path/to/geckodriver.exe"); // FirefoxDriver

        // Create driver instance
        WebDriver driver = new ChromeDriver();

        // This command open browser and target url
        driver.get("http://google.com");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Driver dispose
        driver.quit();
    }
}
