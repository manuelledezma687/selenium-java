package testexample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testFormBlazeDemo {

    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","//home//manuelledezma//IdeaProjects//myFirstTest//geckodriver") ;
        WebDriver driver = new FirefoxDriver();

        driver.get("https://blazedemo.com/");
        driver.findElement(By.name("fromPort")).sendKeys("Paris");
        driver.findElement(By.name("toPort")).sendKeys("Buenos Aires");
        driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
        driver.findElement(By.id("inputName")).sendKeys("Mike");
        driver.findElement(By.id("address")).sendKeys("PO BOX 123");
        driver.findElement(By.id("city")).sendKeys("Phoenix");
        driver.findElement(By.id("state")).sendKeys("Arizona");
        driver.findElement(By.id("zipCode")).sendKeys("85005");

        Select ccard = new Select(driver.findElement(By.id("cardType")));
        ccard.selectByVisibleText("Visa");
        driver.findElement(By.id("creditCardNumber")).sendKeys("8504322034540987");
        driver.findElement(By.id("nameOnCard")).sendKeys("Mike Myers");
        driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
        driver.quit();


    }

}
