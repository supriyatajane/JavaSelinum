
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {
    public static void main(String args[])throws InterruptedException{
        //valid login
        //arrange
        ChromeDriver driver=new ChromeDriver();

        //action
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(5000);//wait in webelement
//        WebElement username=driver.findElement(By.cssSelector("input[name=\"username\"]"));
//        WebElement password=driver.findElement(By.cssSelector("input[name=\"password\"]"));
//        WebElement submitBtn=driver.findElement(By.cssSelector("button[type=\"submit\"]"));
//        username.sendKeys("Admin");
//        password.sendKeys("admin123");
//        submitBtn.click();

        //Assert
//        WebElement dashboard=driver.findElement(By.cssSelector("img[alt=\"client brand banner\"]"));
//        boolean logo=dashboard.isDisplayed();
//        if(logo)
//        {
//            System.out.println("testcase pass");
//        }
//        else{
//            System.out.println("testcase fail");
//        }
//
//        driver.quit();


//		WebElement ele = driver.findElement(By.cssSelector("div[class = \"oxd-alert-content oxd-alert-content--error\"]"));
//
//		if(ele.isDisplayed()) {
//			System.out.println("Testcase pass");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}
//		driver.quit();

        //testcase 3

        driver.findElement(By.cssSelector("p[class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();
//
        String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("requestPasswordResetCode")) {
			System.out.println("testcase pass");
	}
		else {
			System.out.println("testcase fail");
		}
		driver.quit();

    }
}
