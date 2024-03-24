package ExceptionHandlindConcept.com;

public class ExpectionDemo4 {

	int a;

	public static void main(String[] args) {
		ExpectionDemo4  obj=new ExpectionDemo4();
		obj=null;
		try
		{
			System.out.println(obj.a=10);
		}
		catch(Exception e)
		{
			System.out.println("NE is coming");
		}
		finally {
			
			System.out.println("Close all the connections");
		
		}
		System.out.println("Thanks");

	}

}
