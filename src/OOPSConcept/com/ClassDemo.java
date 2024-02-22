package OOPSConcept.com;

public class ClassDemo {

	
	//class variables or global variables
	
	int a=10;
	final int b=10;
	static int c=30;
	
	 //1.Methods
	//Method declaration
	/*
	 * data_type method_name();
	 * example 
	 * 
	 * int add();
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
    //method definition
	
	/*
	 * 
	 		data_type method_name()
	 		{
	 		
	 				//body
	 		
	 		}
	 * example 
	 * 
	 * int add()
	 * {
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	
	// a)normal methods
		
	
	//1.Methods-->class data members
	
		//1. No Return type and No Input
	
		/*
		 * data_type method_Name()
		 * {
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
	
	void test1()
	{
		System.out.println("Test1");
		
	}
	
	
	//2. some Return type and No Input
	
			/*
			 * data_type method_Name()
			 * {
			 * 
			 * 
			 * 
			 * }
			 * 
			 * 
			 * 
			 * 
			 */
	
	int test2()
	{
		
		System.out.println("test");
		//local variables
		int aa=10;
		int bb=20;
		int cc=aa+bb;
		return cc;
		
	}
	
	//3. some Return type and some Input
	
	/*
	 * data_type method_Name(inputs)
	 * {
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 */
	
	int mul(int dd,int ff)
	{
		
		int zz=dd*ff;
		
		return zz;
		
		
		
	}
	
	//4. No Return type and some Input
	
		/*
		 * data_type method_Name(inputs)
		 * {
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
		
	void sub(int ii,int jj)
	{
		int hh=ii-jj;
		System.out.println(hh);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//object creation
		/*
		 * 
		 * class_name obj_name=new class_name();
		 * 
		 * 
		 * 
		 * 
		 */
		
		ClassDemo obj=new ClassDemo();
		//how to call class variables-->syntax is objtect_name.variable_name
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		
		//how to execute method 
		
		//syntax:-->object_name.methodname();
		
		
		obj.test1();
		
		int result=obj.test2();
		
		System.out.println(result);
		
		int mulresult=obj.mul(3,5);
		System.out.println(mulresult);
		
		
		obj.sub(10, 5);
		
		
		
		

	}

}
