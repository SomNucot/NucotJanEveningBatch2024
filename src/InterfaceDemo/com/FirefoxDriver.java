package InterfaceDemo.com;

public class FirefoxDriver  implements WebDriver{

	@Override
	public void get(String url) {
		System.out.println("Open the application in firefox");
		
	}

	@Override
	public void click(String element) {
		System.out.println("click on the element in firefox");
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Pass the value to the input box in firefox");
		
	}

	@Override
	public void close() {
		System.out.println("close the application in firefox");
	}

	@Override
	public void findelement() {
		// TODO Auto-generated method stub
		
	}

}
