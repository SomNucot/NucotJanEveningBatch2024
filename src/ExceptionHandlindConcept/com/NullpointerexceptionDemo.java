package ExceptionHandlindConcept.com;

public class NullpointerexceptionDemo {

	int a;
	
	
	
	public static void main(String[] args) {
		
		NullpointerexceptionDemo obj=new NullpointerexceptionDemo();
		obj=null;

		try
		{
			obj.a=10;
		}
		catch(NullPointerException npe)
		{
			System.out.println("NPE is coming");
			//npe.printStackTrace();
			
		}

		System.out.println("Thanks");
		
		try
		{
				int i=10/0;
		}
		catch(ArithmeticException ae)
		{
			
			System.out.println("AE is coming");
			//ae.printStackTrace();
				
		}
		
		System.out.println("Bye");
		
		
		
		
		
	}

}
