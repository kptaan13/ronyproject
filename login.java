package rohan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\5561966\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//test case 1 for right username and password
		
		String expurl = "https://www.demo.guru99.com/V4/manager/Managerhomepage.php";
		driver.get("https://www.demo.guru99.com/V4/");
		String username = "mngr490137";
		String password = "urYrAjU";
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		String acturl = driver.getCurrentUrl();
		if(expurl.equals(acturl)) {
			System.out.println("Test 1 is passed");
		}
		else {
			System.out.println("Test is failed");
		}

		//test case 2 for wrong password and username
		
		driver.get("https://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("qwijdqkd");
		driver.findElement(By.name("password")).sendKeys("loajwqn");
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().alert().accept();
		String acturl1 = driver.getCurrentUrl();
		if(expurl.equals(acturl1)) {
			System.out.println("Test 2 is failed");
		}
		else {
			System.out.println("Test 2 is passed");
		}
		driver.quit();
        }
}
