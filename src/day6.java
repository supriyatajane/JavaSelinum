import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;
public class day6 {

    public static void main(String args[])
    {
        System.setProperty("web-driver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        //getSize()
        System.out.println(driver.findElement(By.id("nav-logo-sprites")).getSize());
        Dimension d=(driver.findElement(By.id("nav-logo-sprites")).getSize());
        System.out.println(d.height);
        System.out.println(d.width);

        //getLocation()
      System.out.println(driver.findElement(By.id("nav-logo-sprites")).getLocation());


Point p=driver.findElement(By.id("nav-logo-sprites")).getLocation();
System.out.println(p.x);
System.out.println(p.y);

//getAttribute
String a=driver.findElement(By.id("nav-logo-sprites")).getAttribute("class");
System.out.println(a);

//gatTagName()
String b=driver.findElement(By.id("nav-logo-sprites")).getTagName();
System.out.println(b);

        driver.quit();
    }
}
