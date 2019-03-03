package Demo;

import javax.servlet.http.WebConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ambika\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Hello");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.firstcry.com");
		driver.manage().window().maximize();
		

	}

}
