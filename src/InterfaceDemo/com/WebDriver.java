package InterfaceDemo.com;

public interface WebDriver extends SearchContext{
	
	
	public void get(String url);
	public void click(String element);
	public void sendKeys(String element,String value);
	public void close();
	@Override	
	public void findelement();

}
