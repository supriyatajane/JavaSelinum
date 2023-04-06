import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class day5 {
    public static void main(String args[])
    {
        System.setProperty("web-driver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
        ChromeDriver driver=new ChromeDriver();

        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
        WebElement fn=driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
        WebElement ln=driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
        WebElement em=driver.findElement(By.cssSelector("input[name=\"email\"]"));
        WebElement msg=driver.findElement(By.cssSelector("textarea[name=\"message\"]"));
        WebElement btn=driver.findElement(By.cssSelector("input[type=\"submit\"]"));
        //btn.click();
     WebElement tag=driver.findElement(By.tagName("h2"));
     //isDisplayed
        if(tag.isDisplayed())
        {
            System.out.println("testcaes is pass");
        }
        else{
            System.out.println("testcase is not pass");
        }

        fn.sendKeys("supriya");
        ln.sendKeys("Tajane");
        em.sendKeys("sup@1234");
        msg.sendKeys("i am tester");
        btn.click();

       // driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        System.out.println(driver.findElement(By.cssSelector("input[value=\"lettuce\"]")).isEnabled());
        System.out.println(driver.findElement(By.cssSelector("input[value=\"cabbage\"]")).isEnabled());
        System.out.println(driver.findElement(By.cssSelector("input[value=\"pumpkin\"]")).isSelected());


        driver.quit();
    }
}
