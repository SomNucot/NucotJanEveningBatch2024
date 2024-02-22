package OOPSConcept.com;

public class MethodoverloadingDemo {
	
	//->Method overloading will happen with in the single class
	//If class contains multiple methods that method names should be same
	//arguments(parameters) order should be different
	//number of arguments should different
	
	//syntax
	/*
	 * data_type method_name()
	 * {
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	
	
	void add(int a,int b)
	{
		int t1=a+b;
		System.out.println(t1);
		
	}
	
	void add(int a,char c)
	{
		int t1=a+c;
		System.out.println(t1);
		
	}

	void add(String a,char c)
	{
		String t1=a+c;
		System.out.println(t1);
		
	}
	
	void add(int a,int b,int c)
	{
		int t2=a+b+c;
		System.out.println(t2);
		
	}
	
	void add(int a,int b,int c,int d)
	{
		int t3=a+b+c+d;
		System.out.println(t3);
		
	}
	
	void add(int a,int b,int c,int d,int e)
	{
		int t4=a+b+c+d+e;
		System.out.println(t4);
		
	}
	
	

	public static void main(String[] args) {
		
		MethodoverloadingDemo obj=new MethodoverloadingDemo();
		
		obj.add(10, 5);
	
		obj.add(10, 10, 10);
		
		obj.add(10, 10, 10,10);
		
		obj.add(10, 10, 10,10,10);
		
		obj.add(10, 'a');
		
		obj.add("Modi", 'a');
		
		

	}

}
