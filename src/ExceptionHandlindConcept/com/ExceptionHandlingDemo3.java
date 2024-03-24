package ExceptionHandlindConcept.com;

public class ExceptionHandlingDemo3 {

	public static void main(String[] args) {
		
		
		try
		{
			int i=10/0;
			
		}
		catch(Exception e)
		{
			System.out.println("AE is coming");
		}
		finally
		{
			
			System.out.println("This will be exceuted always");
		}
		
		
		
		
		
		

	}

}
