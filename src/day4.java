
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4 {
    public static void main(String args[])
    {
        System.setProperty("web-driver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebElement chkbox= driver.findElement(By.cssSelector("input[value=\"option-1\"]"));
        System.out.println(chkbox.getLocation());
    }
}
