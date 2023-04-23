package rohan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class new_customer {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\5561966\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String customer_name = "rohan";
		String dob = "06172003";
		String address = "1069 rue duguay";
		String city = "Montreal";
		String state = "Quebec";
		String pin = "123456";
		String phone = "5144381200";
		String email = "rohan91@gmail.com";
		String password = "asdfghjkl";
		driver.get("https://www.demo.guru99.com/V4/manager/addcustomerpage.php");
		driver.findElement(By.name("name")).sendKeys(customer_name);
		driver.findElement(By.name("dob")).sendKeys(dob);
		driver.findElement(By.name("addr")).sendKeys(address);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("pinno")).sendKeys(pin);
		driver.findElement(By.name("telephoneno")).sendKeys(phone);
		driver.findElement(By.name("emailid")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
	}

}
