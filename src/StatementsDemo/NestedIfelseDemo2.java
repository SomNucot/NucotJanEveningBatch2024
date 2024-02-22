package StatementsDemo;

public class NestedIfelseDemo2 {

	public static void main(String[] args) {
		
		//==(conditional ) and =(assignment)
				
			/*int a=20;
				int b=20;
				if(a==b)
				{
					
					System.out.println("a is  equal to b");
					
					
				}
				else
				{
					System.out.println("a is not equal to b");
				}
			*/	
		
		
		System.out.println("Launch the browser");

		String browserName="edge";
		
		if(browserName.equals("chrome"))
		{
			System.out.println("Launch Chrome browser");
			
		}
		else if(browserName.equals("firefox"))
		{
			System.out.println("Launch Firefox browser");
			
		}
		else if(browserName.equals("edge"))
		{
			System.out.println("Launch Edge browser");
			
		}
		else if(browserName.equals("ie"))
		{
			System.out.println("Launch IE browser");
			
		}
		else if(browserName.equals("safari"))
		{
			System.out.println("Launch Safari browser");
			
		}
		else
		{
			System.out.println("Pass the right browser name");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
