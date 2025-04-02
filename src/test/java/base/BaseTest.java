package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
// import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	protected static WebDriver d;
	public static Properties prop = new Properties();
	public static FileReader fre ;
	
	@BeforeTest
	public void setUp() throws IOException {
		if(d== null) {
			//  WebDriverManager.chromedriver().setup();
			System.out.println(System.getProperty("user.dir"));
			 fre = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\config.properties");
			prop.load(fre);
			System.out.println("insert driver");
			System.out.println(prop.getProperty("browser"));
		}
		
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			d= new ChromeDriver();
			
			d.manage().window().maximize();
			
		}
			else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			d= new ChromeDriver();
		}   else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			d= new ChromeDriver();
		}
		
	}
	
	@AfterTest
	public void tearDown() {
		d.close();
	}
}
