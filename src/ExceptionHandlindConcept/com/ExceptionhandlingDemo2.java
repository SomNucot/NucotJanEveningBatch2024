package ExceptionHandlindConcept.com;

public class ExceptionhandlingDemo2 {

	
	public int div(int a,int b)
	{
		int c=-1;
		try
		{
			 c=a/b;///--->AE-->if b=0
		}
		catch(ArithmeticException ae)
		{
			
			System.out.println("AE is coming");
			//ae.printStackTrace();
				
		}
		return c;
	}
	
	
	public static void main(String[] args) {
		
		ExceptionhandlingDemo2 obj=new ExceptionhandlingDemo2();
		int d=obj.div(6, 0);
		System.out.println();
		
		

	}

}
