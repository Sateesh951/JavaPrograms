import java.util.ArrayList;
import java.util.List;

interface webdriver {
			
	default void find() {
		System.out.println("find elements");
	}
	default void xpath() {
		System.out.println("xpath");
	}
}

class chromedriver implements webdriver,takescreenshot{
	void driver() {
		System.out.println("chromedriver");
	}
	void chromiumdriver() {
		System.out.println("chromium driver");
	}
}

interface takescreenshot {
	default void takesscreen() {
		System.out.println("Taking screen shot");
	}
}

public class TypeCastingExample {

	public static void main(String[] args) {
		
		webdriver d = new chromedriver();
		d.find();
		d.xpath();
		chromedriver dr = new chromedriver();
		dr.find();
		dr.chromiumdriver();
		dr.xpath();
		dr.driver();
		chromedriver t = new chromedriver();
		takescreenshot ts = (takescreenshot) t;
		ts.takesscreen();
		
		webdriver driver = new chromedriver();
		chromedriver da = (chromedriver) driver;
		da.find();
		da.chromiumdriver();
		da.driver();
		da.xpath();
		

	}
}
