import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumQACart {

public static WebDriver     driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

    openBrowser("https://hatem-hatamleh.github.io/Selenium-html/wait.html");

   explicityWait();
    // EndMain
    }


    public static void explicityWait (){

      new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions
                .elementToBeClickable(driver.findElement(By.className("primary")))).click();

       // driver.findElement(By.className("primary")).click();
    }
    public static void fram (){

        driver.switchTo().frame("qacart");
        driver.findElement(By.xpath("//input [@class='input'][1]")).sendKeys("mohamed");
driver.findElement(By.xpath("//input [@name='lastName']")).sendKeys("Ahmed");
    }
    public static void alertSendText () throws InterruptedException {
      driver.findElement(By.className("prompt")).click();
        driver.switchTo().alert().sendKeys("mo");
        Thread.sleep(2000);
    driver.switchTo().alert().accept();
    }

    public static void alertGetText (){
     driver.findElement(By.className("alert")).click();
      String x =   driver.switchTo().alert().getText();
        System.out.println(x);
    driver.switchTo().alert().accept();
    }
    public static void dragAndDrop (){

        Actions drag = new Actions(driver);
        WebElement A = driver.findElement(By.cssSelector(".column:nth-of-type(1)"));
        WebElement B = driver.findElement(By.cssSelector(".column:nth-of-type(2)"))  ;
        drag.dragAndDrop(A,B).perform();

    }

        public static void doubelClick (){
            Actions doubelClick = new Actions(driver);
            doubelClick.doubleClick(driver.findElement(By.id("box"))).perform();

        }
        public static void hovering (){
        Actions move = new Actions(driver);
        move.moveToElement(driver.findElement(By.xpath("(//img)[3]"))).perform();

        }

    public static void getAttrubite(){

        String x = driver.findElement(By.cssSelector("[ type=checkbox ]:nth-of-type(2)")).getAttribute("type");
        System.out.println(x);
    }
    public static void drobDown(){
        Select x = new Select(driver.findElement(By.cssSelector("select#dropdown")));
      //  x.selectByVisibleText("Option 2");
     //   x.selectByValue("1");
        x.selectByIndex(1);
    }
    public static void checkBox (){
       //   driver.findElement(By.cssSelector("[ type=checkbox ]:nth-of-type(1)")).click();
       boolean x= driver.findElement(By.cssSelector("[ type=checkbox ]:nth-of-type(2)")).isSelected();
        System.out.println(x);
    }
    public static void openBrowser (String url ){

        driver.get(url);
    }

    public static void findElementByID (String ID){
        driver.findElement(By.id(ID));

    }
    public static void login (){

        driver.findElement(By.cssSelector("[type='text']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
    }

//End
}
