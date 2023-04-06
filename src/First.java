
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class First {


    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        System.setProperty("web-driver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");

        //open browser

        // open url

        // enter username

        // enter password

        // click on login

        // validate


        //A -- Arrange

        //Webdriver --- Interface -----> chromeDriver / FireFox/

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        ///A - Action
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        //A - Assertion
        Thread.sleep(3000);
        boolean logo = driver.findElement(By.cssSelector("img[alt='client brand banner']")).isDisplayed();
        if(logo) {
            System.out.println("Testcase pass");
        }
        else {
            System.out.println("Testcase fail");
        }

        driver.close();


    }
}
