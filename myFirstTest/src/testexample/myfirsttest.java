package testexample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myfirsttest {

    public static void main(String[] args ){

        System.setProperty("webdriver.gecko.driver","//home//manuelledezma//IdeaProjects//myFirstTest//geckodriver") ;
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("hola");
        driver.quit();
    }

}
