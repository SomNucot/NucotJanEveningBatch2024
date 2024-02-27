package InterfaceDemo.com;

/*
 * syntax-->It contains only un-implemented methods
 * 
 * 
 * inteface interface_name
 * {
 * 
 * }
 * 
 * 
 * 
 * 
 */

public interface InterfaceConceptDemo {
	
	
	//it contains only prototype methods (unimplemented methods)
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();
	

}

class SSS implements InterfaceConceptDemo
{
	
	public void test1()
	{
		System.out.println("Test1");
	}
	public void test2()
	{
		System.out.println("Test2");
	}
	
	public void test3()
	{
		System.out.println("Test3");
	
	}
	
	
	
}










